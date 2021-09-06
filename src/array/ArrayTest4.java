/*
 65~90 사이의 난수를 100개 발생하여 문자로 출력하시오
- 1줄에 10개씩 출력하시오
- 각 문자마다 몇개씩 출력되었는지 개수를 출력하시오

[실행결과]
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
A의 개수6  B의 개수5  C의 개수3  
D의 개수3  E의 개수2  F의 개수7  
G의 개수5  H의 개수1  I의 개수3  
J의 개수4  K의 개수2  L의 개수5  
M의 개수8  N의 개수4  O의 개수1  
P의 개수0  Q의 개수5  R의 개수4  
S의 개수3  T의 개수3  U의 개수4  
V의 개수4  W의 개수6  X의 개수4  
Y의 개수4  Z의 개수4  
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
				if((i+1)%10==0)System.out.println();//10개씩 출력;		
			}//for
			
			for(i=0; i<count.length; i++) {
				System.out.print((char)(i+65)+"의 개수"+ count[i]+"  ");
				if((i+1)%3==0)System.out.println();
			}
	}
}

