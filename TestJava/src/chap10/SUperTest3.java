package chap10;

class SD1{
	public int i1;
	public double d1;
	public SD1(int i1){
		System.out.println("SD(int i) ������ ����");
		this.i1 = i1 * i1;
		System.out.println(i1+"�� 2������ : "+this.i1);
	}
	public SD1(double d1){
		System.out.println("SD1(double d1) ������ ����");
		this.d1 = d1 * d1;
		System.out.println(d1+"�� 2������ : "+this.d1);
	}
}

class Sub1 extends SD1{
	public Sub1(int i1){
		super(i1);
		System.out.println("Sub1(int i1) ������ ����");
		this.i1 = this.i1 * i1;
		System.out.println(i1 + "�� 3������ : "+this.i1);
	}
	public Sub1(double d1){
		super(d1);
		System.out.println("Sub1(double d1) ������ ����");
		this.d1 = this.d1 * d1;
		System.out.println(d1 + "�� 3������ : "+this.d1);
	}
}

public class SUperTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505101 �ڱ���");
		
		Sub1 sub1 = new Sub1(10);
		Sub1 sub2 = new Sub1(10.5);
	}

}