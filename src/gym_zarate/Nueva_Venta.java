/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_zarate;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Ivette
 */
public class Nueva_Venta extends javax.swing.JInternalFrame {

    /**
     * Creates new form Nueva_Venta
     */
    public Nueva_Venta() {
        initComponents();
       Lbl_Num_PAgos.setVisible(false);
       CBX_Num_Pagos.setVisible(false);
       Lb_Periodo.setVisible(false);
       CBX_Tiperiodo.setVisible(false);
       Lb_Importe.setVisible(false);
       TXT_Importe.setVisible(false);
       Lb_Restante.setVisible(false);
       TXT_Resante.setVisible(false);
               
        ListarCombo();
        AutoCompleteDecorator.decorate(CBX_Produc);
    }
       String ar1[]={"PRODUCTO","PRECIO","CANTIDAD","SUBTOTAL","TIPO_VENTA","N° PAGOS","PERIODO","IMPORTE","RESTANTE"};
String ar2[][]=new String [1][9];
 double Cant = 0;
 double Precio = 0;
 String Descrip = "";
  int  i =0;
  String temp[][]=new String [25][9];
     private String[][] llenarArreglo() {
                temp[i][0]=CBX_Produc.getSelectedItem().toString();
                temp[i][1]= Precio+"";
                temp[i][2]= Cant+"";
                temp[i][3]= (Precio*Cant)+"";
                temp[i][4]= CBX_Tipventa.getSelectedItem().toString();
                temp[i][5]="";
                temp[i][6]="";
                temp[i][7]="";
                temp[i][8]="";
                i++;
            return temp;
    }
     
