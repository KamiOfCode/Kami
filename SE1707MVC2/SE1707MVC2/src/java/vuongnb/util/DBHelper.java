/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuongnb.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author ba-vuong
 */
public class DBHelper implements Serializable{
    public static Connection createConnection() throws /*ClassNotFoundException,*/ SQLException, NamingException{
        
        // 1. lấy context hiện hành
        Context currentContext = new InitialContext();
        // 2. look up tomcat context
        Context tomcatContext = (Context) currentContext.lookup("java:comp/env");
        // 3. look up datasource
        DataSource ds = (DataSource) tomcatContext.lookup("SE1707DS");
        // 4. open connection from datasource
        Connection con = ds.getConnection();
        
        return con;
                
//        // 1. load driver
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        // 2. create connection string url
//        String url = "jdbc:sqlserver://localhost:1433;databaseName=SE1707;instanceName=SQLEXPRESS";
//        // 3. open connection
//        Connection con = DriverManager.getConnection(url, "sa", "1122");
//        
//        return con;
    }
}
