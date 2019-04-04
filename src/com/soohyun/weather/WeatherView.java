package com.soohyun.weather;

import java.util.ArrayList;

public class WeatherView {

	public void view(String str) {
		System.out.println(str);
	}

	public void view(ArrayList<Weather> ar) {
		for(int i=0; i<ar.size(); i++) {
			Weather weather=ar.get(i);
			this.view(weather);
			/*
			System.out.println("City : "+ar.get(i).getCity());
			System.out.println("State : "+ar.get(i).getState());
			System.out.println("Gion : "+ar.get(i).getGion());
			System.out.println("Hum : "+ar.get(i).getHum());
			System.out.println("Mise : "+ar.get(i).getMise());
			System.out.println("--------");*/
		}
	}


	public void view(Weather we) {
		System.out.println("City : "+we.getCity());
		System.out.println("State : "+we.getState());
		System.out.println("Gion : "+we.getGion());
		System.out.println("Hum : "+we.getHum());
		System.out.println("Mise : "+we.getMise());
		System.out.println("--------");

	}

}
