package com.example.jaskirat.pec;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubHome extends AppCompatActivity {
    TextView NameOfStudent;
    TextView clubName;
    ImageView clubImage;
    TextView clubDescription;
    Button applyButton;

    public void applyForCertificate(View v){
        Intent i= new Intent(this,applyForm.class);
        clubName = (TextView)findViewById(R.id.clubName);
        NameOfStudent= (TextView)findViewById(R.id.studentname);
        i.putExtra("clubname",clubName.getText());
        i.putExtra("studentname",NameOfStudent.getText());
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_home);

        Bundle inBundle = getIntent().getExtras();
        String  name = inBundle.get("clubname").toString();
       String  Description = inBundle.get("description").toString();
        String studentName = inBundle.get("studentname").toString();
        byte[] byteArray = getIntent().getByteArrayExtra("imagebyte");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        NameOfStudent= (TextView) findViewById(R.id.studentname);
        NameOfStudent.setText(studentName);
        clubDescription=(TextView)findViewById(R.id.description);
        clubDescription.setText(Description);
        clubName= (TextView) findViewById(R.id.clubName);
        clubName.setText(name);
        clubImage= (ImageView) findViewById(R.id.clubImage);
        clubImage.setImageBitmap(bmp);

        applyButton= (Button) findViewById(R.id.button_apply);
    }
}
