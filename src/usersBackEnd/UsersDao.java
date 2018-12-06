package usersBackEnd;

import java.util.List;

public interface UsersDao {

	
	public List<UsersEntity> getAllUsers();
	public UsersEntity getUserById(long id);
	public UsersEntity getUserByName(String username);
	public String  updateUser(UsersEntity user);
	public String  deleteUser(UsersEntity user);
	public UsersEntity  addUser(UsersEntity user);

	
	
}