 private void ListarCombo() {
        try {
            Connection c = Conexion.conecta("brenda", "sasa", "pacifico");
            CBX_Produc = Conexion.llenarCombo("select Descripcion from productos", CBX_Produc);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TXT_Num_clien = new javax.swing.JTextField();
        Lbl_Num_PAgos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TXT_telefono1 = new javax.swing.JTextField();
        TXT_Subtotal = new javax.swing.JTextField();
        TXT_cantidad = new javax.swing.JTextField();
        CBX_Produc = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TXT_nombrecli = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TXT_apellidopacli = new javax.swing.JTextField();
        TXT_apellidomacli = new javax.swing.JTextField();
        CBX_Num_Pagos = new javax.swing.JComboBox<>();
        CBX_Tiperiodo = new javax.swing.JComboBox<>();
        Lb_Importe = new javax.swing.JLabel();
        TXT_Importe = new javax.swing.JTextField();
        Lb_Restante = new javax.swing.JLabel();
        TXT_Resante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        Lb_Periodo = new javax.swing.JLabel();
        CBX_Tipventa = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));
        setClosable(true);
        setIconifiable(true);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Realizar venta.");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 255));
        jLabel16.setText("VENTAS.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("PRODUCTO");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("CANTIDAD");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("N° CLIENTE");
        jLabel9.setToolTipText("");

        TXT_Num_clien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Num_clienActionPerformed(evt);
            }
        });

        Lbl_Num_PAgos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbl_Num_PAgos.setForeground(new java.awt.Color(0, 0, 204));
        Lbl_Num_PAgos.setText("N° PAGOS");
        Lbl_Num_PAgos.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("TIPO VENTA.");
        jLabel11.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("TOTAL A PAGAR.");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText("SUBTOTAL");
        jLabel14.setToolTipText("");

        TXT_Subtotal.setEditable(false);

        TXT_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_cantidadActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("NOMBRE");
        jLabel15.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("APELLIDO PATERNO.");

        TXT_nombrecli.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setText("APELLIDO MATERNO.");

        TXT_apellidopacli.setEditable(false);

        TXT_apellidomacli.setEditable(false);

        CBX_Num_Pagos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CBX_Num_Pagos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9" }));

        CBX_Tiperiodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Lb_Importe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_Importe.setForeground(new java.awt.Color(0, 0, 204));
        Lb_Importe.setText("IMPORTE");
        Lb_Importe.setToolTipText("");

        Lb_Restante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_Restante.setForeground(new java.awt.Color(0, 0, 204));
        Lb_Restante.setText("RESTANTE");
        Lb_Restante.setToolTipText("");

        TXT_Resante.setEditable(false);

        Lista.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lista.setForeground(new java.awt.Color(0, 0, 204));
        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "PRECIO", "CANTIDAD", "SUBTOTAL", "TIPO DE VENTA", "N° PAGOS", "PERIODO", "IMPORTE", "RESTANTE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Lista);
        if (Lista.getColumnModel().getColumnCount() > 0) {
            Lista.getColumnModel().getColumn(0).setPreferredWidth(300);
            Lista.getColumnModel().getColumn(4).setPreferredWidth(150);
            Lista.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        Lb_Periodo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lb_Periodo.setForeground(new java.awt.Color(0, 0, 204));
        Lb_Periodo.setText("PERIODO");
        Lb_Periodo.setToolTipText("");

        CBX_Tipventa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CBX_Tipventa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN PAGO", "VARIOS PAGOS" }));
        CBX_Tipventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBX_TipventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addComponent(TXT_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(Lbl_Num_PAgos)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBX_Num_Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Lb_Periodo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBX_Tiperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Lb_Importe)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Lb_Restante)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_Resante, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBX_Produc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXT_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXT_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CBX_Tipventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(255, 255, 255)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXT_Num_clien, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(TXT_apellidopacli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(TXT_apellidomacli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXT_nombrecli, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel15)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel17)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel18))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TXT_Num_clien, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_nombrecli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_apellidopacli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT_apellidomacli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(TXT_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBX_Produc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(TXT_Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(CBX_Tipventa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_Num_PAgos)
                    .addComponent(CBX_Num_Pagos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Periodo)
                    .addComponent(CBX_Tiperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Importe)
                    .addComponent(TXT_Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lb_Restante)
                    .addComponent(TXT_Resante, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXT_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_Num_clienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Num_clienActionPerformed
try{
            //last() envia al final de la tabla
            //previous() se va al anterior
            //first se va al princicipo
            String Num = "";
            Num = TXT_Num_clien.getText();

            Connection cn = Conexion.conecta("brenda", "sasa", "Gym_Zarate");
            Statement st= cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//scroll hace que te muevas a la posicion que desees
            ResultSet rs=st.executeQuery("select Nombre,Apellido_pa,Apellido_Ma from clientes where Id_Huella ="+Num+";");
           
            if(rs.last());
            int filas=rs.getRow();
            
            rs.first();
            TXT_nombrecli.setText(rs.getString("Nombre"));
            TXT_apellidopacli.setText(rs.getString("Apellido_Pa"));
            TXT_apellidomacli.setText(rs.getString("Apellido_Ma"));
            
        }catch(Exception e){
            System.out.print(e);
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Num_clienActionPerformed

    private void TXT_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_cantidadActionPerformed
try{
            //last() envia al final de la tabla
            //previous() se va al anterior
            //first se va al princicipo
           
           
            Cant = Double.parseDouble(TXT_cantidad.getText());
            Descrip = CBX_Produc.getSelectedItem().toString();
            Connection cn = Conexion.conecta("brenda", "sasa", "Gym_Zarate");
            Statement st= cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//scroll hace que te muevas a la posicion que desees
            ResultSet rs=st.executeQuery("select costo_Cliente from productos where Descripcion = '"+Descrip+"';");
            if(rs.last());
            int filas=rs.getRow();
            rs.first();
            Precio = rs.getDouble("costo_Cliente");
            TXT_Subtotal.setText(Precio*Cant+"");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_cantidadActionPerformed

    private void CBX_TipventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBX_TipventaActionPerformed
String Tipo_Venta = "";

Tipo_Venta = CBX_Tipventa.getSelectedItem().toString();

if(Tipo_Venta.equals( "UN PAGO"))
{
      ar2=llenarArreglo();
    Lista=new JTable (ar2,ar1);
    jScrollPane1.setViewportView(Lista);
}
else if(Tipo_Venta.equals("VARIOS PAGOS"))
{
       Lbl_Num_PAgos.setVisible(true);
       CBX_Num_Pagos.setVisible(true);
       Lb_Periodo.setVisible(true);
       CBX_Tiperiodo.setVisible(true);
       Lb_Importe.setVisible(true);
       TXT_Importe.setVisible(true);
       Lb_Restante.setVisible(true);
       TXT_Resante.setVisible(true);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_CBX_TipventaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBX_Num_Pagos;
    private javax.swing.JComboBox<String> CBX_Produc;
    private javax.swing.JComboBox<String> CBX_Tiperiodo;
    private javax.swing.JComboBox<String> CBX_Tipventa;
    private javax.swing.JLabel Lb_Importe;
    private javax.swing.JLabel Lb_Periodo;
    private javax.swing.JLabel Lb_Restante;
    private javax.swing.JLabel Lbl_Num_PAgos;
    private javax.swing.JTable Lista;
    private javax.swing.JTextField TXT_Importe;
    private javax.swing.JTextField TXT_Num_clien;
    private javax.swing.JTextField TXT_Resante;
    private javax.swing.JTextField TXT_Subtotal;
    private javax.swing.JTextField TXT_apellidomacli;
    private javax.swing.JTextField TXT_apellidopacli;
    private javax.swing.JTextField TXT_cantidad;
    private javax.swing.JTextField TXT_nombrecli;
    private javax.swing.JTextField TXT_telefono1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
