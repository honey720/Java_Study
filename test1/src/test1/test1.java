package test1;

import java.util.Scanner;

public class test1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���:");
		int score = scanner.nextInt();
		
		if(score>=90) // score�� 90�� �̻� ���� �˻�
			System.out.print("����:A");
		else if((score>=80) && (score<90)) // score�� 80~90�� �������� �˻�
			System.out.print("����:B");
		else if((score>=70) && (score<80)) // score�� 70~80�� �������� �˻�
			System.out.print("����:C");
		else if((score>=60) && (score<70)) // score�� 60~70�� �������� �˻�
			System.out.print("����:D"); 
		else	// score�� 59�� �������� �˻�
			System.out.println("����:F ����� �ϼž� �մϴ�.");
		
		scanner.close();
	}
}

