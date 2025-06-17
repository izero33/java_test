package test.main;
//boolean 타입은 대화식으로
public class MainClass06 {
	public static void main(String[] args) {
		boolean isPretty=true;
		boolean canEat=false;
		
		if(isPretty) { //만일 이쁘면 실행
		}
		
		if(!isPretty) { //만일 이쁘지 않다면면 실행
		}
		
		if(canEat) { 
		}
		
		if(!canEat) { //먹을 수 없다면 실행
		}else {
			//그렇지 않다면 싱핼
		}
		
		if(isPretty || canEat) {
			//이쁘거나 먹을 수 있다면
		}
		
		if(isPretty && canEat) {
			//이쁘고 먹을 수 있다면
		}
		
		if(isPretty && !canEat) {
			//이쁘고 먹을 수 없다면
			//이쁘기도 하고 먹을 수 없다면 실행
		}
	}
}
