/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

public class UserRepository implements IUserRepository {
	boolean registerUser(DatabaseUserEntry user) {
		DatabaseConnection conn = DatabaseConnection.getInstance();
		PreparedStatement stmt=con.prepareStatement("insert into users(username, password) values (?, ?)");  
		stms.setString(1, user.username);
		stms.setString(2, user.password);
		
		int i =stmt.executeUpdate() != 0;
		return i != 0;
	}

	DatabaseUserEntry loginUser(String username, String password) {
		DatabaseConnection conn = DatabaseConnection.getInstance();
		PreparedStatement stmt=con.prepareStatement("select * from users where username = ? and password = ?");  
		stms.setString(1, username);
		stms.setString(2, password);
		ResultSet rs=stmt.executeQuery(); 
		rs.next()
		DatabaseUserEntry user = new DatabaseUserEntry(rs.getString(1), rs.getString(2));
		
		return user;
	}

} // UserRepository
