package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {56,30,25,78,55};
		
		System.out.print("���� �� : ");
		for(int x : ar) {
			System.out.print(x+" ");
		}
		System.out.println();
		//���� - ��������
		int temp;
		for	(int i = 0; i<ar.length-1; i++) {
			for(int j = (i+1); j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		System.out.print("���� �� : ");
		for(int x : ar) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
