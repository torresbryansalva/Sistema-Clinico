package conectar;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Connectar {
//ATRIBUTOS DE LA CLASE
    String ip ="";
    String nombreDB ="";
    String user = "";
    String passwd = "";
    //ESTE ES EL CONSTRUCTOR
    public Connectar(String  _ip, String _nombreDB , String _user, String _passwd ) { //CARACTERES
        
        this.ip = _ip; //EL _ip EL VALOR QUE TOMA ES ALMACENANO EN ip
        this.nombreDB = _nombreDB;
        this.user = _user;
        this.passwd = _passwd;

    }
 Connection conexion=null;
        public Connection conexion() throws SQLException{// este metodo devuelve una conxion,
       //  devuelve un objeto de la clase conxion
       //  Connection conexion=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
           // System.out.println("Driver de MySql : OK"); //ESTO. ES LO QUE SE ESPERO COMO RESULTADO
        conexion = DriverManager.getConnection ("jdbc:mysql://"+ip+"/"+nombreDB , user , passwd );
       //     JOptionPane.showMessageDialog(null," Conexion realizada con exito!!!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectar.class.getName()).log(Level.SEVERE, null, ex);
           // System.out.println("Driver de MySql : FALLO");
        }
        
          //conexion = DriverManager.getConnection ("jdbc:mysql://"+ip+"/"+nombreDB , user , passwd );
            //System.out.println("Conectado exitosamente a "+ip);


        return conexion;
     }

}