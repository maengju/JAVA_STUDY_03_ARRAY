/*
�߱� ���� - ���� ���߱� ����
- ũ�Ⱑ 3���� ������ �迭�� ��� 1~9������ ������ �߻��Ѵ�
- ������ �ߺ��� ������� �ʴ´�

[������]
������ �����Ͻðڽ��ϱ�(Y/N) : w
������ �����Ͻðڽ��ϱ�(Y/N) : q
������ �����Ͻðڽ��ϱ�(Y/N) : y

������ �����մϴ�

�����Է� : 123
1��Ʈ����ũ 0��

�����Է� : 182
0��Ʈ����ũ 2��

...

�����Է� : 428
3��Ʈ����ũ 0��

�����մϴ�...��x������ ���߼̽��ϴ�.
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
			System.out.print("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			 a = br.read();
			 br.read();
			 br.read();
			 if(a=='N'||a=='n')break;
			 else if(a=='y'||a=='Y') {
				 
				 System.out.println("������ �����մϴ�.");
				 
				 //���� ����
				 
					 
				 for(i=0; i<com.length; i++) {
					 int rand = (int)(Math.random()*9)+1;
					 com[i] = rand;
					 for(j=0;j<i;j++) {
						 if(com[i]==com[j]) {
								i--;
								break;
						 }//�ߺ� Ȯ��	
					 
					 }//for j
						
				 }//for i
				 for(i=0; i<com.length; i++) {
					 System.out.print(com[i]+" ");
				 }
				 
				 while(true) {
					 //�����Է�
					 strike=0;
					 ball=0;
					 System.out.print("�����Է� : ");
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
					 else System.out.printf("%d��Ʈ����ũ%d��\n",strike,ball);
				 }
				 System.out.printf("�����մϴ� %d������ ���߼̽��ϴ�\n",count);
				 break;
			 }//else if
			 
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		

	}

}
