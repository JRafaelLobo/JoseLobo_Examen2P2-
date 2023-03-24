package joselobo_examen2p2;

import ObjectosDeExamen2P2Lab.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();

        modelo = (DefaultTreeModel) JTree_Torneos.getModel();
        raiz = (DefaultMutableTreeNode) modelo.getRoot();
        //set del arbol        
        Periodo Q1 = new Periodo("Q1");
        DefaultMutableTreeNode Nodo1 = new DefaultMutableTreeNode(Q1);
        Periodo Q2 = new Periodo("Q2");
        DefaultMutableTreeNode Nodo2 = new DefaultMutableTreeNode(Q2);
        Periodo Q3 = new Periodo("Q3");
        DefaultMutableTreeNode Nodo3 = new DefaultMutableTreeNode(Q3);
        Periodo Q4 = new Periodo("Q4");
        DefaultMutableTreeNode Nodo4 = new DefaultMutableTreeNode(Q4);
        raiz.add(Nodo1);
        raiz.add(Nodo2);
        raiz.add(Nodo3);
        raiz.add(Nodo4);
        modelo.reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PP_CrearDeporte = new javax.swing.JPopupMenu();
        jM_CrearDeporte = new javax.swing.JMenuItem();
        PP_Deporte = new javax.swing.JPopupMenu();
        jM_GuardarDeporte = new javax.swing.JMenuItem();
        jM_QuitarDeporte = new javax.swing.JMenuItem();
        lb_Admin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree_Torneos = new javax.swing.JTree();

        jM_CrearDeporte.setText("Crear Deporte");
        jM_CrearDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CrearDeporteActionPerformed(evt);
            }
        });
        PP_CrearDeporte.add(jM_CrearDeporte);

        jM_GuardarDeporte.setText("Guardar Deporte");
        jM_GuardarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_GuardarDeporteActionPerformed(evt);
            }
        });
        PP_Deporte.add(jM_GuardarDeporte);

        jM_QuitarDeporte.setText("Quitar Deporte");
        PP_Deporte.add(jM_QuitarDeporte);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen 2 ");

        lb_Admin.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_Admin.setText("Administrador");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Torneos");
        JTree_Torneos.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree_Torneos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTree_TorneosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTree_Torneos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_Admin)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lb_Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTree_TorneosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTree_TorneosMouseClicked
        if (evt.isMetaDown()) {
            int row = JTree_Torneos.getClosestRowForLocation(evt.getX(), evt.getY());
            JTree_Torneos.setSelectionRow(row);
            Object v1 = JTree_Torneos.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof Periodo) {
                pp_carpeta.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                PP_Deporte.show(evt.getComponent(), evt.getX(), evt.getY());

            } else {
                PP_CrearDeporte.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_JTree_TorneosMouseClicked

    private void jM_GuardarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_GuardarDeporteActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.showOpenDialog(this);
        File archivoElegido = jf.getSelectedFile();
    }//GEN-LAST:event_jM_GuardarDeporteActionPerformed

    private void jM_CrearDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CrearDeporteActionPerformed

        String nombre = JOptionPane.showInputDialog(this, "Ingrese el Nombre del Deporte", "Crear Deporte", -1);

        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode Nodo = (DefaultMutableTreeNode) raiz.getChildAt(i);
            Deporte D = new Deporte(nombre);
            DefaultMutableTreeNode nodoDeporte = new DefaultMutableTreeNode(D);
            Nodo.add(nodoDeporte);
        }
        modelo.reload();

    }//GEN-LAST:event_jM_CrearDeporteActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree_Torneos;
    private javax.swing.JPopupMenu PP_CrearDeporte;
    private javax.swing.JPopupMenu PP_Deporte;
    private javax.swing.JMenuItem jM_CrearDeporte;
    private javax.swing.JMenuItem jM_GuardarDeporte;
    private javax.swing.JMenuItem jM_QuitarDeporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Admin;
    // End of variables declaration//GEN-END:variables

    //Variables Publicas
    DefaultTreeModel modelo;
    DefaultMutableTreeNode nodo_seleccionado;
    DefaultMutableTreeNode raiz;
}
