/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.clientes.vista;

import co.unicauca.clientes.modelo.ClientesDB;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author JuanCamilo
 */
public class GUIEstadisticaPorSexo extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form GUIEstadisticaPorSexo
     */
    public GUIEstadisticaPorSexo(int h, int v) {
        initComponents();
        setSize(400, 200);
        setLocation(h, v);
        setVisible(true);

    }

    private GUIEstadisticaPorSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHombres = new javax.swing.JLabel();
        lblMujeres = new javax.swing.JLabel();
        txtHombres = new javax.swing.JTextField();
        txtMujeres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHombres.setText("Hombres");

        lblMujeres.setText("Mujeres");

        txtHombres.setForeground(new java.awt.Color(255, 255, 255));
        txtHombres.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHombres.setEnabled(false);

        txtMujeres.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMujeres.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHombres)
                    .addComponent(lblMujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMujeres)
                    .addComponent(txtHombres, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHombres)
                    .addComponent(txtHombres, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMujeres)
                    .addComponent(txtMujeres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticaPorSexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEstadisticaPorSexo().setVisible(true);
            }
        });
    }

    @Override
    public void update(Observable obs, Object arg) {
        ClientesDB cliDB = (ClientesDB) obs;
        txtHombres.setText("" + cliDB.getTotalHombres());
        txtMujeres.setText("" + cliDB.getTotalMujeres());
        this.setTitle("Estadísticas por sexo. Profesión: " + cliDB.getProfesion());

    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHombres;
    private javax.swing.JLabel lblMujeres;
    private javax.swing.JTextField txtHombres;
    private javax.swing.JTextField txtMujeres;
    // End of variables declaration//GEN-END:variables
}