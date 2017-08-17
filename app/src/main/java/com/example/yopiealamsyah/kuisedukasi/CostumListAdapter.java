package com.example.yopiealamsyah.kuisedukasi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yopie alamsyah on 16/08/2017.
 */
public class CostumListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] pilihan_kuis;
    private final String[] desc;
    private final Integer[] menuGambar;

    public CostumListAdapter(Activity context, String[] pilihan_kuis, Integer[] menuGambar, String[] desc) {
        super(context, R.layout.activity_list, pilihan_kuis);
        this.context = context;
        this.pilihan_kuis = pilihan_kuis;
        this.menuGambar = menuGambar;
        this.desc = desc;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list, null, true);

        TextView textMenu = (TextView)rowView.findViewById(R.id.pilihan_kuis);
        TextView textLagi = (TextView)rowView.findViewById(R.id.desc);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.imageView);

        textMenu.setText(pilihan_kuis[position]);
        textLagi.setText(desc[position]);
        imgMenu.setImageResource(menuGambar[position]);

        return rowView;
    }

    public Object getItem() {
        return null;
    }
}
