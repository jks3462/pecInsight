package com.example.jaskirat.pec;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class marksHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "pecinsight";
    private static final String TABLE = "marksData";
    private static final String sid = "sid";
    private static final String club_name = "club_name";
    private static final String club_id = "club_id";
    private static final String student_name = "student_name";
    private static final String branch = "branch";
    private static final String marks_1 =  "marks_1";
    private static final String marks_2 = "marks_2";
    private static final String marks_3 = "marks_3";
    private static final String marks_4 = "marks_4";
    public marksHandler(Context context)
    {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_TABLE = "CREATE TABLE " + TABLE + "("
                + sid + " TEXT," + club_name + " TEXT,"
                + club_id + " TEXT," + student_name + " TEXT,"
                 + branch + " TEXT,"
                + marks_1 + " TEXT," + marks_2 + " TEXT,"
                + marks_3 + " TEXT," + marks_4 + " TEXT);";
        db.execSQL(CREATE_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
    public void addMarksForm(marksData data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(sid, data.getSid());
        values.put(club_name, data.getclub_name());
        values.put(club_id, data.getClub_id());
        values.put(student_name, data.getStudent_name());
        values.put(branch, data.getBranch());
        values.put(marks_1, data.getMarks_1());
        values.put(marks_2, data.getMarks_2());
        values.put(marks_3, data.getMarks_3());
        values.put(marks_4, data.getMarks_4());
        db.insert(TABLE, null, values);
        db.close();
    }
    public int updateForm(marksData data) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(club_name, data.getclub_name());
        values.put(club_id, data.getClub_id());
        values.put(student_name, data.getStudent_name());
        values.put(branch, data.getBranch());
        values.put(marks_1, data.getMarks_1());
        values.put(marks_2, data.getMarks_2());
        values.put(marks_3, data.getMarks_3());
        values.put(marks_4, data.getMarks_4());
        return db.update(TABLE, values, sid + "= ?", new String[]
                {
                        String.valueOf(data.getSid())
                });
    }
}
