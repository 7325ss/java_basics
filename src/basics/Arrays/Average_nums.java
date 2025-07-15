package basics.Arrays;

import java.util.Scanner;

import basics.thread.MyApp;

public class Average_nums {
	
	@Override 
	public String toString() {
		return "Average NUmbers";
	}
	
	public static void main(String[] args) {
		
		int[] arr =  {1, 2, 4, 3, 5};
		int total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		String s = sc.nextLine();
		for(int i:arr) 
			total+=i;
		
		System.out.println("Average= "+total/arr.length);
		
		MyApp mp = new MyApp();
		Average_nums avg = new Average_nums();
		System.out.println(mp.toString());
		
		System.out.println();
	}
}
