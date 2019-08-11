import java.sql.*;

public class Main {
    public static void main(String[] args) {
      try(Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Shop31818","postgres","admin")){
          PreparedStatement statement = con.prepareStatement("SELECT * FROM public.authors;");
          ResultSet resultSet = statement.executeQuery();
          while (resultSet.next()){
              System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "
                      +resultSet.getString(3)+" "+resultSet.getString(4));
          }
      }catch (SQLException e){
          System.out.println(e.getNextException());
      }
    }
}
