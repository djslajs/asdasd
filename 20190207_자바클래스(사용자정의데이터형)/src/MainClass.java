
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �����
		Movie m= new Movie();
		System.out.println("m="+m);
		Movie m1= new Movie();
		System.out.println("m1="+m1);
		Movie m2= new Movie();
		System.out.println("m2="+m2);
		
		m.title="��������";
		m1.title="�˸�Ÿ:��Ʋ����";
		m2.title="�巡�� ����̱� 3";
		
		m.director="�̺���";
		m1.director="�ι�Ʈ �ε帮����";
		m2.director="�� ������̽�";
		
		//���
		
		System.out.println(m.title+","+m.director);
		System.out.println(m1.title+","+m1.director);
		System.out.println(m2.title+","+m2.director);
	}

}
