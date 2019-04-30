/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import conectar.Connectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB 1
 */
public class VerData 
{
    Connection coneon;
    Connectar con = new Connectar("localhost", "dbclinica", "root", "");// creando los apuntadores necesarios para nuestra base de datos
    public void Mostrar() //es un metodo de la clase de ver data
    {
        
        

        try { //intentar si falla o no, bota un mensaje, que intente y no salga del programa
            this.coneon = con.conexion(); // estoy asignando 
            Statement st = coneon.createStatement();

            ResultSet rs = st.executeQuery("SELECT administrador.`clave` FROM `administrador` WHERE administrador.`admi`='bryan'");
            rs.next();
            System.out.println(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(VerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public String getPass(String user)
    {
        String pass = "";
        try {
            this.coneon = con.conexion();
            Statement st = coneon.createStatement();

            ResultSet rs = st.executeQuery("SELECT administrador.`clave` FROM `administrador` WHERE administrador.`usuario`='" + user +"'");
            //System.out.println("SELECT `clave` FROM admi WHERE admi=`" + user +"`");
           // System.out.println(rs.getString(1));
            if(rs.next())
            {
                pass = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pass;
    }
    
    public String getEspc(String users){
       String admin="";
           try {
                this.coneon =con.conexion();
                Statement st = coneon.createStatement();
                
                ResultSet rss =st.executeQuery("SELECT administrador.`especialidad` FROM `administrador` WHERE administrador.`usuario`='"+users+"'");
                 
                if(rss.next()){
                  admin=rss.getString(1);
                }                
        } catch (Exception e) {

        }
       
       return admin;
    }
    
 public String getHora(String ffech){
       String ff="";
           try {
                this.coneon =con.conexion();
                Statement st = coneon.createStatement();
                
                ResultSet rss =st.executeQuery("SELECT citas.`hora` FROM `citas` WHERE citas.`fecha`='"+ffech+"'");
                 
                if(rss.next()){
                  ff=rss.getString(1);
                }                
        } catch (Exception e) {

        }
       // retorna la hora encontrada para una fecha especifica
       return ff;
    }
     public String getEspecialista(String hors){
       String ff ="";
           try {
                this.coneon =con.conexion();
                Statement st = coneon.createStatement();
                
                ResultSet rss =st.executeQuery("SELECT citas.`especialidad` FROM `citas` WHERE citas.`hora`='"+hors+"'");
                 
                if(rss.next()){
                  ff=rss.getString(1);
                }                
        } catch (Exception e) {

        }
       // retorna una especialidad encontrada para una fecha especifica
       return ff;
    }
    // aca encuentra una fecha en especifico
    /*
    public String getFecha(String fec){
    ResultSet rs;   
    String fecha="";
    String sql="SELECT * FROM citas WHERE fecha = ?";
           try {
               this.coneon= con.conexion();
               PreparedStatement pmn =coneon.prepareStatement(sql);
               pmn.setString(1,fec);
               rs=pmn.executeQuery();
               if(rs.next()){
                   fecha=rs.getString("fecha");
               }else{
        JOptionPane.showMessageDialog(null, "Error en verdata fecha");    
        }
               
        } catch (Exception e) {
        }
    return fecha;
    }*/ 
}
