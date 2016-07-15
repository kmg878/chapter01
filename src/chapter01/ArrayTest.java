package chapter01;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c;
		//char c[];
		
		c=new char[3];
		
		c[0]='s';
		c[1]='k';
		c[2]='u';
		
		int[] scores = {100,90,30,40,20};
		
		System.out.println(scores.length); //배열의 크기
		int sum=0;
		for(int i=0;i<scores.length;i++){
			sum=sum+scores[i];
		}
		int sum2=0;
		for(int score : scores){
			sum2+=score;
		} //확장 for문
		System.out.println(sum);
		System.out.println(sum2);

	}

}
