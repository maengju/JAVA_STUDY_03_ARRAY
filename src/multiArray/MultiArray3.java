/*
[실행 결과]
1 2 3 6
4 5 6 15
7 8 9 24
0 0 0 0
*/


package multiArray;

public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}}; //고정길이
		int i,j,k=0;
		int sum = 0;
		
		//합
		
		for(i=0; i<ar.length-1; i++) {
			for(j=0; j<ar[i].length-1; j++) {
				ar[3][i] += ar[j][i];
				ar[3][3] += ar[i][j];
				ar[i][3] += ar[i][j];
			}
		}
			
			
		for(i=0; i<ar.length; i++) {
				
			for(j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));
			}//출력
			System.out.println();
			}
	}

}
