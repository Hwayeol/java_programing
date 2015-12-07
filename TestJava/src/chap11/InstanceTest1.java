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
		System.out.println("1505101 박기태");
		
		Rectangle r = new Rectangle(10,20);
		Cube c = new Cube(10,20,30);
		System.out.println("r이 Rectangle의 객체? : "+(r instanceof Rectangle));
		System.out.println("r이 cube의 객체 ? : "+(r instanceof Cube));
		System.out.println("c가 Rectangle의 객체? : "+(c instanceof Rectangle));
		System.out.println("c가 Cube의 객체 ? : "+(c instanceof Cube));
		System.out.println("=========형 변환 이후==========");
		r = new Cube(10,20,30);
		System.out.println("r이 Rectangle의 객체? : "+(r instanceof Rectangle));
		System.out.println("r이 cube의 객체 ? : "+(r instanceof Cube));
		System.out.println("c가 Rectangle의 객체? : "+(c instanceof Rectangle));
		System.out.println("c가 Cube의 객체 ? : "+(c instanceof Cube));
		System.out.println("==============================");
		System.out.println("r이 Object의 객체 ? : "+(c instanceof Cube));
		

	}

}
