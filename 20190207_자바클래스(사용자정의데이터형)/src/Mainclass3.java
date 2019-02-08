import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * 
 *    메소드 ==> 데이터를 전송
 *             ==========
 *             1) 한개
 *             2) 여러개(묶어서 전송) 
 *                =배열
 *                =클래스
 *    
 * 
 */

public class Mainclass3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MovieRank[] mr=MovieRankData();
		System.out.println("=======영화 랭크 순위=======");
		for(MovieRank m:mr)
		{
			System.out.println("순위:"+m.rank);
			System.out.println("제목:"+m.title);
			System.out.println("등폭:"+m.icon+"("+m.idcrement+")");
		}
		
		System.out.println("=======영화 상세 보기=======");
		Scanner scan=new Scanner(System.in);
		System.out.print("제목 입력:");
		String s=scan.next();
		MovieRank mm=movieDetail(s);
		System.out.println("순위:"+mm.rank);
		System.out.println("제목:"+mm.title);
		System.out.println("등폭:"+mm.icon+"("+mm.idcrement+")");
	}
	
	static MovieRank[] MovieRankData() throws Exception
	{
		MovieRank[] mr=new MovieRank[10];
		/*
		 * 
		 * <td class="title">
						<div class="tit3">
							<a href="/movie/bi/mi/basic.nhn?code=167651" title="극한직업">극한직업</a>
						</div>
					</td>
					<td class="ac"><img src="https://ssl.pstatic.net/imgmovie/2007/img/common/icon_na_1.gif" alt="na" width="7" height="10" class="arrow"></td>
					<td class="range ac">0</td>


		 */
		Document doc=Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		Elements title=doc.select("td.title div.tit3 a");
		Elements icon= doc.select("td.ac img");
		Elements idcrement=doc.select("td.range");
		int j=1;
		for(int i=0; i<10; i++)
		{
			//System.out.println("순위:"+(i+1));
			//System.out.println("영화명:"+title.get(i).text());
			
			String s=icon.get(j).attr("src");
			String ss="";
			s=s.substring(s.lastIndexOf("/"));
			if(s.contains("na"))
				ss="-";
			else if(s.contains("up"))
				ss="▲";
			else if(s.contains("down"))
				ss="▼";
			//System.out.println("아이콘:"+icon.get(i).attr("src"));
			//System.out.println("아이콘:"+s);
//			System.out.println("아이콘:"+ss);
//			
//			System.out.println("등폭:"+idcrement.get(i).text());
//			System.out.println("===================================");
			j+=2;
			
			MovieRank m=new MovieRank();
			//System.out.println("m"+(i+1)+":"+m);
			//new는 사용할때마다 메모리 공간이 다르다
			m.rank=i+1;
			m.icon=ss.charAt(0);
			m.idcrement=Integer.parseInt(idcrement.get(i).text());
			// 문자열 => 정수
			// 정수 => 문자 valueOf()
			m.title=title.get(i).text();
			
			mr[i]=m;
			
		}
		
		return mr;
		
	}
	
	static MovieRank movieDetail(String title) throws Exception
	{
		MovieRank mr=new MovieRank();
		MovieRank[] movies=MovieRankData();
		for(MovieRank m:movies)
		{
			if(m.title.contains(title))
			{
				mr=m;
				break;
			}
		}
		return mr;
		
	}
}




















