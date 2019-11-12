package com.peep.tornado3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseService extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="USA.db";
    public static final String STATE_TABLE_NAME="States_Table";
    public static final String STATE_COL_1="ID";
    public static final String STATE_COL_2="StateName";

    public DatabaseService(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+STATE_TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,STATES_NAME VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+STATE_TABLE_NAME);
        onCreate(db);

    }
}
