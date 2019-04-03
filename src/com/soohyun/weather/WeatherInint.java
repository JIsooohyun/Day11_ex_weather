package com.soohyun.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherInint {
	
	private String info;
	private Scanner sc;
	
	//도시명, 상태, 기온, 습도, 미세먼지
	public WeatherInint() {
		info = "seoul , 맑음 , 10 , 20 , 0.3 , daejon , 비 , -22 , 50 , 0.1,"
				+"incheon ,태풍 , 56 ,90 ,22.2 , jeju , 흐림 , 15 , 10 , 1.2";
		sc = new Scanner(System.in);
	}
	public ArrayList<Weather> getWeathers(){  //info문자열을 잘라서 ArryList에 넣기
		
		ArrayList<Weather> ar = new ArrayList<Weather>();
		//info = info.replace(" ", "");//만약에 in cheon으로 쓰면 공백이 없어지기 때문에 차라리
		info = info.trim();  //공백을 없애는 방법을 사용한다.
		String [] s = info.split(",");
		
		
		for(int i=0; i<s.length; i++) {
			 Weather weather = new Weather(); 
			 weather.setCity(s[i]);
			 weather.setState(s[++i]);
			 weather.setGion(Integer.valueOf(s[++i]));
			 weather.setHum(Integer.valueOf(s[++i]));
			 weather.setMise(Double.valueOf(s[++i]));
			 ar.add(weather);
		}
		return ar;
	}
	
	
	public Weather setWeather() {
		Weather we = new Weather();
		System.out.println("City를 입력하세요");
		we.setCity(sc.next());
		System.out.println("State를 입력하세요");
		we.setState(sc.next());
		System.out.println("Gion를 입력하세요");
		we.setGion(sc.nextInt());
		System.out.println("Hum를 입력하세요");
		we.setHum(sc.nextInt());
		System.out.println("Mise를 입력하세요");
		we.setMise(sc.nextDouble());
		return we;
	}
	
	public Weather findWeather(ArrayList<Weather> ar) {
		Weather we = new Weather();
		System.out.println("날씨를 입력하세요");
		String nal = sc.next();
		
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i).getState().equals(nal)) {
				we = new Weather();
				we.setCity(ar.get(i).getCity());
				we.setState(ar.get(i).getState());
				we.setGion(ar.get(i).getGion());
				we.setHum(ar.get(i).getHum());
				we.setMise(ar.get(i).getMise());
				
			}
		}
		return we;
	}

	public void deleteWeather(ArrayList<Weather> ar) {
		Weather we = new Weather();
		System.out.println("날씨를 입력하세요");
		String nal = sc.next();
		
		
		for(int i=0; i<ar.size(); i++) {
			if(ar.get(i).getState().equals(nal)) {
				ar.remove(i);
			}
		}
		
	}
	
	
}









