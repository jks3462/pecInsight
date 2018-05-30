package com.example.jaskirat.pec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class MyActivities extends AppCompatActivity {
TextView activities;
    String text;
    String refinedtext, activityType="N.A.",verified="Not Verified",instituteType="N.A.",audience="N.A.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activities);
        activities = (TextView)findViewById(R.id.activities);
        DataBaseHandler db = new DataBaseHandler(this);
        List<formData> data = db.getAllformData();
        text = "";
        refinedtext= "";
        for(formData f :data)
        {
            text = text +"\n"+f.getClubName() +"\n"+f.getBranch()+"\n"+f.getCurrentYear() +"\n"+f.getActivityType()+"\n"+f.getActivityYear()+"\n"+f.getInstituteType() + "\n" + f.getVerified();
            if(Integer.parseInt(f.getActivityType())==1)
            {
                activityType="Achievement";

                if(Integer.parseInt(f.getInstituteType())==0)
                {
                    instituteType="PEC and others";

                }else if(Integer.parseInt(f.getInstituteType())==1){
                    instituteType="IITs,IIMs";
                }else if(Integer.parseInt(f.getInstituteType())==2){
                    instituteType="International";
                }

            }else if(Integer.parseInt(f.getActivityType())==2){
                activityType="Participation";


                if(Integer.parseInt(f.getInstituteType())==0)
                {
                    instituteType="PEC and others";

                }else if(Integer.parseInt(f.getInstituteType())==1){
                    instituteType="IITs,IIMs";
                }else if(Integer.parseInt(f.getInstituteType())==2){
                    instituteType="International";
                }

            }else if(Integer.parseInt(f.getActivityType())==3) {
                activityType = "Organizing";


                if (Integer.parseInt(f.getAudience()) == 0) {
                    audience = ">=250";

                } else if (Integer.parseInt(f.getAudience()) == 1) {
                    audience = "<250";
                }
                }

            if(Integer.parseInt(f.getVerified())==1) {

            verified="Verified Successfully";
            }

            if(Integer.parseInt(f.getActivityType())==1 || Integer.parseInt(f.getActivityType())==2) {
                refinedtext = refinedtext + "\nCLUB :" + f.getClubName() + "\nBRANCH :" + f.getBranch() + "\nCURRENT YEAR :" + f.getCurrentYear() + "\nACTIVITY TYPE :" + activityType + "\nACTIVITY YEAR :" + f.getActivityYear() + "\nINSTITUTE TYPE :" + instituteType + "\nVERIFICATION :" + verified + "\n\n";
            }
           else if(Integer.parseInt(f.getActivityType())==3)
        {
            refinedtext = refinedtext + "\nCLUB :" + f.getClubName() + "\nBRANCH :" + f.getBranch() + "\nCURRENT YEAR :" + f.getCurrentYear() + "\nACTIVITY TYPE :" + activityType + "\nACTIVITY YEAR :" + f.getActivityYear() + "\nAUDIENCE :" + audience + "\nVERIFICATION :" + verified + "\n\n";

        }
        }


        activities.setText(refinedtext);
    }
}
