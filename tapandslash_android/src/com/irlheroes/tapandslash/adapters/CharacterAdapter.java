package com.irlheroes.tapandslash.adapters;

import java.util.ArrayList;

import com.irlheroes.tapandslash.R;
import com.irlheroes.tapandslash.common.Session;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.irlheroes.tapandslash.common.Character;

public class CharacterAdapter extends BaseAdapter 
{
	private Context context;
	public ArrayList<Character> Characters;
	public CharacterAdapter(Context c)
	{
		context = c;
		Characters = Session.AllCharacters;
	}
	
	@Override
	public int getCount() {
		return Characters.size();
	}

	@Override
	public Object getItem(int position) {
		return Characters.get(position);
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	/*
	 * Create an image view for the requested item in the grid
	 * (non-Javadoc)
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    ImageView imageView = new ImageView(context);
	    imageView.setImageResource(Characters.get(position).getImgSource());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(70, 70));
        return imageView;
	}
}
