package com.example.yopiealamsyah.kuisedukasi;

/**
 * Created by yopie alamsyah on 16/08/2017.
 */
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";
    final static String table_name = "tbl_soal";
    final static String table_name2 = "tbl_soal2";
    final static String table_name3 = "tbl_soal3";


    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + table_name + "(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + table_name2 + "(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + table_name3 + "(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)");

        ContentValues values = new ContentValues();
        values.put("soal", "Apa fungsi gambar bagian tubuh di atas?");
        values.put("pil_a", "Membuat butir - butir darah");
        values.put("pil_b","Memompa darah");
        values.put("pil_c", "tempat menyimpan darah");
        values.put("jwban", "1");
        values.put("img", R.drawable.jantung);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa yang terjadi bila bumi berputar pada porosnya ?");
        values.put("pil_a", "Pergantian tahun");
        values.put("pil_b","Pergantian hari");
        values.put("pil_c", "Gerhana bulan");
        values.put("jwban","1");
        values.put("img", R.drawable.bumi);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Punuk unta berguna untuk?");
        values.put("pil_a", "Menyimpan makanan ");
        values.put("pil_b","Menarik perhatian betina");
        values.put("pil_c", "Mempercantik penampilan");
        values.put("jwban","0");
        values.put("img", R.drawable.unta);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama planet dari gambar di atas?");
        values.put("pil_a", "Pluto");
        values.put("pil_b","Jupiter");
        values.put("pil_c", "Saturnus");
        values.put("jwban","2");
        values.put("img", R.drawable.saturnus);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Kemampuan cicak memutus ekor jika dalam bahaya disebut?");
        values.put("pil_a", "Mimikri ");
        values.put("pil_b","Anatoma ");
        values.put("pil_c", "Onotomi ");
        values.put("jwban","0");
        values.put("img", R.drawable.cicak);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Pegunungan yang tidak terletak di jawa tengah adalah?");
        values.put("pil_a", "Mahameru");
        values.put("pil_b","Dieng");
        values.put("pil_c", "jaya wijaya");
        values.put("jwban","2");
        values.put("img", R.drawable.jawa);
        db.insert("tbl_soal2", "soal", values);

        values.put("soal", "Rumah adat sumatra barat adalah ?");
        values.put("pil_a", "Gadang");
        values.put("pil_b","Baileo");
        values.put("pil_c", "Hanoi");
        values.put("jwban","0");
        values.put("img", R.drawable.gadang);
        db.insert("tbl_soal2", "soal", values);

        values.put("soal", "Senjata traditional provinsi Aceh adalah ?");
        values.put("pil_a", "Keris");
        values.put("pil_b","Rencong");
        values.put("pil_c", "Golok");
        values.put("jwban","1");
        values.put("img", R.drawable.rencong);
        db.insert("tbl_soal2", "soal", values);

        values.put("soal", "Penanaman kembali hutan yang gundul dinamakan ?");
        values.put("pil_a", "Reboisasi");
        values.put("pil_b","Reklamasi");
        values.put("pil_c", "Revitalisasi");
        values.put("jwban","0");
        values.put("img", R.drawable.hutan);
        db.insert("tbl_soal2", "soal", values);

        values.put("soal", "Kegiatan ekonomi yang bertujuan menghasilkan barang dan jasa dinamakan?");
        values.put("pil_a", "Reproduksi");
        values.put("pil_b","Konsumsi");
        values.put("pil_c", "Produksi.");
        values.put("jwban","2");
        values.put("img", R.drawable.produksi);
        db.insert("tbl_soal2", "soal", values);

        values.put("soal", "Siapakah bapak proklamator indonesia ?");
        values.put("pil_a", "B J Habibie");
        values.put("pil_b","Ir Soekarno");
        values.put("pil_c", "Gus dur");
        values.put("jwban","1");
        values.put("img", R.drawable.indonesia);
        db.insert("tbl_soal3", "soal", values);

        values.put("soal", "MPR adalah lembaga tertinggi negara yang dipilih melalui ?");
        values.put("pil_a", "Pemilihan khusus");
        values.put("pil_b","Pemilihan umum");
        values.put("pil_c", "Ditunjuk langsung");
        values.put("jwban","1");
        values.put("img", R.drawable.mpr);
        db.insert("tbl_soal3", "soal", values);

        values.put("soal", "Dalam menjalankan pemerintahan presiden dibantu oleh ?");
        values.put("pil_a", "Ketu DPR");
        values.put("pil_b","Mentri");
        values.put("pil_c", "Hakim agung");
        values.put("jwban","1");
        values.put("img", R.drawable.mentri);
        db.insert("tbl_soal3", "soal", values);

        values.put("soal", "Berapakah masa jabatan presiden indonesia ?");
        values.put("pil_a", "4 Tahun");
        values.put("pil_b","5 Tahun");
        values.put("pil_c", "6 Tahun");
        values.put("jwban","1");
        values.put("img", R.drawable.presiden);
        db.insert("tbl_soal3", "soal", values);

        values.put("soal", "Siapakah presiden ke 3 indonesia ?");
        values.put("pil_a", "B J Habibie");
        values.put("pil_b","Megawati");
        values.put("pil_c", "Gus dur");
        values.put("jwban","0");
        values.put("img", R.drawable.tiga);
        db.insert("tbl_soal3", "soal", values);

    }


    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    public List<Soal>getSoal2(){
        List<Soal> listSoal2 = new ArrayList<Soal>();
        String query = "select * from tbl_soal2";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal2.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal2;
    }

    public List<Soal>getSoal3(){
        List<Soal> listSoal3 = new ArrayList<Soal>();
        String query = "select * from tbl_soal3";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal3.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal3;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("DROP TABLE IF EXISTS tbl_soal2");
        db.execSQL("DROP TABLE IF EXISTS tbl_soal3");
        onCreate(db);

    }


}