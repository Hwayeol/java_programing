package chap11;

class Rectangle{
	public int width;
	public int height;
	public Rectangle(int w, int h){
		width = w;
		height = h;
	}
	
	public int computerRectangleArea(){
		return width * height;
	}
}

class Cube extends Rectangle{
	public int depth;
	public Cube(int w, int h, int d){
		super(w, h);
		depth = d;
	}
	public int computerCubeArea(){
		return super.computerRectangleArea() * depth;
	}
}

public class InstanceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505101 �ڱ���");
		
		Rectangle r = new Rectangle(10,20);
		Cube c = new Cube(10,20,30);
		System.out.println("r�� Rectangle�� ��ü? : "+(r instanceof Rectangle));
		System.out.println("r�� cube�� ��ü ? : "+(r instanceof Cube));
		System.out.println("c�� Rectangle�� ��ü? : "+(c instanceof Rectangle));
		System.out.println("c�� Cube�� ��ü ? : "+(c instanceof Cube));
		System.out.println("=========�� ��ȯ ����==========");
		r = new Cube(10,20,30);
		System.out.println("r�� Rectangle�� ��ü? : "+(r instanceof Rectangle));
		System.out.println("r�� cube�� ��ü ? : "+(r instanceof Cube));
		System.out.println("c�� Rectangle�� ��ü? : "+(c instanceof Rectangle));
		System.out.println("c�� Cube�� ��ü ? : "+(c instanceof Cube));
		System.out.println("==============================");
		System.out.println("r�� Object�� ��ü ? : "+(c instanceof Cube));
		

	}

}
