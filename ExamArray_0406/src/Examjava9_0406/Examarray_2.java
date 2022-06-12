package Examjava9_0406;

public class Examarray_2 {

	public static void main(String[] args) {
		/* 다차원 배열 / 가변길이배열(길이가 다른 것들은 관리할 수 있는)
		 */
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		int[] arr1 = new int[] {n1,n2,n3};
		int[] arr2 = new int[] {4,5,6};
		int[] arr3 = new int[] {7,8,9};
		
		//배열을 배열로
		int [][] arr11 = new int [][] {
			arr1,
			arr2,
			arr3
		};
		int [][] arr22 = new int [][] {
			{10, 20, 30},
			{11, 22, 33},
			{111,222,333}
		};
		}
	}


