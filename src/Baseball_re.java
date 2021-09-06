import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baseball_re {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] com = new int [3];
		int [] user = new int [3];
		String usernum;
		int yn,i,j;
		int strike,ball;
		int count=0;
		
		do {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			yn = System.in.read();
			 System.in.read();
			 System.in.read();	
		}while(yn != 'Y' && yn != 'y'&& yn != 'N' && yn != 'n');
		
		if(yn == 'Y' || yn == 'y') {
			System.out.print("\n 게임을 시작합니다.");
			
			//난수발생
			for(i=0; i<com.length; i++) {
				com[i]=(int)(Math.random()*9)+1;
				
				//중복체크
				for(j=0;j<i;j++) {
					if(com[i]==com[j]) {
						i--;
						break;
					}
				}//중복체크
			}//난수발생
			
			//숫자 맞추기
			while(true) {
				 System.out.print("숫자입력 : ");
				 count++;
				 usernum = br.readLine();
				 
				 for(i=0; i<user.length; i++) {
					 user[i] = usernum.charAt(i)-48;
				 }
				 
				 //비교
				 strike = ball = 0;
				 for(i=0; i<com.length; i++) {
					 for(j=0; j<user.length; j++) {
						 if(com[i]==user[j]) {//데이터가 같은값이냐
							 if(i==j) {
								 strike++;
							 }else ball++;
							 
						 }
					 }
				 }//for i
				 System.out.println(strike+"스트라이크\t"+ball+"볼");
				 if(strike==3)break;
				 
				 
			}//while
			System.out.println();
			System.out.println("축하합니다 "+count+"번만에 맞추셨습니다.");
			
		}//if
		
		System.out.println("프로그램 종료");
		
		
		
	}

}
