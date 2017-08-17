package com.example.yopiealamsyah.kuisedukasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    private ListView listView;
    private String[] pilihan_kuis={"Kuis IPA","Kuis IPS","Kuis PKN"};
    private Integer [] menuGambar = {R.drawable.ipa,R.drawable.ips,R.drawable.pkn};
    private String[] desc={"Kumpulan Soal Soal IPA","Kumpulan Soal Soal IPS","Kumpulan Soal Soal PKN"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CostumListAdapter adapter = new CostumListAdapter(this, pilihan_kuis, menuGambar, desc);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    intent = new Intent(MainActivity.this, KuisIPA.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    intent = new Intent(MainActivity.this, KuisIPS.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    intent = new Intent(MainActivity.this, KuisPKN.class);
                    startActivity(intent);
                }

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate dari menu; disini akan menambahkan item menu pada Actionbar
        getMenuInflater().inflate(R.menu.menu, menu);//Memanggil file bernama menu di folder menu
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                startActivity(new Intent(this,About.class));
                return true;
            case R.id.menu2:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
