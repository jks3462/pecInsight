package com.example.jaskirat.pec;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by bhavya on 26/3/17.
 */
public class DataBaseHandler extends SQLiteOpenHelper {
    /*
    int sid;
    String student_name;
    String father_name;
    String institute;
    String ins_type;
    String phoneNumber;
    String student_email;
    String gender;
    */
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "pecinsight";
    private static final String TABLE = "formData";
    private static final String sid = "sid";
    private static final String club_name = "club_name";
    private static final String club_id = "club_id";
    private static final String student_name = "student_name";
    private static final String father_name = "father_name";
    private static final String branch = "branch";
    private static final String current_year = "current_year";
    private static final String activity_year = "activity_year";
    private static final String activity_type = "activity_type"; //Whether achivement or participation or organising
    private static final String institute_type = "ins_type"; //if a or p then institute type
    private static final String audience = "audience";
    private static final String image = "image";
    private static final String description = "description";
    private static final String verified = "verified";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE + "("
                + sid + " TEXT," + club_name + " TEXT,"
                + club_id + " TEXT," + student_name + " TEXT,"
                + father_name + " TEXT," + branch + " TEXT,"
                + current_year + " TEXT," + activity_year + " TEXT,"
                + activity_type + " TEXT," + institute_type + " TEXT,"
                + audience + " TEXT," + image + " BLOB,"
                + description + " TEXT," +verified+" TEXT);";
        db.execSQL(CREATE_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);

        // Create tables again
        onCreate(db);
    }

    public void addNewForm(formData data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(sid, data.getSid());
        values.put(club_name, data.getClubName());
        values.put(club_id, data.getClubId());
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
        db.insert(TABLE, null, values);
        db.close();
    }

    public formData getStudentData(String c_name) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE, new String[]{sid, club_name, club_id, student_name, father_name,
                        branch, current_year, activity_year, activity_type, institute_type, audience, image, description,verified}, c_name + "=?",
                new String[]{String.valueOf(c_name)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
        formData data = new formData(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3),
                cursor.getString(4), cursor.getString(5), cursor.getString(6), cursor.getString(7), cursor.getString(8),
                cursor.getString(9), cursor.getString(10), cursor.getBlob(11), cursor.getString(12),cursor.getString(13));
        return data;
    }


    public List<formData> getSpecificClubData(String c_name)
    {
        List<formData> formList = new ArrayList<formData>();
        String selectQuery = "SELECT * FROM " + TABLE +" WHERE " +club_name +" = '"+c_name+"'; " ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                formData data = new formData();
                data.setSid(cursor.getString(0));
                data.setClubName(cursor.getString(1));
                data.setClubId(cursor.getString(2));
                data.setStudentName(cursor.getString(3));
                data.setFatherName(cursor.getString(4));
                data.setBranch(cursor.getString(5));
                data.setCurrentYear(cursor.getString(6));
                data.setActivityYear(cursor.getString(7));
                data.setActivityType(cursor.getString(8));
                data.setInstituteType(cursor.getString(9));
                data.setAudience(cursor.getString(10));
                data.setImagePath(cursor.getBlob(11)); //beware: blob here
                data.setDescription(cursor.getString(12));
                data.setVerified(cursor.getString(13));
                formList.add(data);
            } while (cursor.moveToNext());
        }
        return formList;
    }


    public List<formData> getAllformData() {
        List<formData> formList = new ArrayList<formData>();
        String selectQuery = "SELECT * FROM " + TABLE;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                formData data = new formData();
                data.setSid(cursor.getString(0));
                data.setClubName(cursor.getString(1));
                data.setClubId(cursor.getString(2));
                data.setStudentName(cursor.getString(3));
                data.setFatherName(cursor.getString(4));
                data.setBranch(cursor.getString(5));
                data.setCurrentYear(cursor.getString(6));
                data.setActivityYear(cursor.getString(7));
                data.setActivityType(cursor.getString(8));
                data.setInstituteType(cursor.getString(9));
                data.setAudience(cursor.getString(10));
                data.setImagePath(cursor.getBlob(11));
                data.setDescription(cursor.getString(12));
                data.setVerified(cursor.getString(13));
                formList.add(data);
            } while (cursor.moveToNext());
        }
        return formList;
    }

    public int updateForm(formData data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(club_name, data.getClubName());
        values.put(club_id, data.getClubId());
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
        return db.update(TABLE, values, sid + "= ?", new String[]
                {
                        String.valueOf(data.getSid())
                });
    }

    public int getformsCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        String countQuery = "SELECT * FROM " + TABLE;
        Cursor cursor = db.rawQuery(countQuery,null);
        cursor.close();
        return cursor.getCount();
    }
}








