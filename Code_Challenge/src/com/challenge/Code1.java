package com.challenge;

import java.util.Arrays;

public class Code1 {
	
	public static void main(String[] args) {
		int result = 0;
		System.out.println(result);
		
		// 순서대로 코드 짜주세요.
		// 1. 알맞은 변수 선언하고 출력하기
		//  Ex) 정수형으로 1000 출력 하기
		int value = 1000;
		System.out.println(value);
		// 1.1 정수형으로 94743616344 출력하기
		// 1.2 실수형으로 3.14 출력하기
		// 1.3 100을 3으로 나누고, 소수점 표시하기 ex) 33.333333
		// 1.4 실수 12.71을 선언하고, 소수점 버리기 ex) 12
		// 1.5 byte b에 128로 초기화 억지로 시키기 
		
		
//		2. 각종 연산자와 if문 Switch문 함께 사용하기
		// Ex) val2라는 인자가 100보다 큰지 확인하고, 결과 '예' '아니오' 출력하기
		int val2 = 123;
		if(val2 > 100) {
			System.out.println("예");
		}else {
			System.out.println("아니오");
		}
		
		//2.1 한수를 입력받아 2의 배수, 3의 배수, 5의 배수인지 확인하세요. 
		int num21 =0;
		if(num21 % 2 == 0) {
		}
		if(num21 % 3 == 0) {
			
		}
		if(num21 % 5 == 0) {
			
		}
		
		
		//2.2 // 1~300 중에 한수를 입력받고, 
			  // 1~100이하 구간, 100초과 ~ 200 이하 구간, 200~초과 구간으로 분리하여 출력하세요.
		      // 50 = 1~100 구간 , 124 = 100~200구간

		//2.3 switch문을 통해 숫자와 문자를 구별하는 코드를 작성하세요.
		
		
		//2.4 ID/PW를 입력받고, ID가 5글자 이상이고, ID에 PW가 포함되지 않은 상태를
 		//    if문 하나로 체크해주세요.
		String id = "asdas";
		String pw = "1212";
		
		if(id.length() < 5 || id.contains(pw)) {
			System.out.println("잘못된 경우입니다.");
		}
				
				
		
		
		
//		3. 반복문
		// ex) 1~10까지 출력하기
		for(int i = 0; i<10; i++) {
			System.out.println(i);
		}
		
		// 3.1 구구단 2단만 출력하기 ex) 2 X 1 = 2 꼴로
		for(int i=1; i<=9; i++) {
			System.out.println("2 X " + i +" = " + (i*2));
		}
		
		// 3.2 1부터 100까지 짝수만 골라서 출력하기
		for(int i = 1; i <= 100; i++) { // 1 ~ 100
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		// 3.3 1부터 100까지 수 중에 5의 배수와 7의 배수를 확인하고 출력하기.
		for(int i = 1; i <= 100; i++) { // 1 ~ 100
			if(i%5 == 0) {
				System.out.println("5의 배수입니다.");
			}
			if(i%7 == 0) {
				System.out.println("7의 배수입니다.");
			}
		}
		
		// 3.4 1부터 1000까지 수 중에 
		//     3의 배수이면서 4의 배수인 수를 모두 찾고, &&
		//     이중에 20번을 찾으면 반복문 정지하기.
		
		int count = 0;
		for(int i = 1; i <= 1000; i++) { // 1 ~ 1000
			if(i%3 == 0 && i%4 == 0) {
				System.out.println("5의 배수입니다.");
				count++;
				if(count > 20) {
					break;
				}
			}
		}
		
//		4. 중첩 반복문
		// 4.1 구구단 1단부터 9단까지 모두 출력하는데, 단이 바뀔때마다 "x단" 표시하기
		// ex) 2 X 9 = 18;
		//     3단 시작!
		//     3 X 1 = 3
		for(int i = 2; i < 10; i++) { // 2 ~ 9
			System.out.println(i+"단 시작");
			for(int j=2; j < 10; j++) { // 2 ~ 9
				System.out.println(j +" X "+ i + " = " + (i*j));
			}
		}
		
		// 4.2 구구단 1단부터 9단까지 모두 출력하는데
		// 9단까지 가로로 출력하기
		// ex) 2X1=1 3X1=3 4X1=4 ...
		//     2X2=2 3X2=6 4X2=8
		
		// 4.3 사용자에게 1~100 수중 2개를 입력 받고, 두 수의 범위 안의 숫자 모두 출력하기.
		//     단, 무한 반복하기.
		// 입력 53, 47
		// 출력 48, 49, 50, 51, 52
		
		int num1  = 30; 
		int num2  = 40; 

		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for(int i = num1 ; i <= num2; i++) {
			System.out.println(i);
		}
		
		
		
//		5. 배열
//		5.1 배열 정수형으로 10개 칸을 선언하고, 1부터 10까지로 값 초기화 하기 

//		5.2 배열 정수형으로 100개까지 선언하고, 3과 7의 배수 100개 찾아서 넣기
		// 21, 42 .....
		
		int array[] = new int[100]; 
		int counter = 0;
		for(int i = 0; ; i++) {
			if(i % 3 == 0 && i % 7 == 0 ) {
				array[counter++] = i;
				if(counter == 100) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
		
//		5.3 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
		//  단, exit로 입력시 바로 종료하고 저장 받은 데이터 모두 출력
		
		
//		5.4 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
		//  이중에 숫자로 입력된 값만 출력하기
		
		
//		5.5 배열 String형으로 10개 공간 선언하고 사용자에게 '영문' 값을 입력받아 값 저장하기.
		//  이중에 알파벳 별로 모두 count 해보기.
		// 입력 : abc bbb ccc
		// a : 1개
		// b : 4개
		// c : 4개
		
		String[] arrayStr = new String[10];
		for(int i=0; i< 10; i++) {
			arrayStr[i] = ""+(char)('a'+i) + (char)('c'+i) + (""+((char)('e'+i))).repeat(i) ; 
			System.out.println(arrayStr[i]);
		}
		
		int[] counterArray = new int['z'-'a' + 1]; 
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j<arrayStr[i].length(); j++) {
				String str = arrayStr[i];
				counterArray[str.charAt(j) - 'a']++;
			}
		}
		
		for(int i= 0; i< counterArray.length; i++) {
			System.out.println((char)('a'+i) +" : " + counterArray[i]);
		}

	}

}
