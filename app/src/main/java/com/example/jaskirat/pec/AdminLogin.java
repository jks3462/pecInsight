package com.example.jaskirat.pec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class AdminLogin extends AppCompatActivity {


    public void loginadmin(View v){
        Intent i= new Intent(this,AdminHome.class);
        startActivity(i);
    }


    ImageView adminlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        adminlogin=(ImageView) findViewById(R.id.alogin);
    }
}
