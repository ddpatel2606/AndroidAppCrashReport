package com.dixreen.appcrashreport;

import android.app.Application;
import android.content.res.Configuration;


public class MyApplication extends Application{

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}

		@Override
	public void onCreate() {
		// TODO Auto-generated method stub
	     super.onCreate();
		
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

}
