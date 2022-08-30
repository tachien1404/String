package service;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {

	public static void main(String[] args) {
		System.out.println("Nhập 1 xâu vào:");
		String input = new Scanner(System.in).nextLine();
		timMaxXau(input);
	}
	
	public static void timMaxXau(String input) {
		StringTokenizer strToken = new StringTokenizer(input);
		int Max, i=1,lengthStr;
		Max = strToken.nextToken().length();
	    int viTriMax = i;
	    while(strToken.hasMoreTokens()) {
	    	lengthStr = strToken.nextToken().length();
	    	i++;
	    	
	    if(Max <lengthStr) {
	    	Max = lengthStr;
	    	viTriMax = i;
	    }
	    }
	    System.out.println("độ dài lớn nhất là: "+Max+" ở vị trí"+viTriMax );
	}

}
