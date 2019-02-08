
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장 공간 만들기
		Movie m= new Movie();
		System.out.println("m="+m);
		Movie m1= new Movie();
		System.out.println("m1="+m1);
		Movie m2= new Movie();
		System.out.println("m2="+m2);
		
		m.title="극한직업";
		m1.title="알리타:배틀엔젤";
		m2.title="드래곤 길들이기 3";
		
		m.director="이병헌";
		m1.director="로버트 로드리게즈";
		m2.director="딘 데블로이스";
		
		//출력
		
		System.out.println(m.title+","+m.director);
		System.out.println(m1.title+","+m1.director);
		System.out.println(m2.title+","+m2.director);
	}

}
