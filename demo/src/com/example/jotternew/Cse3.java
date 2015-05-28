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

public class Cse3 extends ActionBarActivity {
 
	Button button123;
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cse3);
		
		action12();
		action13();
		action14();
		action15();
		action16();
		action17();
		
	}
	
	public void action12()
	{
		
		button123 = (Button) findViewById(R.id.button6);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	
	public void action13()
	{
		
		button123 = (Button) findViewById(R.id.button1);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	
	public void action14()
	{
		
		button123 = (Button) findViewById(R.id.button2);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	
	public void action15()
	{
		
		button123 = (Button) findViewById(R.id.button3);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	
	
	public void action16()
	{
		
		button123 = (Button) findViewById(R.id.button4);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	public void action17()
	{
		
		button123 = (Button) findViewById(R.id.button5);
		button123.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tinyurl.com/k3tp8ne"));
		        startActivity(i);
 
			}
		});
	}
	
	
	
	
	
	}
	
	
 
