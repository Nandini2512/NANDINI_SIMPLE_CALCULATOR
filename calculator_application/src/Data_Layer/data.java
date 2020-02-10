package Data_Layer;
import java.sql.*;
public class data {
	public void daaa(int a,int b,int c,String s1)
	{
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
			PreparedStatement p=conn.prepareStatement("insert into "+s1+" values(?,?,?) ");
			p.setInt(1, a);
			p.setInt(2, b);
			p.setInt(3, c);
			p.executeUpdate();
			p.close();
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();
		}
	}

}
