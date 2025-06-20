package test.mypac;

public class MemberInfo {
	//회원의 번호를 저장할 필드
	public int num;
	//회원의 이름을 저장할 필드
	
	public String name;
	//회원의 이름을 저장할  필드
	
	public String addr;
	//회원의 주소를 저장할 필드
	
	
	public void printData() {
		MemberInfo a = this;//내가 객체가 되면 자기자신이 타입이된다. 
		
		String data = "번호 : "+this.num+" 이름 : "+this.name+" 주소 : "+this.addr;
		System.out.println(data);
	}
}
