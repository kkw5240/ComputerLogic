/**
 * 
 */
package HW4.num3;

import java.awt.Point;
import java.util.ArrayList;

/**
 * @author		: PROP
 * @date		: 2014. 5. 17.
 * @explanation	: 
 */
public class Info {
	private int tableSize;
	private int nCheeses;
	private ArrayList<Point> pCheeses = new ArrayList<Point>();
	
	/** Getter & Setter **/
	public int getTableSize() {
		return tableSize;
	}
	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}
	
	public int getnCheeses() {
		return nCheeses;
	}
	public void setnCheeses(int nCheeses) {
		this.nCheeses = nCheeses;
	}
	
	public Point getpCheeses(int index) {
		return pCheeses.get(index);
	}
	public void setpCheeses(Point pCheese) {
		this.pCheeses.add(pCheese);
	}
}
