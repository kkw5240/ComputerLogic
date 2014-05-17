/**
 * 
 */
package HW4.num3;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author		: PROP
 * @date		: 2014. 5. 17.
 * @explanation	: 
 */
public class UserInterface {
	private Info info;
	
	/** Constructor **/
	public UserInterface(Info info) {
		this.info = info;
	}

	/** User Input **/
	public int inputInfo() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("<< Input >>");
		
		System.out.print(" # TableSize: ");
		try {
			info.setTableSize(Integer.valueOf(input.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print(" # Number of Cheese: ");
		try {
			info.setnCheeses((Integer.valueOf(input.readLine())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(" # Position of Cheeses");
		for(int i=0; i<info.getnCheeses(); i++) {
			int x = 0;
			System.out.print("  " +(i+1) +".X: ");
			try {
				x = Integer.valueOf(input.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			int y = 0;
			System.out.print("  " +(i+1) +".Y: ");
			try {
				y = Integer.valueOf(input.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			info.setpCheeses(new Point(x, y));
		}
		
		return 0;
	}
	
	/** View **/
}
