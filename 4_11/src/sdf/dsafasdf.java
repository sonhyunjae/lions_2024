package sdf;

import java.util.Scanner;

public class dsafasdf {
	pu

}
public static void Menu (int a, int b, String operator) {
	double result = 0;
   
	switch (operator) {
	case "+":
		result = add(a, b);
	case "-":	
		break;
		result = subtract(a,b);
		break;
	case "*":	
		result = multiply(a,b);
		break;
	case"/":
		result = divide(a, b);
		break;
	case"%":
		result = remainder(a, b);
		break;
	default:
		System.out.println("Invalid operator");
		break;
	}
	System.out.println(result);
}
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	int input = -1;
	while(input !=0) {
		System.out.println("계산기 프로그램에 오신 것을 환영합니다 ! 종료하려면 0번, 계싼기를 사용하려면 1번을 눌러주세요.");
		System.out.println("0.종료");
		System.out.println("1.계산");
		
		input = scanner.nextInt();
		
		switch(input) {
		   case 0:
			   System.out.println("Goodbye!");
			   break;
			   
		   case 1:
			   System.out.print("Enter mathematical expression:");
			   int a = scanner.nextInt();
			   String operator = scanner.next();
			   int b =scanner.nextInt();
			   Menu(a,b, operator);
			   break;
		    
		}
	}
}
