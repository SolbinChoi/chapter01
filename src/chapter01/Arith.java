package chapter01;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		int c = 10;
		
		System.out.println( a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(-a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(--b);  // 2
		System.out.println(b--);  //2
		System.out.println(b);   // 1
		
		System.out.println(10/3);
		System.out.println(10.0/3); // double과 int
		System.out.println(10/(double)3);
		System.out.println((double)(10/3)); //3을 실수로 만듬
		System.out.println( -7%3);
		System.out.println(7%-3);
		
		System.out.println(c);
	
	}

}
