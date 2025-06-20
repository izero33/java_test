package step03_Class;

import test.mypac.MemberDto;

public class MainClass13 {
	
	public static void main(String[] args) {
		MemberDto dto = new MemberDto();
		
		//dto.num = 1; 불가능
		
		dto.setNum(1);
		//값을 무조건 int로 전달해줘야함
		//만약 매개변수에 전달해야하는 타입이 car라면 car의 참조값을 넣어줘야한다(new)
		dto.setName("바보");
		dto.setAddr("서울");
		
		//dto 객체에 보관된 num, name, addr을 참조하고 싶다면?
		
		//회원 정보를 콘솔창에 출력하고 싶다면? > 값을 리턴해주는 메소드 만들어야함
		System.out.println(dto.getNum());
		//회원의 이름을 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getName());
		//회원의 주소를 콘솔창에 출력하고 싶다면?
		System.out.println(dto.getAddr());
		
		//dto의 getter 메소드를 호출해서 리던되는 값을 변수에 연습삼아 담아보기
		int num = dto.getNum();
		String name =dto.getName();
		String addr =dto.getAddr();
		
	}
	

}
