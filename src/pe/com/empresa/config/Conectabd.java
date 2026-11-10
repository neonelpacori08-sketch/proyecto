/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.empresa.config;
import java.sql.*;
/**
 *
 * @author crai.alumno
 */
public class Conectabd {
    private static Connection c = null;
    private static final String BD ="Academico.db";
    private static final String DRIVER ="org.sqlite.JDBC";
    private static final String URL =  "jdbc:sqlite:";
    
    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            if (c==null ||c.isClosed()) 
            {
                c=DriverManager.getConnection(URL+  BD);
                
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName()+":"+e.getMessage());
            System.exit(1);
        }
        
        System.out.println("BASE DE DATOS :"+BD+"OK");
        return c;
    }
}
