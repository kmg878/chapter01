package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= new String("HelloWorld");
		Scanner scanner = new Scanner(System.in); //ctrl+shift+o
		int count = scanner.nextInt();
		
		int i=0;
		while(i<count){
			i=i+1;
			System.out.println(s);
		}
		

	}

}
