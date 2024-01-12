package optionalTest;

public class User {
	private Long id;
	private String userName;
	private String userId;
	private String userPassword;
	private static Long seq;
	
	static {
		seq = 0L;
	}
	
	{
		this.id = seq++;
	}
	
	public User() {;}

	public User(String userName, String userId, String userPassword) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	
	
}
