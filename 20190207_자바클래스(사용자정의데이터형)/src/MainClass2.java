//Music[] genie=new Music[200]; ==> �޸� ������ġ�� �ٸ��� ==> ��������
//int[] a=new int[200]  ==>���� �����Ͱ� ����

/*
 * 
 *    �Ϲݺ��� : ��
 *    Ŭ����(����� ����) ==> new�� ����ؼ� �ʱⰪ�� �����
 *    ��new�� ���� ��쿡�� null�̱� ������ ����� �� ����
 *    
 *    Ŭ������ �����ֱ�
 *    =============
 *         ����           Ȱ��           �Ҹ�
 *  A  a=new A()  a.title  a=null
 * 
 */

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music m=new Music();
		m.rank=1;
		m.icon='-';
		m.idcrement=0;
		m.artist="��(SHAUN)";
		m.title="���� (Bad Habits)";

		
		
		Music2 m1=new Music2();
		m1.rank=1;
		m1.icon='-';
		m1.idcrement='0';
		m1.title="�� �뷡�� Ŭ������ ���´ٸ�";
		m1.artist="��� (Woody)";
		m1.album="�� �뷡�� Ŭ������ ���´ٸ�";
		m1.poster="http://cmsimg.mnet.com/clipimage/album/1024/003/230/3230259.jpg";
		
		System.out.println("����:"+m.rank);
		System.out.println("����:"+m.title);
		System.out.println("����:"+m.artist);
		
		System.out.println("�ٹ�:"+m.album.equals(" ".trim()));
		System.out.println("�ٹ�:"+m.album.equals(" "));
		/*
		 * 
		 *  int a; System.out.ptinln(a);
		 *  '' != ' '
		 *  "" != " "
		 *  "" != null
		 *  
		 *  "" => ��ü�� String
		 * 
		 */
		m=null;  // �޸� ����
		
		System.out.println("�ٹ�:"+m.poster.equals(""));
		System.out.println("�ٹ�:"+m.album.charAt(0));
		//�ּҴ� �����ϰ� ���� ���� ����
		System.out.println(m.poster.charAt(0));
		//�ּҰ��� ���� ����
		System.out.println("==================================");
		System.out.println("����:"+m1.rank);
		System.out.println("����:"+m1.title);
		System.out.println("����:"+m1.artist);
		System.out.println("�ٹ�:"+m1.album);

	}

}
