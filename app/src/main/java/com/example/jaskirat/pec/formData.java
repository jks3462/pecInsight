package com.example.jaskirat.pec;

/**
 * Created by bhavya on 26/3/17.
 */
//private static final String sid = "sid";
//private static final String club_name = "club_name";
//private static final String club_id = "club_id";
//private static final String student_name = "student_name";
//private static final String father_name = "father_name";
//private static final String branch = "branch";
//private static final String current_year = "current_year";
//private static final String activity_year = "activity_year";
//private static final String activity_type = "activity_type"; //Whether achivement or participation or organising
//private static final String institute_type = "ins_type"; //if a or p then institute type
//private static final String audience = "audience";

public class formData {
    String sid;
    String club_name;
    String club_id;
    String student_name;
    String father_Name;
    String branch;
    String current_year;
    String activity_year;
    String activity_type;
    String institute_type;
    String audience;
    byte[] imagePath;
    String description;
    String verified;
    public formData()
    {

    }//private static final String sid = "sid";
//private static final String club_name = "club_name";
//private static final String club_id = "club_id";
//private static final String student_name = "student_name";
//private static final String father_name = "father_name";
//private static final String branch = "branch";
//private static final String current_year = "current_year";
//private static final String activity_year = "activity_year";
//private static final String activity_type = "activity_type"; //Whether achivement or participation or organising
//private static final String institute_type = "ins_type"; //if a or p then institute type
//private static final String audience = "audience"

    public  formData (formData fm)
    {
        this.sid = fm.sid;
        this.student_name = fm.student_name;
               this.club_name = fm.club_name;
        this.club_id= fm.club_id;
        this.father_Name = fm.father_Name;
        this.branch = fm.branch;
        this.current_year = fm.current_year;
        this.activity_year = fm.activity_year;
        this.activity_type = fm.activity_type;
        this.institute_type = fm.institute_type;
        this.audience = fm.audience;
        this.imagePath = fm.imagePath;
        this.description = fm.description;
        this.verified = fm.verified;
    }

    public formData(String sid, String club_name,String club_id,  String student_name, String father_name ,String branch, String current_year, String activity_year, String activity_type, String institute_type,  String audience,byte[] image,String description, String verified)
    {
        this.sid = sid;
        this.student_name = student_name;
        this.father_Name = father_name;
        this.club_name = club_name;
        this.club_id= club_id;
        this.father_Name = father_name;
        this.branch = branch;
        this.current_year = current_year;
        this.activity_year = activity_year;
        this.activity_type = activity_type;
        this.institute_type = institute_type;
        this.audience = audience;
        this.imagePath = image;
        this.description = description;
        this.verified = verified;
    }
    public String getSid()
    {
        return this.sid;
    }
    public String getClubId()
    {
        return this.club_id;
    }
    public String getClubName()
    {
         return  this.club_name;
    }
    public String getStudentName()
    {
        return this.student_name;
    }
    public String getFatherName()
    {
        return this.father_Name;
    }
    public String getBranch()
    {
        return this.branch;
    }
    public String getCurrentYear()
    {
        return this.current_year;
    }
    public String getActivityYear()
    {
        return this.activity_year;
    }
    public String getActivityType()
    {
        return this.activity_type;
    }
    public  String getInstituteType()
    {
        return this.institute_type;
    }
    public String getAudience()
    {
        return this.audience;
    }
    public byte[] getImagePath()
    {
        return this.imagePath;
    }
    public String getDescription()
    {
        return this.description;
    }
    public String getVerified() {return this.verified;}
    public void setSid(String sid)
    {
        this.sid = sid;
    }
    public void setClubId(String clubId)
    {
        this.club_id = clubId;
    }
    public void setClubName(String clubName)
    {
        this.club_name = clubName;
    }
    public void setStudentName(String studentName)
    {
        this.student_name = studentName;
    }
    public void setFatherName(String fatherName)
    {
        this.father_Name = fatherName;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public void setCurrentYear(String current_year)
    {
        this.current_year = current_year;
    }
    public void setActivityYear(String activity_year)
    {
        this.activity_year = activity_year;
    }
    public void setActivityType(String activity_type)
    {
        this.activity_type = activity_type;
    }
    public void setInstituteType(String institute_type)
    {
        this.institute_type = institute_type;
    }
    public void setAudience(String audience)
    {
        this.audience = audience;
    }
    public void setImagePath(byte[] imagePath)
    {
        this.imagePath = imagePath;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public void setVerified(String verified){this.verified = verified;}

}
