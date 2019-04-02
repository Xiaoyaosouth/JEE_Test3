package pojo;

/**
 * 年龄pojo
 */
public class Age {
	private int age;
	private int year;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 计算年龄
	 */
	public void countAge() {
		age = age + year;
	}
	
	@Override
	public String toString() {
		return Integer.toString(age);
	}
}
