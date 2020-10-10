import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import Model.RequestSQL;


public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(@Nullable Context context) {
        super(context, RequestSQL.dataBaseName, null   , 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {


        db.execSQL(RequestSQL.Create.createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
