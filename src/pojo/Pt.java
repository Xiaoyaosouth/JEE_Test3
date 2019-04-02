package pojo;

/**
 * 点对象pojo
 */
public class Pt {
	private int x;
	private int y;
	private int move; // 记录要移动的格数

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

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	/**
	 * x,y各移动几格
	 */
	public void doMove() {
		x = x + move;
		y = y + move;
	}

	@Override
	public String toString() {
		return Integer.toString(x) + "," + Integer.toString(y);
	}
}
