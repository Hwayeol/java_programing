package chap11;

abstract class Figure1{
	abstract void draw();
	
}

interface Shape1{
	public void computerArea(double a, double b);
}

class Triangle3 extends Figure1 implements Shape1{
	void draw(){
		System.out.println("삼각형을 그리는 기능");
	}
	public void computerArea(double a, double h){
		System.out.println("삼각형의 넓이 : "+(a * h / 2));
	}
}

class Rectangle3 extends Figure1 implements Shape1{
	void draw(){
		System.out.println("사격형을 그리는 기능");
	}
	public void computerArea(double h, double v){
		System.out.println("사각형의 넓이 : "+(h*v));
	}
}

class Polydraw1{
	public void pdraw(Figure1 f){
		f.draw();
	}
	public void pcomputerArea(Shape1 s, double a, double b){
		s.computerArea(a,b);
	}
}

class Oval3 extends Figure1 implements Shape1{
	void draw(){
		System.out.println("원을 그리는 기능");
	}
	public void computerArea(double r1, double r2){
		System.out.println("원의 넓이 : "+(3.14 * r1 * r2));
	}
	
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505101 박기태");
		
		Polydraw1 p = new Polydraw1();
		Figure1 fg1 = new Triangle3();
		Figure1 fg2 = new Rectangle3();
		Figure1 fg3 = new Oval3();
		Shape1 sp1 = new Triangle3();
		Shape1 sp2 = new Rectangle3();
		Shape1 sp3 = new Oval3();
		p.pdraw(fg1);
		p.pcomputerArea(sp1, 4, 4);
		p.pdraw(fg2);
		p.pcomputerArea(sp2,4,4);
		p.pdraw(fg3);
		p.pcomputerArea(sp3, 4, 4);
	}

}
