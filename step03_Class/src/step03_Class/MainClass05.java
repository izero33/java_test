package step03_Class;

import test.util.MyUtil;

public class MainClass05 {
	public static void main(String[] args) {
		//static 필드 참조
		String a = MyUtil.version;
		//MyUtil. > class명에 .찍음>필드와 메서드를 쓸 수 있다.
		//static 메소드 호출
		MyUtil.send();
		
		MyUtil u1 = new MyUtil();
		u1.owner="개구리";
		
		MyUtil u2 = new MyUtil();
		u2.owner="개구리";
		
	}
}
