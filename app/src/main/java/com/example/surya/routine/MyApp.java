package com.example.surya.routine;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * table structure
 * id/name/phone_no
 */
public class MyApp extends SQLiteOpenHelper {

//create table if not exist contacts(id int
public static final String COL_NAME="name", COL_PHONE="phone_no",COL_ID="id",TABLE_NAME="contacts";
    public static final String TABLE_QUERY = "CREATE TABLE IF NOT EXISTS" +
            "`"+TABLE_NAME+"`(" +
            "`"+COL_ID+"` INTEGER PRIMARY KEY AUTOINCREMENT," +
            "`"+COL_PHONE+"` INTEGER," +
            "`"+COL_NAME+"` TEXT" +
            ");";

    public MyApp(Context context) {
        super(context, "contact_list", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_QUERY);
    }
    //dependenci injection (very important)
    public long addNewUser(String name, int phone)
    {
        ContentValues cv=new ContentValues();
        cv.put(COL_NAME, name);
        cv.put(COL_PHONE,phone);
        return getWritableDatabase().insert(TABLE_NAME,null,cv);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

