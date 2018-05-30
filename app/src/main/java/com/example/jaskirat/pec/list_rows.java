package com.example.jaskirat.pec;

import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class list_rows extends RecyclerView.Adapter<list_rows.MyViewHolder> {

    private List<formData> myList;
    public Button b;
    public static OnbuttonClickListener ORDER_DETAILS_LISTENER;

    /*
    club_id, data.getClubId());
        values.put(student_name, data.getStudentName());
        values.put(father_name, data.getFatherName());
        values.put(branch, data.getBranch());
        values.put(current_year, data.getCurrentYear());
        values.put(activity_year, data.getActivityYear());
        values.put(activity_type, data.getActivityType());
        values.put(institute_type, data.getInstituteType());
        values.put(audience, data.getAudience());
        values.put(image, data.getImagePath());
        values.put(description, data.getDescription());
        values.put(verified,data.getVerified());
     */


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView student_name;
        public TextView branch;
        public TextView current_year;
        public TextView activity_type;
        public TextView institute_type;
        public TextView audience;
        public ImageView image;
        public TextView verified;
        public TextView clubname;
        public TextView studentid;
public  Button b;


        public MyViewHolder(View view) {
            super(view);
            b=(Button) view.findViewById(R.id.bid);
            clubname = (TextView) view.findViewById(R.id.clubname);
            student_name = (TextView) view.findViewById(R.id.studentname);
            branch = (TextView) view.findViewById(R.id.branch);
            current_year = (TextView) view.findViewById(R.id.cyear);
            activity_type = (TextView) view.findViewById(R.id.actype);
            institute_type = (TextView) view.findViewById(R.id.itype);
            audience = (TextView) view.findViewById(R.id.audience);
            image = (ImageView) view.findViewById(R.id.imageproof);
            verified = (TextView) view.findViewById(R.id.verify);
            studentid = (TextView) view.findViewById(R.id.sid);
           b.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   int potn=getLayoutPosition();
                   if( ORDER_DETAILS_LISTENER!= null)
                       ORDER_DETAILS_LISTENER.onbuttonClick(potn,view);
               }
           });



        }


    }



    public interface OnbuttonClickListener {
        void onbuttonClick(int position, View itemview);
    }

    public void setbuttonClickListener(list_rows.OnbuttonClickListener listener) {
        ORDER_DETAILS_LISTENER = listener;
    }


    public list_rows(List<formData> myList) {
        this.myList = myList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_rows, parent, false);

        return new MyViewHolder(itemView);
    }


    /*

      clubname = (TextView) view.findViewById(R.id.clubname);
            branch = (TextView) view.findViewById(R.id.branch);
            current_year = (TextView) view.findViewById(R.id.cyear);
            activity_type = (TextView) view.findViewById(R.id.actype);
            institute_type = (TextView) view.findViewById(R.id.itype);
            audience = (TextView) view.findViewById(R.id.audience);
            image = (ImageView) view.findViewById(R.id.imageproof);
            verified = (TextView) view.findViewById(R.id.verify);
     */


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {


        final formData m = myList.get(position);


        String activityType = "N.A.", verified = "Not Verified", instituteType = "N.A.", audience = "N.A.";

        if (Integer.parseInt(m.getActivityType()) == 1) {
            activityType = "Achievement";

            if (Integer.parseInt(m.getInstituteType()) == 0) {
                instituteType = "PEC and others";

            } else if (Integer.parseInt(m.getInstituteType()) == 1) {
                instituteType = "IITs,IIMs";
            } else if (Integer.parseInt(m.getInstituteType()) == 2) {
                instituteType = "International";
            }

        } else if (Integer.parseInt(m.getActivityType()) == 2) {
            activityType = "Participation";


            if (Integer.parseInt(m.getInstituteType()) == 0) {
                instituteType = "PEC and others";

            } else if (Integer.parseInt(m.getInstituteType()) == 1) {
                instituteType = "IITs,IIMs";
            } else if (Integer.parseInt(m.getInstituteType()) == 2) {
                instituteType = "International";
            }

        } else if (Integer.parseInt(m.getActivityType()) == 3) {
            activityType = "Organizing";


            if (Integer.parseInt(m.getAudience()) == 0) {
                audience = ">=250";

            } else if (Integer.parseInt(m.getAudience()) == 1) {
                audience = "<250";
            }
        }

        if (Integer.parseInt(m.getVerified()) == 1) {

            verified = "Verified Successfully";
        }


//        if(Integer.parseInt(m.getVerified()) == 1)
//        {
//            holder.b.setVisibility(View.GONE);
//        }

        holder.clubname.setText("CLUB NAME : " + m.getClubName());
        holder.branch.setText("BRANCH : " + m.getBranch());
        holder.student_name.setText("STUDENT NAME : " + m.getStudentName());
        holder.studentid.setText("SID : " + m.getSid());
        holder.current_year.setText("CURRENT YEAR : " + m.getCurrentYear());
        holder.activity_type.setText("ACTIVITY TYPE : " + activityType);
        holder.institute_type.setText("INSTITUTE TYPE : " + instituteType);
        holder.audience.setText("AUDIENCE : " + audience);
        holder.image.setImageBitmap(BitmapFactory.decodeByteArray(m.getImagePath(), 0, m.getImagePath().length));
        holder.verified.setText("VERIFICATION : " + verified);

/*

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

            }
        });



*/
    }
    @Override
    public int getItemCount() {
        return myList.size();
    }


}



