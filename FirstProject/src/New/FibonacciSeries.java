package Tasks;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int n = sc.nextInt();
		int f = 0, s = 1;
		int t;
		for(int i = 0; i < n; i++) {
			System.out.print(f+" ");
			t = f + s;
			f = s;
			s = t;
				
		}
		
		sc.close();

	}

}
