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
			System.out.print("������ �����Ͻðڽ��ϱ�(Y/N) : ");
			yn = System.in.read();
			 System.in.read();
			 System.in.read();	
		}while(yn != 'Y' && yn != 'y'&& yn != 'N' && yn != 'n');
		
		if(yn == 'Y' || yn == 'y') {
			System.out.print("\n ������ �����մϴ�.");
			
			//�����߻�
			for(i=0; i<com.length; i++) {
				com[i]=(int)(Math.random()*9)+1;
				
				//�ߺ�üũ
				for(j=0;j<i;j++) {
					if(com[i]==com[j]) {
						i--;
						break;
					}
				}//�ߺ�üũ
			}//�����߻�
			
			//���� ���߱�
			while(true) {
				 System.out.print("�����Է� : ");
				 count++;
				 usernum = br.readLine();
				 
				 for(i=0; i<user.length; i++) {
					 user[i] = usernum.charAt(i)-48;
				 }
				 
				 //��
				 strike = ball = 0;
				 for(i=0; i<com.length; i++) {
					 for(j=0; j<user.length; j++) {
						 if(com[i]==user[j]) {//�����Ͱ� �������̳�
							 if(i==j) {
								 strike++;
							 }else ball++;
							 
						 }
					 }
				 }//for i
				 System.out.println(strike+"��Ʈ����ũ\t"+ball+"��");
				 if(strike==3)break;
				 
				 
			}//while
			System.out.println();
			System.out.println("�����մϴ� "+count+"������ ���߼̽��ϴ�.");
			
		}//if
		
		System.out.println("���α׷� ����");
		
		
		
	}

}
