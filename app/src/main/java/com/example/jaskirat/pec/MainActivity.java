package com.example.jaskirat.pec;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.login.LoginManager;

import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
       System.exit(0);

    }


    public void navigate (View v)
    {
        Intent intent= new Intent( this, HomeActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button) findViewById(R.id.button);

        Bundle inBundle = getIntent().getExtras();
       String  name = inBundle.get("name").toString();
        String  surname = inBundle.get("surname").toString();
        String imageUrl = inBundle.get("imageUrl").toString();


      TextView nameView = (TextView)findViewById(R.id.nameAndSurname);
        nameView.setText("" + name + " " + surname);
        new DownloadImage((ImageView)findViewById(R.id.profileImage)).execute(imageUrl);

        Button logout = (Button)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginManager.getInstance().logOut();
                Intent login = new Intent(getApplicationContext(), fbLoginActivity.class);
                startActivity(login);
                finish();

            }
        });
    }
}
