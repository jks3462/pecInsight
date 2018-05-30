package com.example.jaskirat.pec;
public class marksData {
    String sid;
    String club_name;
    String club_id;
    String student_name;
    String branch;
    String marks_1;
    String marks_2;
    String marks_3;
    String marks_4;
    public marksData()
    {

    }
    public marksData(String sid, String club_name, String club_id, String student_name, String branch, String marks_1, String marks_2, String marks_3, String marks_4)
    {
        this.sid = sid;
        this.club_name = club_name;
        this.club_id = club_id;
        this.branch = branch;
        this.student_name = student_name;
        this.marks_1 = marks_1;
        this.marks_2 = marks_2;
        this.marks_3 = marks_3;
        this.marks_4 = marks_4;
    }
    public String getSid(){ return this.sid;}
    public String getclub_name() {return this.club_name;}
    public String getClub_id(){return this.club_id; }
    public String getBranch(){return this.branch;}
    public String getStudent_name() {return this.student_name;}
    public String getMarks_1(){return this.marks_1;}
    public String getMarks_2(){return this.marks_2;}
    public String getMarks_3() {return this.marks_3;}
    public String getMarks_4(){return this.marks_4;}
    public void setSid(String sid) {this.sid = sid; }
    public void setClub_name(String club_name){this.club_name = club_name;}
    public void setClub_id(String club_id){this.club_id = club_id;}
    public void setBranch(String branch){this.branch = branch;}
    public void setStudent_name(String student_name){this.student_name = student_name;}
    public void setMarks_1(String marks_1){this.marks_1 = marks_1;}
    public void setMarks_2(String marks_2){this.marks_2 = marks_2;}
    public void setMarks_3(String marks_3){this.marks_3 = marks_3;}
    public void setMarks_4(String marks_4){this.marks_4 = marks_4;}
}
