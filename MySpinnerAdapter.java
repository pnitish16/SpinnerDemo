package com.example.spinnerdemo;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MySpinnerAdapter extends BaseAdapter implements SpinnerAdapter 
{
	private ArrayList<ChildData> arrayList1;
	String[] array_TAGS, strArray;
	ArrayList<String> strArrayList;
	Context context;
	Typeface tf;
	boolean isStringArray = false;
	boolean isStringList =false;
	public MySpinnerAdapter(Context context1,ArrayList<ChildData> arrayList_Makes, String[] array_TAGS1) 
	{
		this.context = context1;
		this.arrayList1 = arrayList_Makes;
		this.array_TAGS = array_TAGS1;
	}
	
	public MySpinnerAdapter(Context context1,ArrayList<ChildData> arrayList_Makes) 
	{
		this.context = context1;
		this.arrayList1 = arrayList_Makes;
	}

	public int getCount()
	{
		if(isStringArray)
			return strArray.length;
		else
			return arrayList1.size();
	}

	public Object getItem(int position) 
	{
		if(isStringArray)
			return strArray[position];
		else
			return arrayList1.get(position);
	}

	public long getItemId(int position)
	{
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) 
	{
		if (convertView == null)
		{
			LayoutInflater inflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.row_spinner,parent, false);
		}

		TextView tv_Spinner_Item = (TextView) convertView .findViewById(R.id.tv_text);
		ImageView iv_icon = (ImageView) convertView .findViewById(R.id.iv_icon);
			
		tv_Spinner_Item.setText(arrayList1.get(position).getName());
		iv_icon.setImageResource(arrayList1.get(position).getIcon());

		return convertView;
	}
}
