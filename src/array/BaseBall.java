/*
야구 게임 - 숫자 맞추기 게임
- 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
- 난수는 중복을 허용하지 않는다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : q
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
1스트라이크 0볼

숫자입력 : 182
0스트라이크 2볼

...

숫자입력 : 428
3스트라이크 0볼

축하합니다...몇x번만에 맞추셨습니다.
 */
package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseBall {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int i,j;
		int a=0;
		String usernum;
		int strike = 0;
		int count = 0;
		int ball=0;
		
		while(true) {
			System.out.print("게임을 실행하시겠습니까(Y/N) : ");
			 a = br.read();
			 br.read();
			 br.read();
			 if(a=='N'||a=='n')break;
			 else if(a=='y'||a=='Y') {
				 
				 System.out.println("게임을 시작합니다.");
				 
				 //변수 생성
				 
					 
				 for(i=0; i<com.length; i++) {
					 int rand = (int)(Math.random()*9)+1;
					 com[i] = rand;
					 for(j=0;j<i;j++) {
						 if(com[i]==com[j]) {
								i--;
								break;
						 }//중복 확인	
					 
					 }//for j
						
				 }//for i
				 for(i=0; i<com.length; i++) {
					 System.out.print(com[i]+" ");
				 }
				 
				 while(true) {
					 //숫자입력
					 strike=0;
					 ball=0;
					 System.out.print("숫자입력 : ");
					 usernum = br.readLine();
					 
					 for(i=0; i<user.length; i++) {
						 user[i] = usernum.charAt(i)-48;
					 }//for i 
					 for(i=0; i<user.length; i++) {
						 for(j=0; j<user.length; j++) {
							 if(com[i]==user[j]) {
								 if(i==j) {
									 strike++;
								 }else ball++;
							 }
						 }
					 }
					 
					 count++;
					 
					 if(strike==3)break;
					 else System.out.printf("%d스트라이크%d볼\n",strike,ball);
				 }
				 System.out.printf("축하합니다 %d번만에 맞추셨습니다\n",count);
				 break;
			 }//else if
			 
		}
		System.out.println("프로그램이 종료되었습니다.");
		

	}

}
