package com.example.demo;

import android.app.Application;

public class MyApplication extends Application{
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyApplication(){
		System.out.println("MyApplication!!");
	}
}
