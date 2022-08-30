package service;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {

	public static void main(String[] args) {
		System.out.println("Nhập xâu họ tên theo cấu trúc họ - đệm - tên");
		String str = new Scanner(System.in).nextLine();
		System.out.println("Họ tên được sắp xếp theo cấu trúc tên - ho - dem là: "+sxHoTen(str));
	}

	public static String sxHoTen(String input) {
		StringTokenizer strToken = new StringTokenizer(input, " ");
		String ho = strToken.nextToken();
		String dem = strToken.nextToken();
		String ten = strToken.nextToken();
		String strOutput = ten + " " + ho + " "+ dem;
		return strOutput;
	}

}
