package com.soohyun.weather;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {

	private Scanner sc;
	private ArrayList<Weather> weathers = new ArrayList<>();
	private WeatherInint wInit = new WeatherInint();
	private WeatherView view = new WeatherView();



	public WeatherController() {
		sc = new Scanner(System.in);
	}

	public void start() {
		ArrayList<Weather> ar = wInit.getWeathers();
		
		while(true) {
			System.out.println("1. 날씨정보추가 ");
			System.out.println("2. 날씨      검색");
			System.out.println("3. 날씨      삭제");
			System.out.println("4. 날씨정보출력");
			System.out.println("5. 종            료");
			int select = sc.nextInt();
			if(select == 1) {
				//setWeahter호출 한 결과물을 weathers에 추가
				Weather we = wInit.setWeather();
				ar.add(we);
			}else if(select == 2) {
				Weather find = wInit.findWeather(ar);
				view.view(find);
			}else if(select == 3){
				wInit.deleteWeather(ar);
				
			}else if(select == 4) {
				//view호출
				view.view(ar);
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}

}

