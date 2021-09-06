package multiArray;

public class MultiArray2 {

	public static void main(String[] args) {
		int[][]ar= new int[10][10];
		int i,j,k=0;
		int num=0;
		
		/*
		for(i=0; i<ar[k].length; i++) {k=i;
			for(j=0; j<ar.length; j++) {
				num++;
				ar[j][k]=num;
				
			}//for j
		}//for i */
		
		
		for(i=ar.length-1; i>=0; i--) {
			for(j=ar[i].length-1; j>=0; j--) {
				num++;
				ar[i][j] = num;
			}
		}

		for(i=0; i<ar.length; i++) {
			
			for(j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%5d", ar[i][j]));
			}//Ãâ·Â
			System.out.println();
		}
	}

}
