package test1;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		
		if(score>=90) // score가 90점 이상 인지 검사
			System.out.print("학점:A");
		else if((score>=80) && (score<90)) // score가 80~90점 사이인지 검사
			System.out.print("학점:B");
		else if((score>=70) && (score<80)) // score가 70~80점 사이인지 검사
			System.out.print("학점:C");
		else if((score>=60) && (score<70)) // score가 60~70점 사이인지 검사
			System.out.print("학점:D"); 
		else	// score가 59점 이하인지 검사
			System.out.println("학점:F 재수강 하셔야 합니다.");
		
		scanner.close();
	}
}

