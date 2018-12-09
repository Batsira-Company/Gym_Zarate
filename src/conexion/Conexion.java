/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author soner
 */
public class Conexion {
     public static Connection conecta(String user,String password,String base) {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + base+"?useSSL=false", user, password);
              System.out.println("Conexion exitosa");      
            return (cn);
                        

        } catch (Exception er) {
            JOptionPane.showMessageDialog(null,"Error " + er+" compruebe su conexion a internet");
            return (cn);
        }
    
}
     public static JComboBox llenarCombo(String query,JComboBox selector) {
        try {
            Connection cn = Conexion.conecta ("brenda","sasa","gym_zarate");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);
            selector.removeAllItems();
            selector.addItem("Escoge opcion");
            
            while (rs.next()) {
                selector.addItem(rs.getString(1));
            }
           
            return selector;
        } catch (Exception e) {
            System.out.println("Error en llenado de combo " + e);
            return null;
        }
    }
    
}
