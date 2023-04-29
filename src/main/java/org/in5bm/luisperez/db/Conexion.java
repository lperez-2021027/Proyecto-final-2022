
package org.in5bm.luisperez.db;

/**
 *
 * @author Luis Carlos Pérez
 * @date 26/09/2022
 * @time 11:46:11
 * 
 *Código técnico: IN5BM
 *
 */

import com.mysql.cj.jdbc.exceptions.CommunicationsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
    
    private final String HOST = "127.0.0.1";
    private final String PORT = "3306";
    private final String DB = "db_control_materia_in5bm";
    private final String USER = "kinal";
    private final String PASS = "admin";
    private Connection conexion;
    private static Conexion instancia;
    
    private final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB + 
            "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    
    
    public Connection getConexion() {
        return conexion;
    }
    
    public static Conexion getInstance() {
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    private Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (CommunicationsException e) {
            System.err.println("Imposible establecer conexión con el servidor de MYSQL"
                    + "Verificar el nombe del servidor: " + HOST + " y número de puerto: " + PORT);
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } catch (Exception e) {
            System.err.println("Se produjo un erro al intentar establecer una conexión a la base de datos");
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement pstmt) {
        try {
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
