package test.mypac;

public class MemberDto {
	//필드 정의하기(접근 지정자가 private 으로 되어 있으면 외부에서 접근 불가)
	//동일 객체 내부에서만 접근 가능
	private int num;
	private String name;
	private String addr;
	
	//클래스명과 동일하고 return type이 명시되지 않음 : 생성자
	//객체를 new하느 시점에 한번 호출된다.
	// 객체를 new하는 시점에 무언가 초기화 작업을 한다. 
	//new MemberDto()로 객체를 생성할 때 이 블럭안에 있는 코드 실행(초기화) 
	//만들지 않아도 있다고 간주한다.
	public MemberDto() {
		System.out.println("MemberDto 클래스의 생성자가 호출됨");
	}
	//생성자는 필요에 따라서 다른 모양으로 여러개 정의할 수도 있다.
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}//new MemberDto(숫자,이름)일때 호출됨
	
	public MemberDto(int num) {
		
	}//new MemberDto(숫자)일때 호출된
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
