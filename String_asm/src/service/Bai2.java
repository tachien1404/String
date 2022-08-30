package service;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		System.out.println("Nhập xâu ký tự:");
		String str = new Scanner(System.in).nextLine();
		chuyenDangXenKe(str);
	}

	
	public static void chuyenDangXenKe(String s) {
		 String s1 = s.toLowerCase();
		char[] arr = s1.toCharArray();	
		String[] arr2 = new String[100];
		
		for(int i=0;i<arr.length;i++) {
			arr2[i] = String.valueOf(arr[i]);
			}
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr2[i] = arr2[i].toUpperCase();
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr2[j]);
		}
}
}
