//Music[] genie=new Music[200]; ==> 메모리 저장위치가 다르다 ==> 참조변수
//int[] a=new int[200]  ==>실제 데이터가 저장

/*
 * 
 *    일반변수 : 값
 *    클래스(사용자 정의) ==> new를 사용해서 초기값을 만든다
 *    ※new가 없는 경우에는 null이기 때문에 사용할 수 없다
 *    
 *    클래스의 생명주기
 *    =============
 *         생성           활용           소멸
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
		m.artist="숀(SHAUN)";
		m.title="습관 (Bad Habits)";

		
		
		Music2 m1=new Music2();
		m1.rank=1;
		m1.icon='-';
		m1.idcrement='0';
		m1.title="이 노래가 클럽에서 나온다면";
		m1.artist="우디 (Woody)";
		m1.album="이 노래가 클럽에서 나온다면";
		m1.poster="http://cmsimg.mnet.com/clipimage/album/1024/003/230/3230259.jpg";
		
		System.out.println("순위:"+m.rank);
		System.out.println("제목:"+m.title);
		System.out.println("가수:"+m.artist);
		
		System.out.println("앨범:"+m.album.equals(" ".trim()));
		System.out.println("앨범:"+m.album.equals(" "));
		/*
		 * 
		 *  int a; System.out.ptinln(a);
		 *  '' != ' '
		 *  "" != " "
		 *  "" != null
		 *  
		 *  "" => 자체가 String
		 * 
		 */
		m=null;  // 메모리 해제
		
		System.out.println("앨범:"+m.poster.equals(""));
		System.out.println("앨범:"+m.album.charAt(0));
		//주소는 존재하고 값이 없는 상태
		System.out.println(m.poster.charAt(0));
		//주소값이 없는 상태
		System.out.println("==================================");
		System.out.println("순위:"+m1.rank);
		System.out.println("제목:"+m1.title);
		System.out.println("가수:"+m1.artist);
		System.out.println("앨범:"+m1.album);

	}

}
