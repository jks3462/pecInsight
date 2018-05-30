package com.example.jaskirat.pec;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class applyForm extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView student;
    EditText sid;

    EditText fatherName, description;
    TextView instituteType;
    TextView audienceType;
    private static int RESULT_LOAD = 1;
    String img_Decodable_Str;
    private static final int CAMERA_REQUEST = 1888;
    public static final String STORAGE_PATH_DP= Environment.getExternalStorageDirectory().getAbsolutePath()+"/PECInsight/";
    public static int n=1;
    Spinner branch;
    Spinner year;
    Spinner activityYear, activityType, institutetype, audience;
    Bitmap finalimage;

    public void submitdata(View view){


        DataBaseHandler db= new DataBaseHandler(this);


        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        finalimage.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();


        //   nameStudent;
        sid= (EditText) findViewById(R.id.sid);
        //    clubname;
        //generate club id
        //   nameStudent;
        fatherName= (EditText) findViewById(R.id.father_name);
        branch= (Spinner) findViewById(R.id.spinner1);
        year= (Spinner) findViewById(R.id.spinner);
        activityYear=(Spinner) findViewById(R.id.spinner3);
        activityType=(Spinner) findViewById(R.id.spinner2);
        institutetype=(Spinner)findViewById(R.id.spinner4);
        audience=(Spinner) findViewById(R.id.spinner5);
        //byteArray
        description=(EditText) findViewById(R.id.description);


        db.addNewForm( new formData(sid.getText().toString(),clubname,"1",nameStudent,fatherName.getText().toString(),branch.getSelectedItem().toString(),year.getSelectedItem().toString(),activityYear.getSelectedItem().toString(), Integer.toString(activityType.getSelectedItemPosition()), Integer.toString(institutetype.getSelectedItemPosition()),Integer.toString(audience.getSelectedItemPosition()),byteArray,description.getText().toString(),"0"));
       List<formData> data = db.getAllformData();
        for(formData f :data)
        {
            String log = "Id:" +f.getSid();
            Log.d("Id",log);
        }
        Toast.makeText(this, "Application Submitted Successfully", Toast.LENGTH_LONG).show();
        finish();
    }

    public void cameraopen(View v){
        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(cameraIntent, CAMERA_REQUEST);
    }
    public void loadImagefromGallery(View view) {
        // Create intent to Open Image applications like Gallery, Google Photos
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        // Start the Intent
        startActivityForResult(galleryIntent, RESULT_LOAD);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //for camera button
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            ImageView imgView = (ImageView) findViewById(R.id.imgView1);
            finalimage = (Bitmap) data.getExtras().get("data");
            imgView.setImageBitmap(finalimage);
            imgView.setVisibility(View.VISIBLE);
           // SaveImage(photo);
        }

        try {
            // When an Image is picked
            if (requestCode == RESULT_LOAD && resultCode == RESULT_OK
                    && null != data) {
                // Get the Image from data

                Uri selectedImage = data.getData();
                String[] filePathColumn = {MediaStore.Images.Media.DATA};

                // Get the cursor
                Cursor cursor = getContentResolver().query(selectedImage,
                        filePathColumn, null, null, null);
                // Move to first row
                cursor.moveToFirst();

                int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
                img_Decodable_Str = cursor.getString(columnIndex);
                cursor.close();

                ImageView imgView = (ImageView) findViewById(R.id.imgView1);
                imgView.setVisibility(View.VISIBLE);
                // Set the Image in ImageView after decoding the String
                imgView.setImageBitmap(BitmapFactory
                        .decodeFile(img_Decodable_Str));
                imgView.buildDrawingCache();
                finalimage = imgView.getDrawingCache();
              //  SaveImage(bmap);
            }

//             else {
//                Toast.makeText(this, "Hey pick your image first",
//                        Toast.LENGTH_LONG).show();}

        } catch (Exception e) {
            Toast.makeText(this, "Something went embrassing", Toast.LENGTH_LONG)
                    .show();
        }

    }
    String clubname;
    String nameStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_form);

        Bundle inBundle = getIntent().getExtras();
         clubname=inBundle.get("clubname").toString();
        nameStudent= inBundle.get("studentname").toString();
        student= (TextView) findViewById(R.id.studentName);
      //  club= (TextView) findViewById(R.id.clubName);


        student.setText(nameStudent +" you are applying for "+ clubname);



        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("I");
        categories.add("II");
        categories.add("III");
        categories.add("IV");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);



        // Spinner element
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories1 = new ArrayList<String>();
        categories1.add("CSE");
        categories1.add("ECE");
        categories1.add("Electrical");
        categories1.add("Mechanical");
        categories1.add("Civil");
        categories1.add("Aerospace");
        categories1.add("Materials & Metallurgy");
        categories1.add("Production");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories1);

        // Drop down layout style - list view with radio button
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner1.setAdapter(dataAdapter1);



        // Spinner element
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
    spinner2.setOnItemSelectedListener(this);
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories2 = new ArrayList<String>();
        categories2.add("--Select--");
        categories2.add("Achievement");
        categories2.add("Participation");
        categories2.add("Organising");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);





        // Spinner element
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories3 = new ArrayList<String>();
        categories3.add("2013");
        categories3.add("2014");
        categories3.add("2015");
        categories3.add("2016");
        categories3.add("2017");
        categories3.add("2018");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories3);

        // Drop down layout style - list view with radio button
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner3.setAdapter(dataAdapter3);






        // Spinner element
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories4 = new ArrayList<String>();
        categories4.add("PEC and other");
        categories4.add("Premier Institutes(IITs)");
        categories4.add("International (Outside India)");



        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories4);

        // Drop down layout style - list view with radio button
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner4.setAdapter(dataAdapter4);



        // Spinner element
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);

        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories5 = new ArrayList<String>();
        categories5.add("audience >=250");
        categories5.add("audience <250");




        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories5);

        // Drop down layout style - list view with radio button
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner5.setAdapter(dataAdapter5);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        audienceType=(TextView) findViewById(R.id.audience_Text);
        instituteType=(TextView) findViewById(R.id.institute_Text);
        Spinner spinner4 = (Spinner) findViewById(R.id.spinner4);
        Spinner spinner5 = (Spinner) findViewById(R.id.spinner5);
        String item = parent.getItemAtPosition(position).toString();
        if(position==0 ){
            spinner4.setVisibility(View.GONE);
            instituteType.setVisibility(View.GONE);
            spinner5.setVisibility(View.GONE);
            audienceType.setVisibility(View.GONE);
        }
        if(position==1 || position==2){
            spinner4.setVisibility(View.VISIBLE);
            instituteType.setVisibility(View.VISIBLE);
            spinner5.setVisibility(View.GONE);
            audienceType.setVisibility(View.GONE);
        }
        if(position==3)
        {
            spinner4.setVisibility(View.GONE);
            instituteType.setVisibility(View.GONE);
            spinner5.setVisibility(View.VISIBLE);
            audienceType.setVisibility(View.VISIBLE);
        }
        // Showing selected spinner item
      //  Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}
