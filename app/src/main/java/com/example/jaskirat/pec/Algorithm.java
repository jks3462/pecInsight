package com.example.jaskirat.pec;
public class Algorithm {
    public String sid;
    public String institute_type;
    public String audience;
    public String activity_year;
    public String activity_type;
    public String club_name;
    public int marks_1;
    public int marks_2;
    public int marks_3;
    public int marks_4;

    public Algorithm(String sid, String i_t, String audience, String activity_year, String club_name, String activity_type) {
        this.activity_type = activity_type;
        this.institute_type = i_t;
        this.audience = audience;
        this.activity_year = activity_year;
        this.club_name = club_name;
        this.marks_1 = 0;
        this.marks_2 = 0;
        this.marks_3 = 0;
        this.marks_4 = 0;

    }

    public int CalculateMarks(String activity_year, String activity_type, String institute_type, String audience) {
        if (activity_type.equals("orgranising")) {
            if (activity_year.equals("I")) {
                if (audience.equals(">=250"))
                    marks_1 = marks_1 + 4;
                else
                    marks_1 = marks_1 + 2;
            } else if (activity_year.equals("II")) {
                if (audience.equals(">=250"))
                    marks_2 = marks_2 + 4;
                else
                    marks_2 = marks_2 + 2;
            } else if (activity_year.equals("III")) {
                if (audience.equals(">=250"))
                    marks_3 = marks_3 + 4;
                else
                    marks_3 = marks_3 + 2;
            } else if (activity_year.equals("IV")) {
                if (audience.equals(">=250"))
                    marks_4 = marks_4 + 4;
                else
                    marks_4 = marks_4 + 2;
            }
        } else if (activity_type.equals("participation")) {
            if (activity_year.equals("I")) {
                if (institute_type.equals("PEC"))
                    marks_1 = marks_1 + 1;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_1 = marks_1 + 4;
                else if (institute_type.equals("international"))
                    marks_1 = marks_1 + 6;
            } else if (activity_year.equals("II")) {
                if (institute_type.equals("PEC"))
                    marks_2 = marks_2 + 1;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_2 = marks_2 + 4;
                else if (institute_type.equals("international"))
                    marks_2 = marks_2 + 6;
            } else if (activity_year.equals("III")) {
                if (institute_type.equals("PEC"))
                    marks_3 = marks_3 + 1;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_3 = marks_3 + 4;
                else if (institute_type.equals("international"))
                    marks_3 = marks_3 + 6;
            } else if (activity_year.equals("IV")) {
                if (institute_type.equals("PEC"))
                    marks_4 = marks_4 + 1;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_4 = marks_4 + 4;
                else if (institute_type.equals("international"))
                    marks_4 = marks_4 + 6;
            }
        } else if (activity_type.equals("achievement")) {
            if (activity_year.equals("I")) {
                if (institute_type.equals("PEC"))
                    marks_1 = marks_1 + 2;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_1 = marks_1 + 6;
                else if (institute_type.equals("international"))
                    marks_1 = marks_1 + 8;
            } else if (activity_year.equals("II")) {
                if (institute_type.equals("PEC"))
                    marks_2 = marks_2 + 2;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_2 = marks_2 + 6;
                else if (institute_type.equals("international"))
                    marks_2 = marks_2 + 8;
            } else if (activity_year.equals("III")) {
                if (institute_type.equals("PEC"))
                    marks_3 = marks_3 + 2;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_3 = marks_3 + 6;
                else if (institute_type.equals("international"))
                    marks_3 = marks_3 + 8;
            } else if (activity_year.equals("IV")) {
                if (institute_type.equals("PEC"))
                    marks_4 = marks_4 + 2;
                else if (institute_type.equals("IIT/NIT/IIM/IISC"))
                    marks_4 = marks_4 + 6;
                else if (institute_type.equals("international"))
                    marks_4 = marks_4 + 8;
            }
        }
        if (activity_year.equals("I"))
            return marks_1;
        else if (activity_year.equals("II"))
            return marks_2;
        else if (activity_year.equals("III"))
            return marks_3;
        else if (activity_year.equals("IV"))
            return marks_4;


        return 0;
    }


}
