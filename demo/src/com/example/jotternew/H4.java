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

public class H4 extends ActionBarActivity {
Button button;
Button button22;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.h4);
		next121();
		
	}
	
	public void next121()
	{
		final Context context = this;
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
 
			    Intent intent = new Intent(context, H5.class);
                            startActivity(intent);   
 
			}
		});
	
	}
	
}

