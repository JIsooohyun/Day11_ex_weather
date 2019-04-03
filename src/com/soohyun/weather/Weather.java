package com.soohyun.weather;

public class Weather {
	//데이터 정보를 저장하는  class
	private String city;  //도시명
	private String state; //상태
	private int gion;     //기온
	private int hum; 	  //습도
	private double mise;  //미세먼지
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getGion() {
		return gion;
	}
	public void setGion(int gion) {
		this.gion = gion;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public double getMise() {
		return mise;
	}
	public void setMise(double mise) {
		this.mise = mise;
	}
	
}
