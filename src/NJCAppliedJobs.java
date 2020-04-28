import java.sql.*;


public class NJCAppliedJobs {

	public static void main(String[] args) {
		
        try (Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/appliedJobs", "postgres", "M136430r")) {
           
            System.out.println("Connected to PostgreSQL database!");
        
            Statement st = connect.createStatement();
            System.out.println("Reading Table Data");
            
            ResultSet resultSet = st.executeQuery("SELECT * FROM public.companies");
            while (resultSet.next()) {
                    for (int i=1; i<6; i++)System.out.print(resultSet.getString(i) + " ");
                    System.out.println();
                }
        } 
        catch (SQLException e) {
            System.out.println("Connection Failure.");
            e.printStackTrace();
        }
	}

}
