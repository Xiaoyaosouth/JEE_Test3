package pojo;

public class Pt {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * x,y各移动3格
	 */
	public void moveThree() {
		x = x + 3;
		y = y + 3;
	}
	
	/**
	 * x,y各移动几格
	 * @param move 要移动的格数
	 */
	public void move(int move) {
		x = x + move;
		y = y + move;
	}

	public String toString() {
		return Integer.toString(x) + "," + Integer.toString(y);
	}
}
