package com.example.tripproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberWord;
    private int[] numberImage;

    public MainAdapter(Context c, String[] numberWord, int[] numberImage){
        context = c;
        this.numberWord = this.numberWord;
        this.numberImage = this.numberImage;
    }

    public MainAdapter(Context context, int[] numberImage) {
        this.context = context;
        this.numberImage = numberImage;
    }

    @Override
    public int getCount() {
        return numberImage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView == null){
            convertView = inflater.inflate(R.layout.row_item,null);
        }

        ImageView imageView = convertView.findViewById(R.id.image_view);

        imageView.setImageResource(numberImage[position]);
        return convertView;
    }
}
