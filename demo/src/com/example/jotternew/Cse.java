package com.example.jotternew;


import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
public class Cse extends ActionBarActivity {
 
	Button button123;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cse);
		sem2act();
		sem3act();
	}
	
	public void sem2act()
	{
		final Context context = this;
		button123 = (Button) findViewById(R.id.button2);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, Cse2.class);
                            startActivity(intent);   
 
			}
		}); 
		
	}
		
		
		public void sem3act()
		{
			final Context context = this;
			button123 = (Button) findViewById(R.id.button3);
			button123.setOnClickListener(new OnClickListener() 
			{
				@Override
				public void onClick(View arg0) {
	 
				    Intent intent = new Intent(context, Cse3.class);
	                            startActivity(intent);   
	 
				}
			});
		
		
	}
	
	
	
	}
	
	
 
