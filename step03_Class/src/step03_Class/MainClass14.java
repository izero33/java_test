package step03_Class;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//객체 생성해서 default 생성자에 실행의 흐름이 들어오는지 확인
		new MemberDto();
		
		MemberDto dto = new MemberDto();
		
		MemberDto dto2 = new MemberDto(2, "zz", "zzz");
		
		MemberDto dto3 = new MemberDto();
		dto3.setNum(3);
		dto3.setName("rrr");
		dto3.setAddr("rrrr");
		
		
	}
}
