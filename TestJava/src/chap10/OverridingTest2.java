package chap10;

class Ramyon1{
	protected String boiled_pot;
	protected String boilwater(String elecpot, String water){
		System.out.println(elecpot + "�� "+water+"�� �־� ���δ�(RamyonŬ����)");
		return "���� ��";
	}
	public void cookRamyon(String ramyon, String vegetable, int time){
		boiled_pot = boilwater("���� ����","��");
		System.out.println(boiled_pot+"�� "+ramyon+"�� "+vegetable +"�� �ְ� "+time+"�а� ���δ�(Ramyon1Ŭ����)");
		System.out.println("�Ϲ� ��� �丮 �Ϸ�(Raymon1Ŭ����)");
	}

}

class MixedRamyon extends Ramyon1{
	public void cookRamyon(String ramyon, String vegetable, int time){
		boiled_pot = boilwater("���� ����","��");
		System.out.println(boiled_pot+"�� "+ramyon+"�� "+vegetable+"��(��) �ְ� "+time+"�а� ���δ�(MixedRamyonŬ����)");
		System.out.println("�鸸 ����� ���� ���� ������(MixedRamyonŬ����)");
		System.out.println("������� �ְ� ����(MixedRamyonŬ����)");
		System.out.println("������ �丮 �Ϸ�(MixedRamyonŬ����)");
	}
}

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1505101 �ڱ���");
		
		int s;
		Ramyon1 r = new Ramyon1();
		r.cookRamyon("�Ŷ��","��",5);
		MixedRamyon mr = new MixedRamyon();
		mr.cookRamyon("�����","����", 6);

	}

}
