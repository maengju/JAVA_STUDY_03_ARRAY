package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[] ar = new int[5]; //int형은 개당 4byte 여기선 현재 20byte사용
		System.out.println("배열명 ar = "+ ar);
		ar[0] = 27;
		ar[1] = 36;
		ar[2] = 25;
		ar[3] = 78;
		ar[4] = 62;

		System.out.println("배열의 크기 = "+ ar.length);
		for(int i = 0; i < ar.length; i++) {
			System.out.printf("ar[%d] = %d\n",i,ar[i]);
		}
		System.out.println("거꾸로 출력 ");
		for(int i = ar.length-1 ; i>=0; i--) {
			System.out.printf("ar[%d] = %d\n",i,ar[i]);
		}
		System.out.println("짝수인 데이터만 출력 ");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				System.out.printf("ar[%d] = %d\n",i,ar[i]);
			}
		}
		System.out.println("확장형 for"); //배열에 데이터 입력은 힘들지만 출력하기엔 편하다.
		for(int data : ar) {
			System.out.println(data);
		}
		
	}

}
