package com.chiemy.pagetransformerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class MainActivity extends FragmentActivity {
	 @Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_main);
	}
	 
	public void onClick(View view){
		switch(view.getId()){
		case R.id.button1:
			startActivity(new Intent(MainActivity.this,Translate1Activity.class));
			break;
		case R.id.button2:
			startActivity(new Intent(MainActivity.this,Translate2Activity.class));
			break;
		}
	}
}
