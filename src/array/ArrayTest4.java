/*
 65~90 ������ ������ 100�� �߻��Ͽ� ���ڷ� ����Ͻÿ�
- 1�ٿ� 10���� ����Ͻÿ�
- �� ���ڸ��� ��� ��µǾ����� ������ ����Ͻÿ�

[������]
Y M F K A W M V F W 
X E F G X Z U T M B 
I V B N L C J W D Q 
E M L T Q T D J N J 
A J S C S Y V U Q K 
F A G F D I G A G C 
S R N W L I G Q U O 
F M H W R V Z M B X 
B R F U N Z M R Z X 
Y A L L M W A Y B Q 
A�� ����6  B�� ����5  C�� ����3  
D�� ����3  E�� ����2  F�� ����7  
G�� ����5  H�� ����1  I�� ����3  
J�� ����4  K�� ����2  L�� ����5  
M�� ����8  N�� ����4  O�� ����1  
P�� ����0  Q�� ����5  R�� ����4  
S�� ����3  T�� ����3  U�� ����4  
V�� ����4  W�� ����6  X�� ����4  
Y�� ����4  Z�� ����4  
 */
package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		int i,j=0;;
		
		int[] ar = new int[100];
		int[] count = new int[26];
	
			for(i=0; i<ar.length; i++) {
				int rand = (int)(Math.random()*26)+65;
				ar[i] = rand;
				for(j=0; j<count.length; j++) {
					if(ar[i]==(j+65))count[j]++;
				}//for j
			}//for i
			
			for(i=0; i<ar.length; i++) {
				System.out.print((char)ar[i]+" ");
				if((i+1)%10==0)System.out.println();//10���� ���;		
			}//for
			
			for(i=0; i<count.length; i++) {
				System.out.print((char)(i+65)+"�� ����"+ count[i]+"  ");
				if((i+1)%3==0)System.out.println();
			}
	}
}

