package Exs;

public class Ex0 {

	public static void main(String[] args) {
		int num1=10, num2=20;
		boolean flag = (num1>0) && (num2>0); //모두 참일경우 참 
		System.out.println(flag);
		
		flag = (num1 <0) && (num2 >0);
		System.out.println(flag);
		
		flag = (num1 <0) || (num2 >0); //둘중 하나가 참일 경우 참
		System.out.println(flag);

	}

}
