package step03_Class;

import java.lang.reflect.Member;

import test.mypac.MemberInfo;

public class MainClass07 {
	public static void main(String[] args) {
		//1.MemebrInfo 객체를 생성해서 참조값을 mem1이라는 변수에 담아보세요
		MemberInfo mem1 = new MemberInfo();//참조값이 들어옴
		
		//2. 회원의 번호 1을 위해서 생성한 객체에 담아 보세요
		mem1.num = 1;
		
		//3. 회원의 이름 "김구라"를 위해서 생성된 객체에 담아보세요
		mem1.name="김구라";
		
		//4. 회원의 주소 "노량진"능 뤼해서 생성한 객체에 담아보세요
		mem1.addr = "노량진";
		
		//5. 위의 작업을 모두 했으면 디버그 모드로 실행해서 정상 동작하는지 확인
		
		
	}
}
