package step03_Class;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1. 한명의 회원정보를 MemberInfor 객체에 담아보세요,
		 * (본인 마음대로 설정)
		 * 
		 * 2. 위에서 생성한 객체(MemberInfo)의 printData() 메소드를 호출해보세요
		 * 
		 * */
		MemberInfo me = new MemberInfo();
		// 객체를 생성하는 목적 : 필드에 데이터를 담거나 메소드를 호출하기 위해서
		me.num=1;
		me.name = "정나영";
		me.addr="양주";
		
		me.printData();
		

		
	}
}
