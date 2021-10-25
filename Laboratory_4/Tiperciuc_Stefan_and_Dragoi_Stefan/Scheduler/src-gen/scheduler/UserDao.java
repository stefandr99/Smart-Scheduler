/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

public interface UserDao implements Dao<DatabaseUserEntry> {
	DatabaseUserEntry get(int id) {
		DatabaseConnection conn = DatabaseConnection.getInstance();
		PreparedStatement stmt=con.prepareStatement("select * from users where id = ?");  
		stms.setInt(1, id);
		ResultSet rs=stmt.executeQuery(); 
		rs.next()
		DatabaseUserEntry user = new DatabaseUserEntry(rs.getString(1), rs.getString(2));
		
		return user;
	}

	void delete(DatabaseUserEntry obj) {
		DatabaseConnection conn = DatabaseConnection.getInstance();
		PreparedStatement stmt=con.prepareStatement("delete from users where username = ?");  
		stms.setString(1, obj.username);
		
		stmt.executeUpdate();
	}
} // UserDao
