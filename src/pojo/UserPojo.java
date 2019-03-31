package pojo;

/**
 * <ul>
 * 用户实体类
 * </ul>
 * <li>userName:用户姓名</li>
 * <li>password:密码</li>
 *
 */
public class UserPojo {

	private String userName;
	private String password;

	public UserPojo() {

	}

	/**
	 * 构造方法
	 * @param userName 用户名
	 * @param password 密码
	 */
	public UserPojo(String userName,String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
