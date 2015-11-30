package chap10;

class Ramyon1{
	protected String boiled_pot;
	protected String boilwater(String elecpot, String water){
		System.out.println(elecpot + "에 "+water+"을 넣어 끓인다(Ramyon클래스)");
		return "끓은 물";
	}
	public void cookRamyon(String ramyon, String vegetable, int time){
		boiled_pot = boilwater("전기 냄비","물");
		System.out.println(boiled_pot+"에 "+ramyon+"과 "+vegetable +"를 넣고 "+time+"분간 끓인다(Ramyon1클래스)");
		System.out.println("일반 라면 요리 완료(Raymon1클래스)");
	}

}

class MixedRamyon extends Ramyon1{
	public void cookRamyon(String ramyon, String vegetable, int time){
		boiled_pot = boilwater("전기 냄비","물");
		System.out.println(boiled_pot+"에 "+ramyon+"과 "+vegetable+"을(를) 넣고 "+time+"분간 끓인다(MixedRamyon클래스)");
		System.out.println("면만 남기고 물을 따라 버린다(MixedRamyon클래스)");
		System.out.println("양념장을 넣고 비빈다(MixedRamyon클래스)");
		System.out.println("비빔라면 요리 완료(MixedRamyon클래스)");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505101 박기태");
		
		int s;
		Ramyon1 r = new Ramyon1();
		r.cookRamyon("신라면","파",5);
		MixedRamyon mr = new MixedRamyon();
		mr.cookRamyon("비빔면","버섯", 6);

	}

}
