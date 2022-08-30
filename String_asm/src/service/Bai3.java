package service;

import java.util.Scanner;

public class Bai3 { 
	
	public static void main(String[] args) {
		nhap();	
	}
	
	static void nhap() {
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		System.out.println("str trc khi chuẩn hóa: "+str );
		chuanHoa(str);
		System.out.println();
	}
	
	static void chuanHoa(String s) {
		s = s.toLowerCase();// viết thường tất cả xâu 
		String [] ss;
		String s2 = "";
		ss = s.split(" ");
		for(int i =0;i<ss.length;i++) {
			String s1 = "";
			if(ss[i].length() !=0) {
				s1+= Character.toUpperCase(ss[i].charAt(0));// tiền hành viết hoa chữu cái đầu mỗi từ toUpperCase()
				// nối các từ lại với nhau,
				if(ss[i].length() >1) s1+= ss[i].substring(1);
				s2 +=s1;
				if(i<ss.length) s2+= " ";
			}
		}
		System.out.print ("str sau khi chuẩn hóa: "+s2);
	}
}
