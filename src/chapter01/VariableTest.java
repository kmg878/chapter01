package chapter01;

public class VariableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		int num1 = 10;  
		int num2;
		
		num2 = 20;
		
		float f = 3.14f;  
		double d = 3.14; 
		
		String s ="Hello World";
		
		
		System.out.println(num1+"*"+num2+"="+num1*num2);
		System.out.println(b);
		num1=20;
		System.out.println(num1);
		
		//상수인 경우
		 final double PI=3.14; //상수는 대문자로 써준다.
		 
		 //pi=3.1416; final은 값을 고정해 준다.
		 double area=3*3*PI;

	}

}
