package Exs;

public class Ex1 {

	public static void main(String[] args) {
		int num =10, i=2;
		
		boolean vaule =((num = num +10) <10)&& ((i= i+2)<10);
		System.out.println(vaule);
		System.out.println(num);
		System.out.println(i);
		
		vaule = ((num =num+10)>10)|| ((i = i+2)<10);
		System.out.println(vaule);
		System.out.println(num);
		System.out.println(i);

	}

}
