package com.example.dessert;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context nContext;

    public Integer[] thumbImages = {
            R.drawable.pie, R.drawable.pancakes,  R.drawable.donut, R.drawable.cottoncandy,
            R.drawable.icecream, R.drawable.waffles, R.drawable.cake, R.drawable.muffin,
            R.drawable.pudding,
    };

    public ImageAdapter(Context c){nContext = c; }

    @Override
    public int getCount(){ return thumbImages.length; }

    @Override
    public Object getItem(int position){ return thumbImages[position]; }

    @Override
    public long getItemId(int position){ return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(nContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;

    }

}
