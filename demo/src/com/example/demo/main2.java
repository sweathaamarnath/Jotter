package com.example.demo;


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
public class main2 extends ActionBarActivity {
 
	ImageButton button123;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		action123();
	}
	
	public void action123()
	{
		button123 = (ImageButton) findViewById(R.id.imageButton1);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v1) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
		        startActivity(i);
 
			}
		});
	}
	
	
 
}