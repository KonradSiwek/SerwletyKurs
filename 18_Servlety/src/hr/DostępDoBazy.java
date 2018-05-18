package hr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DostępDoBazy {
private final String url = "jdbc:postgresql://localhost/hr";
private final String user = "hr";
private final String password = "abc123";
/**łączy się z bazą dancych i odczytuje listę wszystkich pracowników
 * @return
 * @throws SQLException 
 * @throws ClassNotFoundException 
 */
public List<Employee> getAllEmployees() throws SQLException, ClassNotFoundException{
	final String sql = "SELECT employee_id, first_name, last_name,"
  			 + " job_title, salary, hire_date, department_name,"
  			 + " street_address, postal_code, city, country_name"
  			 + " FROM employees"
  			 + " JOIN jobs USING(job_id)"
  			 + " LEFT JOIN departments USING(department_id)"
  			 + " LEFT JOIN locations USING(location_id)"
  			 + " LEFT JOIN countries USING(country_id)"
  			 + " ORDER BY employee_id";

	
	Class.forName("org.postgresql.Driver");
	
	ArrayList<Employee> lista = new ArrayList<>();
	Connection con = DriverManager.getConnection(url, user, password);
	
	PreparedStatement stmt = con.prepareStatement(sql);
	ResultSet rs = stmt.executeQuery();
	
	while(rs.next()) {
		Employee emp = new Employee(
		rs.getInt(1),
		rs.getString(2),
		rs.getString(3),
		rs.getString(4),
		rs.getInt(5),
		rs.getDate(6).toLocalDate(),
		rs.getString(7),
		rs.getString(8),
		rs.getString(9),
		rs.getString(10),
		rs.getString(11)
		);
		lista.add(emp);
	}
	
	
	return lista;
	
}
}
