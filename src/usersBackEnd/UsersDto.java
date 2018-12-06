package usersBackEnd;


public class UsersDto {

	private Long id;
	private String Name;
	private String Address;
	private String phone;
	private String username;
	private String password;
	
	public UsersDto() {
		
	}
	public UsersDto(Long id, String name, String address, String phone, String username, String password) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
