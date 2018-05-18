package hr;

import java.sql.SQLException;
import java.util.List;

public class TestOdczytu {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

	DostępDoBazy db = new DostępDoBazy();
	List<Employee> allEmployees = db.getAllEmployees();
	System.out.println("Rozmiar listy: "+ allEmployees.size());
	for (Employee employee : allEmployees) {
		System.out.println(employee);
	}
	
	}	
}
