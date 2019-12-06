
package dblab;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;


 
public class Main {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/dbbooks";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            //load the driver class
            Class.forName(DRIVER);
            
            //establish connection
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            
            //create statement for quering database
            statement = connection.createStatement();
            
            //query database
            resultSet = statement.executeQuery("SELECT * FROM tblbooks");
            
            //process query results
            int i = 0;
            while(resultSet.next()){
                String author = {String} resultSet.getObject(2);
                String title = {String} resultSet.getObject(3);
                System.out.printf("%s: %s\n", author, title);
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLExxception ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex)
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }
    }

    private static class DriverManager {

        private static Connection getConnection(String DATABASE_URL, String USER, String PASSWORD) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DriverManager() {
        }
    }
    
}
