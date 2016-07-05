package chapter01;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 30;

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		if(n1<n2){
		int temp;
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		}else{
			System.out.println("n1: " + n1);
			System.out.println("n2: " + n2);
		}


		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 90;
		int a3 = 60;

		if (a1 >= a2) {
			if(a1>=a3){
				System.out.println(a1);
			}else{
				System.out.println(a3);
			}
		} else if(a2>=a3) {
			System.out.println(a2);
			
		}else{
			System.out.println(a3);
		}


	}

}
