

package com.example.jaskirat.pec;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;

public class EnterSID extends AppCompatActivity {

    EditText sid;
    String  name,imageUrl;



    public void register(View v){


        sid=(EditText)findViewById(R.id.sid);
        if(sid.getText().toString().matches(""))
        {
            Toast.makeText(this,"Please Enter Sid",Toast.LENGTH_LONG).show();

        }else{


            Intent intent=new Intent(this,HomeActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("imageUrl",imageUrl );
            intent.putExtra("sid",sid.getText().toString());
            startActivity(intent);
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_sid);


        Bundle inBundle = getIntent().getExtras();
        name = inBundle.get("name").toString();
        //String  surname = inBundle.get("surname").toString();
        imageUrl = inBundle.get("imageUrl").toString();
    }
}
