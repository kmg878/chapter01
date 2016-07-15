package chapter01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자 입력");
		int num=scanner.nextInt();
		
		for(int i=1;i<=num;i++){
			for(int j=0;j<i;j++){
			System.out.print("x");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k=num;k>0;k--){
			for(int z=0;z<k;z++){
			System.out.print("x");
			}
			System.out.println();
		}

	}

}
