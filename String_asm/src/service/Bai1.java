package service;

public class Bai1 {
public static int[] arr_1_9 = {1,2,3,4,5,6,7,8,9};
public static int[] arr_0_9 = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
	int count =0;
		StringBuilder sb;
	for(int a :arr_1_9) {
		for(int b:arr_0_9) {
			for(int c:arr_0_9) {
				sb = new StringBuilder();
				sb.append(a).append(b).append(c).append(c).append(b).append(a);
			System.out.println(sb.toString());
			count++;
			}
		}
	}
	System.out.println("tổng có "+ count +" số thuận nghịch có 6 chữ số");
	}

}
