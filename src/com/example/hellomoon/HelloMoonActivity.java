package com.example.hellomoon;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class HelloMoonActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_moon);
	}
}
