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

public class MainActivity extends ActionBarActivity {
Button button;
Button button22;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		action();
		action2();
		
	}

	public void action()
	{
		final Context context = this;
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, main2.class);
                            startActivity(intent);   
 
			}
		});
	
	}
	
	public void action2()
	{
		//final Context context = this;
		button22 = (Button) findViewById(R.id.button2);
		button22.setOnClickListener(new OnClickListener() 
		{
			@Override
		    public void onClick(View v) {
		        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
		        startActivity(i);
 
			}
		});
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
