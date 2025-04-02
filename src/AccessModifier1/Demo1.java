package AccessModifier1;

public class Demo1 {
	private int a=10;
	 int b=20;
	protected int c=30;
	public int d=40;
	void disp1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
class Demo2 extends Demo1{
	void disp2() {
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
