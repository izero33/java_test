package step03_Class;

import test.mypac.Post;

public class MainClass11 {
	public static void main(String[] args) {
		Post p1 = null;
		Post p2 = new Post();
		Post p3 = p2;
		
		//위의 3줄 실행 >Post의 객체는 총 몇개 생성?
		//변수3개, 객체 1개
		p2.id=1;
		p2.content="hello";
		p2.author = "kim";
		
		System.out.println(p3.content);
		//p1에는 null이 들어있기 때문에(비어있기 떄문에) nullpointrException 발생
	}
}
