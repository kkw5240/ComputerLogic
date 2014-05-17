/**
 * 
 */
package HW4.num2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author		: PROP
 * @date		: 2014. 5. 16.
 * @explanation	: 
 */
public class SumOfSquares {	
	public static void main(String args[]) {
		int N = 0;
		
		System.out.println("<< 자연수 N을 제곱의 합으로 나타낼 때 피룡한 최소 항의 개수 >>");
		
		System.out.print(" # Input N: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.valueOf(input.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(" # 주어진 자연수 N(" +N +")을 제곱수의 합으로 나타낼 때, 그 제곱수 항의 최소 개수는  '" +count(N) +"'입니다.");
	}
	
	private static int count(int N) {
		int cnt = 0;
		
		while(N != 0) {
			N -= Math.pow((int)Math.sqrt(N),2);
			cnt ++;
		}
		
		return cnt;
	}
}
