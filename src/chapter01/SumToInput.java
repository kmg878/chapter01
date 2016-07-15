package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("숫자를 입력하세요");
		Scanner scanner =new Scanner(System.in);
		int num=scanner.nextInt();
		int result=0;
		for(int i=1;i<=num;i++){
			
			result=i+result;  //result += i;
			
		}
		System.out.println(result);
		scanner.close();

	}

}
/*
:실행 결과
입력>10
55
*/