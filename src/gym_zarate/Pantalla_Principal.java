/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym_zarate;

/**
 *
 * @author soner
 */
public class Pantalla_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla_Principal
     */
    public Pantalla_Principal() {
        initComponents();
    }
    public static int admin = 0;
     public static int valida = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        Lb_Nombre = new javax.swing.JLabel();
        Btn_Entradas = new javax.swing.JButton();
        Btn_Ventas = new javax.swing.JButton();
        Btn_Suscripcion = new javax.swing.JButton();
        Btn_Mensualidad = new javax.swing.JButton();
        Btn_Registro = new javax.swing.JButton();
        Barra_Menus = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_cerrarse = new javax.swing.JMenuItem();
        jMenu_Salirsis = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_Nuevoempleado = new javax.swing.JMenuItem();
        jMenu_Nuevomiembro = new javax.swing.JMenu();
        jMenu_nuevomiembro = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/nombre.png"))); // NOI18N

        Lb_Nombre.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        Btn_Entradas.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Entradas.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Btn_Entradas.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Entradas.setText("Pagos");
        Btn_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EntradasActionPerformed(evt);
            }
        });

        Btn_Ventas.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Ventas.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Btn_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Ventas.setText("Ventas");

        Btn_Suscripcion.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Suscripcion.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Btn_Suscripcion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Suscripcion.setText("Suscripcion");
        Btn_Suscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SuscripcionActionPerformed(evt);
            }
        });

        Btn_Mensualidad.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Mensualidad.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Btn_Mensualidad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Mensualidad.setText("Mensualidad");
        Btn_Mensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MensualidadActionPerformed(evt);
            }
        });

        Btn_Registro.setBackground(new java.awt.Color(102, 102, 255));
        Btn_Registro.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Btn_Registro.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registro.setText("Registro");
        Btn_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistroActionPerformed(evt);
            }
        });

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu1.setForeground(new java.awt.Color(0, 0, 102));
        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu_cerrarse.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu_cerrarse.setForeground(new java.awt.Color(0, 0, 204));
        jMenu_cerrarse.setText("Cerrar Sesión");
        jMenu_cerrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cerrarseActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_cerrarse);

        jMenu_Salirsis.setBackground(new java.awt.Color(255, 255, 255));
        jMenu_Salirsis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu_Salirsis.setForeground(new java.awt.Color(0, 0, 204));
        jMenu_Salirsis.setText("Salir");
        jMenu_Salirsis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_SalirsisActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_Salirsis);

        Barra_Menus.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu2.setForeground(new java.awt.Color(0, 0, 102));
        jMenu2.setText("Empleados");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu_Nuevoempleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu_Nuevoempleado.setForeground(new java.awt.Color(0, 0, 204));
        jMenu_Nuevoempleado.setText("Nuevo Empleado");
        jMenu_Nuevoempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_NuevoempleadoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_Nuevoempleado);

        Barra_Menus.add(jMenu2);

        jMenu_Nuevomiembro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu_Nuevomiembro.setForeground(new java.awt.Color(0, 0, 102));
        jMenu_Nuevomiembro.setText("Miembros");
        jMenu_Nuevomiembro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenu_nuevomiembro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenu_nuevomiembro.setForeground(new java.awt.Color(0, 0, 204));
        jMenu_nuevomiembro.setText("Nuevo Miembro");
        jMenu_nuevomiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevomiembroActionPerformed(evt);
            }
        });
        jMenu_Nuevomiembro.add(jMenu_nuevomiembro);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem1.setText("Suscripcion Grupal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Nuevomiembro.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem2.setText("Registro Cliente por Promocion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_Nuevomiembro.add(jMenuItem2);

        Barra_Menus.add(jMenu_Nuevomiembro);

        jMenu3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu3.setForeground(new java.awt.Color(0, 0, 102));
        jMenu3.setText("Productos");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem3.setText("Nuevo Producto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem5.setText("Marcas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        Barra_Menus.add(jMenu3);

        jMenu5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu5.setForeground(new java.awt.Color(0, 0, 102));
        jMenu5.setText("Ventas");
        jMenu5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem9.setText("Nueva Venta");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem10.setText("Renovar Membresia");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem11.setText("Pago de Producto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        Barra_Menus.add(jMenu5);

        jMenu4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jMenu4.setForeground(new java.awt.Color(0, 0, 102));
        jMenu4.setText("Registro de asitencias.");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem4.setText("Empleados");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem6.setText("Clientes.");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        Barra_Menus.add(jMenu4);

        setJMenuBar(Barra_Menus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lb_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Ventas)
                .addGap(18, 18, 18)
                .addComponent(Btn_Entradas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Suscripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Mensualidad)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Entradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Suscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_Mensualidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_cerrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_cerrarseActionPerformed
        Login l=new Login();
        this.hide();
        l.show();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_cerrarseActionPerformed

    private void jMenu_SalirsisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_SalirsisActionPerformed
        dispose();       
    }//GEN-LAST:event_jMenu_SalirsisActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     Marcas mt=new Marcas();
       jDesktopPane1.removeAll();
       mt.setVisible(true);
       jDesktopPane1.add(mt);
       repaint(); 
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void Btn_SuscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SuscripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SuscripcionActionPerformed

    private void Btn_MensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MensualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_MensualidadActionPerformed

    private void Btn_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_RegistroActionPerformed

    private void Btn_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EntradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EntradasActionPerformed

    private void jMenu_nuevomiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevomiembroActionPerformed
         
        Regitro_cli mt = new Regitro_cli();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
        
        
    }//GEN-LAST:event_jMenu_nuevomiembroActionPerformed

    private void jMenu_NuevoempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_NuevoempleadoActionPerformed
        Registro_Empleado mt = new Registro_Empleado();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenu_NuevoempleadoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Suscripsion_grupal mt = new Suscripsion_grupal();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         Registro_Clientes_Promo mt = new Registro_Clientes_Promo();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
         Nuevo_Producto mt = new Nuevo_Producto();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
           Nueva_Venta mt = new Nueva_Venta();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint(); 
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Renovar_membresia mt = new Renovar_membresia();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Pago_productos mt = new Pago_productos();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Asistencia_Empleado mt = new Asistencia_Empleado();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       Asistencia_cliente mt = new Asistencia_cliente();
        jDesktopPane1.removeAll();
        mt.setVisible(true);
        jDesktopPane1.add(mt);
        repaint();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Menus;
    private javax.swing.JButton Btn_Entradas;
    private javax.swing.JButton Btn_Mensualidad;
    private javax.swing.JButton Btn_Registro;
    private javax.swing.JButton Btn_Suscripcion;
    private javax.swing.JButton Btn_Ventas;
    private javax.swing.JLabel Lb_Nombre;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenu_Nuevoempleado;
    private javax.swing.JMenu jMenu_Nuevomiembro;
    private javax.swing.JMenuItem jMenu_Salirsis;
    private javax.swing.JMenuItem jMenu_cerrarse;
    private javax.swing.JMenuItem jMenu_nuevomiembro;
    // End of variables declaration//GEN-END:variables
}
