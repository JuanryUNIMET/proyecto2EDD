/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import proyecto2DEFINITIVO.BinaryHeap;
import proyecto2DEFINITIVO.HashTable;
import proyecto2DEFINITIVO.User;

/**
 *
 * @author angui, juanry
 */
public class Documentos extends javax.swing.JFrame {
    public static HashTable td;
    public static int sec;
    public static BinaryHeap bh;
    public static Reloj crono; 

    /**
     * Creates new form CrearUsuario
     */
    public Documentos(HashTable t, int segundos, BinaryHeap bh) {
        initComponents();
        this.setVisible(true);

        this.td = t;
        this.sec = segundos;
        this.bh = bh;
        actualizar_usuarios();


    }
  public void actualizar_usuarios(){
        this.reg.setText(td.printUsers(""));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        type = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        size = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reg = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        title2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        type.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 410, 40));

        username.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 410, 40));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        size.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 402, 410, 40));

        title.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 410, 40));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel7.setText("Documentos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel8.setText("Introduzca el tipo del documento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel9.setText("Introduzca su nombre de usuario:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel10.setText("Introduzca el título del documento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel11.setText("Introduzca el tamaño del documento:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        reg.setColumns(20);
        reg.setRows(5);
        jScrollPane2.setViewportView(reg);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 310, 550));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("Usuarios Registrados");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 340, 40));
        jPanel1.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 350, 40));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 500, -1, -1));

        jLabel13.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel13.setText("Introduzca su nombre de usuario:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel14.setText("Introduzca el título del documento:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 240, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 11)); // NOI18N
        jLabel2.setText("Presione para regresar al menu principal");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/backgroundWorks.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, -480, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       System.out.println(this.sec);

       boolean error = false;
        try{
           int stam = Integer.parseInt(this.size.getText());
       }catch(Exception e){
           error = true;
           JOptionPane.showMessageDialog(rootPane, "El tamaño debe ser un numero entero");
       }
       if(!error){
            String usern = this.username.getText().toLowerCase();
            String title = this.title.getText().toLowerCase();
            User q = td.searchUser(usern);

            if (!q.username.equals("")){
                int time = sec;
                if(q.priority == "prioridad_alta"){
                    time-= sec*0.66;
                }
                else if (q.priority == "prioridad_media"){
                    time -= sec*0.33;
                }
                q.addDocument(this.title.getText().toLowerCase(), Integer.parseInt(this.size.getText()), this.type.getText(), time);
                JOptionPane.showMessageDialog(rootPane, "Documento Registrado Exitosamente", "Crear Documento", HEIGHT);
                actualizar_usuarios();       
            }else{
                JOptionPane.showMessageDialog(rootPane, "Documento no registrado", "Crear Documento", HEIGHT);
                
            }}
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MenuPrincipal m = new MenuPrincipal(bh, td, crono);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String usern = this.user.getText().toLowerCase();
        String title = this.title2.getText().toLowerCase();
        boolean q = td.deleteDocument(usern, title);
        if (q){
            JOptionPane.showMessageDialog(rootPane, "Documento Eliminado Exitosamente", "Crear Usuario", HEIGHT);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Documento no encontrado", "Crear Usuario", HEIGHT);
        }

        actualizar_usuarios();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documentos(td, sec, bh).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea reg;
    private javax.swing.JTextField size;
    private javax.swing.JTextField title;
    private javax.swing.JTextField title2;
    private javax.swing.JTextField type;
    private javax.swing.JTextField user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
