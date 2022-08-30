package service;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
	System.out.println("Nhập xâu 1:");
	String xau1 = new Scanner(System.in).nextLine();
	System.out.println("Nhập xâu 2:");
	String xau2 = new Scanner(System.in).nextLine();
	if(xau1.indexOf(xau2)<0) {
		System.out.println("xâu 2 không có trong xâu 1");
	}else {
		System.out.println(xau1.replaceAll(xau2,""));
	}
}
}
