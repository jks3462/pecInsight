package com.example.jaskirat.pec;


    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.widget.Toast;

    public class DialogActivity extends Activity implements OnClickListener {

        Button ok_btn, cancel_btn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            //getWindow().requestFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_dialog);

            ok_btn = (Button) findViewById(R.id.ok_btn_id);
            cancel_btn = (Button) findViewById(R.id.cancel_btn_id);

            ok_btn.setOnClickListener(this);
            cancel_btn.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.ok_btn_id:
                    Intent intent=new Intent(this,HomeActivity.class);
                    startActivity(intent);
                    showToastMessage("Ok Button Clicked");
                    this.finish();

                    break;

                case R.id.cancel_btn_id:

                    showToastMessage("Cancel Button Clicked");
                    this.finish();

                    break;
            }

        }

        void showToastMessage(String message) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)
                    .show();
        }

    }