//program to display all records from a table using Java Database Connectivity (JDBC)

import java.sql.*;


class   Program{

    // Main Method
    public static void main(String[] args) {
        
        try{
            String driver="com.mysql.jdbc.Driver"; // for mysql
            // Registring Driver
            Class.forName(driver);

            // Creating Connection Object
            String url="jdbc:mysql://localhost:<port number>/<database name)";
            String u="<your username>";
            String p="<your password>";
            Connection con= DriverManager.getConnection(url, u, p);

            // Creating Statement object
            Statement smt=con.createStatement();

            //Executing query
            String query="SELECT * FROM student";
            ResultSet rs=smt.executeQuery(query);

            // Printing Details
            System.out.println("Roll No.|       Name         |    Mark  |");
            
            while(rs.next()){
                System.out.println("   "+rs.getInt(0)+"    "+rs.getString(1)+"   "+rs.getInt(2) );

            }

        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
