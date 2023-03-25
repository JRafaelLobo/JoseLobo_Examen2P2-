package joselobo_examen2p2;

import ClasesAdmin.AdminBinario;
import Hilos.ProgressBar;
import ObjectosDeExamen2P2Lab.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("./Imagenes\\Logo.jpg").getImage());
        jF_CrearPartido.setIconImage(new ImageIcon("./Imagenes\\Logo.jpg").getImage());
        jF_ManejoEquipo.setIconImage(new ImageIcon("./Imagenes\\Logo.jpg").getImage());
        modelo = (DefaultTreeModel) JTree_Torneos.getModel();
        raiz = (DefaultMutableTreeNode) modelo.getRoot();
        //set del arbol        
        Periodo Q1 = new Periodo("Q1");
        DefaultMutableTreeNode Nodo1 = new DefaultMutableTreeNode(Q1);
        Periodo Q2 = new Periodo("Q2");
        DefaultMutableTreeNode Nodo2 = new DefaultMutableTreeNode(Q2);
        Periodo Q4 = new Periodo("Q4");
        DefaultMutableTreeNode Nodo3 = new DefaultMutableTreeNode(Q4);
        Periodo Q5 = new Periodo("Q5");
        DefaultMutableTreeNode Nodo4 = new DefaultMutableTreeNode(Q5);
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
        jM_CargarDeporte = new javax.swing.JMenuItem();
        PP_Deporte = new javax.swing.JPopupMenu();
        jM_GuardarDeporte = new javax.swing.JMenuItem();
        jM_QuitarDeporte = new javax.swing.JMenuItem();
        jM_CrearTorneo = new javax.swing.JMenuItem();
        jF_CrearPartido = new javax.swing.JFrame();
        lb_Partido = new javax.swing.JLabel();
        jcb_Equipo1 = new javax.swing.JComboBox<>();
        jS_PuntosEquipo1 = new javax.swing.JSpinner();
        jS_PuntosEquipo2 = new javax.swing.JSpinner();
        jcb_Equipo2 = new javax.swing.JComboBox<>();
        B_CrearPartido = new javax.swing.JButton();
        B_Retornar = new javax.swing.JButton();
        PP_PackPartidos = new javax.swing.JPopupMenu();
        jM_CrearPartido = new javax.swing.JMenuItem();
        PP_PackEquipos = new javax.swing.JPopupMenu();
        jM_CrearEquipos = new javax.swing.JMenuItem();
        jF_ManejoEquipo = new javax.swing.JFrame();
        lb_ManejoEquipo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_Equipos = new javax.swing.JList<>();
        lb_Nombre = new javax.swing.JLabel();
        tb_nombreModificar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jS_PuntosModificar = new javax.swing.JSpinner();
        B_Modificar = new javax.swing.JButton();
        B_VolverManejoEquipo = new javax.swing.JButton();
        lb_Admin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree_Torneos = new javax.swing.JTree();
        jPB_Subir = new javax.swing.JProgressBar();
        B_ManejoDeEquipos = new javax.swing.JButton();

        jM_CrearDeporte.setText("Crear Deporte");
        jM_CrearDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CrearDeporteActionPerformed(evt);
            }
        });
        PP_CrearDeporte.add(jM_CrearDeporte);

        jM_CargarDeporte.setText("CargarDeporte");
        jM_CargarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CargarDeporteActionPerformed(evt);
            }
        });
        PP_CrearDeporte.add(jM_CargarDeporte);

        jM_GuardarDeporte.setText("Guardar Deporte");
        jM_GuardarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_GuardarDeporteActionPerformed(evt);
            }
        });
        PP_Deporte.add(jM_GuardarDeporte);

        jM_QuitarDeporte.setText("Quitar Deporte");
        jM_QuitarDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_QuitarDeporteActionPerformed(evt);
            }
        });
        PP_Deporte.add(jM_QuitarDeporte);

        jM_CrearTorneo.setText("Crear Torneo");
        jM_CrearTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CrearTorneoActionPerformed(evt);
            }
        });
        PP_Deporte.add(jM_CrearTorneo);

        jF_CrearPartido.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jF_CrearPartido.setTitle("Creacion de Partido");

        lb_Partido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_Partido.setText("Partido");

        jS_PuntosEquipo1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jS_PuntosEquipo2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        B_CrearPartido.setText("Crear Partido");
        B_CrearPartido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_CrearPartidoMouseClicked(evt);
            }
        });

        B_Retornar.setText("Retornar");
        B_Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jF_CrearPartidoLayout = new javax.swing.GroupLayout(jF_CrearPartido.getContentPane());
        jF_CrearPartido.getContentPane().setLayout(jF_CrearPartidoLayout);
        jF_CrearPartidoLayout.setHorizontalGroup(
            jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_CrearPartidoLayout.createSequentialGroup()
                .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jF_CrearPartidoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcb_Equipo1, 0, 137, Short.MAX_VALUE)
                            .addComponent(jS_PuntosEquipo1))
                        .addGap(48, 48, 48)
                        .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcb_Equipo2, 0, 134, Short.MAX_VALUE)
                            .addComponent(jS_PuntosEquipo2)))
                    .addGroup(jF_CrearPartidoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_CrearPartido)
                            .addComponent(B_Retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jF_CrearPartidoLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lb_Partido)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jF_CrearPartidoLayout.setVerticalGroup(
            jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_CrearPartidoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lb_Partido)
                .addGap(18, 18, 18)
                .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jF_CrearPartidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jS_PuntosEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jS_PuntosEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(B_CrearPartido)
                .addGap(18, 18, 18)
                .addComponent(B_Retornar)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jM_CrearPartido.setText("Crear Partido");
        jM_CrearPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CrearPartidoActionPerformed(evt);
            }
        });
        PP_PackPartidos.add(jM_CrearPartido);

        jM_CrearEquipos.setText("Crear Equipo");
        jM_CrearEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_CrearEquiposActionPerformed(evt);
            }
        });
        PP_PackEquipos.add(jM_CrearEquipos);

        lb_ManejoEquipo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_ManejoEquipo.setText("Manejo De Equipo");

        jList_Equipos.setModel(new DefaultListModel()
        );
        jScrollPane2.setViewportView(jList_Equipos);

        lb_Nombre.setText("Nombre");

        jLabel1.setText("Puntos");

        jS_PuntosModificar.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        B_Modificar.setText("Modificar");
        B_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ModificarMouseClicked(evt);
            }
        });

        B_VolverManejoEquipo.setText("Volver");
        B_VolverManejoEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_VolverManejoEquipoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jF_ManejoEquipoLayout = new javax.swing.GroupLayout(jF_ManejoEquipo.getContentPane());
        jF_ManejoEquipo.getContentPane().setLayout(jF_ManejoEquipoLayout);
        jF_ManejoEquipoLayout.setHorizontalGroup(
            jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                .addGroup(jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lb_ManejoEquipo))
                    .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_Nombre)
                                    .addComponent(tb_nombreModificar)
                                    .addComponent(jLabel1)
                                    .addComponent(jS_PuntosModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)))
                            .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(B_Modificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(B_VolverManejoEquipo)
                                .addGap(22, 22, 22)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jF_ManejoEquipoLayout.setVerticalGroup(
            jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lb_ManejoEquipo)
                .addGroup(jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jF_ManejoEquipoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lb_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tb_nombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jS_PuntosModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jF_ManejoEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_Modificar)
                            .addComponent(B_VolverManejoEquipo))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion de Torneos");

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

        jPB_Subir.setString("Subiendo Archivos");
        jPB_Subir.setStringPainted(true);

        B_ManejoDeEquipos.setText("Manejo de Equipo");
        B_ManejoDeEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_ManejoDeEquiposMouseClicked(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPB_Subir, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_ManejoDeEquipos)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lb_Admin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(B_ManejoDeEquipos)))
                .addGap(18, 18, 18)
                .addComponent(jPB_Subir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
                System.out.println("Nada Aqui no hay nada");
            } else if (nodo_seleccionado.getUserObject() instanceof Deporte) {
                PP_Deporte.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof PartidosPack) {
                PP_PackPartidos.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof EquiposPack) {
                PP_PackEquipos.show(evt.getComponent(), evt.getX(), evt.getY());
            } else if (nodo_seleccionado.getUserObject() instanceof Torneo) {
                System.out.println("Aqui Tambien no hay nada");
            } else {
                PP_CrearDeporte.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_JTree_TorneosMouseClicked

    private void jM_GuardarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_GuardarDeporteActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jf.showOpenDialog(this);
        File archivoElegido = jf.getSelectedFile();
        path = archivoElegido.getPath();
        CantidadDeTorneos = 0;
        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode Nodo1 = (DefaultMutableTreeNode) raiz.getChildAt(i);
            for (int j = 0; j < Nodo1.getChildCount(); j++) {
                DefaultMutableTreeNode Nodo2 = (DefaultMutableTreeNode) Nodo1.getChildAt(j);
                if (Nodo2.toString().equals(nodo_seleccionado.toString())) {
                    CuantosTorneos(Nodo2);
                }
            }
        }
        ProgressBar PB = new ProgressBar(jPB_Subir, CantidadDeTorneos);
        PB.setMain(this);
        PB.start();
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

    private void jM_CargarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CargarDeporteActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Deportes", "dp");
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(filter);
        int respuesta = fc.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            File archivoElegido = fc.getSelectedFile();
            AdminBinario A = new AdminBinario(archivoElegido);
            A.cargarArchivo();
            ArrayList<Deporte> deportes = A.getDeportes();

            //anadir deporte a todas
            for (int i = 0; i < raiz.getChildCount(); i++) {
                DefaultMutableTreeNode Nodo = (DefaultMutableTreeNode) raiz.getChildAt(i);
                DefaultMutableTreeNode nodoDeporte = new DefaultMutableTreeNode(deportes.get(i));
                /*for (int j = 0; j < nodoDeporte; j++) {
                    
                }
                 */
                Nodo.add(nodoDeporte);
            }
            modelo.reload();
        }
    }//GEN-LAST:event_jM_CargarDeporteActionPerformed

    private void jM_QuitarDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_QuitarDeporteActionPerformed
        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode Nodo1 = (DefaultMutableTreeNode) raiz.getChildAt(i);
            for (int j = 0; j < Nodo1.getChildCount(); j++) {
                DefaultMutableTreeNode Nodo2 = (DefaultMutableTreeNode) Nodo1.getChildAt(j);
                if (Nodo2.toString().equals(nodo_seleccionado.toString())) {
                    Nodo2.removeFromParent();
                }
            }
        }
        modelo.reload();
    }//GEN-LAST:event_jM_QuitarDeporteActionPerformed

    private void jM_CrearTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CrearTorneoActionPerformed
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el Nombre del Deporte", "Crear Torneo", -1);
        DefaultMutableTreeNode Padre1 = (DefaultMutableTreeNode) nodo_seleccionado.getParent();
        Periodo P = (Periodo) Padre1.getUserObject();
        Torneo T = new Torneo(nombre, P);

        //Añadiendo al Tree
        DefaultMutableTreeNode Da = new DefaultMutableTreeNode(T);
        nodo_seleccionado.add(Da);
        PartidosPack b = new PartidosPack();
        DefaultMutableTreeNode Db = new DefaultMutableTreeNode(b);
        Da.add(Db);
        EquiposPack c = new EquiposPack();
        DefaultMutableTreeNode Dc = new DefaultMutableTreeNode(c);
        Da.add(Dc);
        modelo.reload();
    }//GEN-LAST:event_jM_CrearTorneoActionPerformed

    private void jM_CrearEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CrearEquiposActionPerformed
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el Nombre del Equipo", "Crear Equipo", -1);
        Equipo e = new Equipo(nombre);
        DefaultMutableTreeNode De = new DefaultMutableTreeNode(e);
        nodo_seleccionado.add(De);
        modelo.reload();
    }//GEN-LAST:event_jM_CrearEquiposActionPerformed

    private void jM_CrearPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_CrearPartidoActionPerformed
        if (MasdeUnoEquipo()) {
            llenarComboBox(jcb_Equipo1);
            llenarComboBox(jcb_Equipo2);
            jF_CrearPartido.pack();
            jF_CrearPartido.setLocationRelativeTo(this);
            jF_CrearPartido.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showConfirmDialog(this, "Ocupa al menos 2 Equipos", "Error", 1);
        }

    }//GEN-LAST:event_jM_CrearPartidoActionPerformed

    private void B_RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RetornarActionPerformed
        this.setLocationRelativeTo(jF_CrearPartido);
        jF_CrearPartido.setVisible(false);
        this.setVisible(true);

    }//GEN-LAST:event_B_RetornarActionPerformed

    private void B_CrearPartidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_CrearPartidoMouseClicked

        if (jcb_Equipo1.getSelectedIndex() == -1 || jcb_Equipo2.getSelectedIndex() == -1) {
            JOptionPane.showConfirmDialog(jF_CrearPartido, "No se puede Crear el partido, falta un dato", "Error", 1);
        } else {
            Partido P = new Partido();
            P.setNombreEquipo1(jcb_Equipo1.getSelectedItem().toString());
            P.setNombreEquipo2(jcb_Equipo2.getSelectedItem().toString());
            P.setPuntoEquipo1((int) jS_PuntosEquipo1.getValue());
            P.setPuntoEquipo2((int) jS_PuntosEquipo2.getValue());
            JOptionPane.showConfirmDialog(jF_CrearPartido, "Se ha Creado el partido con Exito", "Exito", 1);

            DefaultMutableTreeNode Da = new DefaultMutableTreeNode(P);
            nodo_seleccionado.add(Da);
            modelo.reload();
        }

    }//GEN-LAST:event_B_CrearPartidoMouseClicked

    private void B_ManejoDeEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ManejoDeEquiposMouseClicked
        equipos.clear();
        llenarEquipo(raiz);
        jF_ManejoEquipo.pack();
        jF_ManejoEquipo.setLocationRelativeTo(this);
        jF_ManejoEquipo.setVisible(true);
        this.setVisible(false);
        DefaultListModel listmodel = (DefaultListModel) jList_Equipos.getModel();
        listmodel.clear();
        listmodel.addAll(equipos);
    }//GEN-LAST:event_B_ManejoDeEquiposMouseClicked

    private void B_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ModificarMouseClicked
        String test = jList_Equipos.getSelectedValue();
        for (Equipo equipo : equipos) {
            if (test.equals(equipo)) {
                String nombre = tb_nombreModificar.getText();
                int number = (int) jS_PuntosModificar.getValue();
                equipo.setNombre(nombre);
                equipo.setPuntos(number);
                JOptionPane.showConfirmDialog(jF_ManejoEquipo, "Se ha modificado los datos", "Exito", -1);
            }
        }
    }//GEN-LAST:event_B_ModificarMouseClicked

    private void B_VolverManejoEquipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_VolverManejoEquipoMouseClicked
        this.setLocationRelativeTo(jF_ManejoEquipo);
        jF_ManejoEquipo.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_B_VolverManejoEquipoMouseClicked

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
    private javax.swing.JButton B_CrearPartido;
    private javax.swing.JButton B_ManejoDeEquipos;
    private javax.swing.JButton B_Modificar;
    private javax.swing.JButton B_Retornar;
    private javax.swing.JButton B_VolverManejoEquipo;
    private javax.swing.JTree JTree_Torneos;
    private javax.swing.JPopupMenu PP_CrearDeporte;
    private javax.swing.JPopupMenu PP_Deporte;
    private javax.swing.JPopupMenu PP_PackEquipos;
    private javax.swing.JPopupMenu PP_PackPartidos;
    private javax.swing.JFrame jF_CrearPartido;
    private javax.swing.JFrame jF_ManejoEquipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList_Equipos;
    private javax.swing.JMenuItem jM_CargarDeporte;
    private javax.swing.JMenuItem jM_CrearDeporte;
    private javax.swing.JMenuItem jM_CrearEquipos;
    private javax.swing.JMenuItem jM_CrearPartido;
    private javax.swing.JMenuItem jM_CrearTorneo;
    private javax.swing.JMenuItem jM_GuardarDeporte;
    private javax.swing.JMenuItem jM_QuitarDeporte;
    private javax.swing.JProgressBar jPB_Subir;
    private javax.swing.JSpinner jS_PuntosEquipo1;
    private javax.swing.JSpinner jS_PuntosEquipo2;
    private javax.swing.JSpinner jS_PuntosModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcb_Equipo1;
    private javax.swing.JComboBox<String> jcb_Equipo2;
    private javax.swing.JLabel lb_Admin;
    private javax.swing.JLabel lb_ManejoEquipo;
    private javax.swing.JLabel lb_Nombre;
    private javax.swing.JLabel lb_Partido;
    private javax.swing.JTextField tb_nombreModificar;
    // End of variables declaration//GEN-END:variables

    //Variables Publicas
    private final DefaultTreeModel modelo;
    private DefaultMutableTreeNode nodo_seleccionado;
    private final DefaultMutableTreeNode raiz;
    private ArrayList<Equipo> equipos = new ArrayList();
    public String path;
    private int CantidadDeTorneos;

    public void llenarComboBox(javax.swing.JComboBox<String> comboBox) {
        comboBox.removeAllItems();

        DefaultMutableTreeNode D = (DefaultMutableTreeNode) nodo_seleccionado.getParent();
        DefaultMutableTreeNode a = (DefaultMutableTreeNode) D.getChildAt(1);

        for (int i = 0; i < a.getChildCount(); i++) {
            DefaultMutableTreeNode b = (DefaultMutableTreeNode) a.getChildAt(i);
            Equipo c = (Equipo) b.getUserObject();
            comboBox.addItem(c.toString());
        }
    }

    public boolean MasdeUnoEquipo() {
        DefaultMutableTreeNode Da = (DefaultMutableTreeNode) nodo_seleccionado.getParent();
        DefaultMutableTreeNode Db = (DefaultMutableTreeNode) Da.getChildAt(1);
        if (Db.getChildCount() > 1) {
            return true;
        }
        return false;
    }

    public String eliminarPrimerasLetras(String texto, int cantidadLetrasAEliminar) {
        if (cantidadLetrasAEliminar >= texto.length()) {
            return "";
        } else {
            return texto.substring(cantidadLetrasAEliminar);
        }
    }

    private void llenarEquipo(DefaultMutableTreeNode nodo) {
        for (int i = 0; i < nodo.getChildCount(); i++) {
            DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) nodo.getChildAt(i);
            if (childNode.getUserObject() instanceof Equipo) {
                Equipo a = (Equipo) childNode.getUserObject();
                equipos.add(a);
            }
            llenarEquipo(childNode);
        }
        Collections.sort(equipos, Collections.reverseOrder());
    }

    private void CuantosTorneos(DefaultMutableTreeNode nodo) {
        for (int i = 0; i < nodo.getChildCount(); i++) {
            DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) nodo.getChildAt(i);
            if (childNode.getUserObject() instanceof Torneo) {
                CantidadDeTorneos++;
            }
        }
    }

    public void subir() {
        //Analiza cuales otros nodos tiene ese mismo deporte
        ArrayList<Deporte> temp = new ArrayList();
        for (int i = 0; i < raiz.getChildCount(); i++) {
            DefaultMutableTreeNode Nodo1 = (DefaultMutableTreeNode) raiz.getChildAt(i);
            for (int j = 0; j < Nodo1.getChildCount(); j++) {
                DefaultMutableTreeNode Nodo2 = (DefaultMutableTreeNode) Nodo1.getChildAt(j);
                if (Nodo2.toString().equals(nodo_seleccionado.toString())) {
                    //aqui van las ordenes
                    Deporte D = new Deporte(eliminarPrimerasLetras(nodo_seleccionado.toString(), 10));
                    for (int k = 0; k < Nodo2.getChildCount(); k++) {
                        DefaultMutableTreeNode Nodo3 = (DefaultMutableTreeNode) Nodo2.getChildAt(k);
                        Torneo T = (Torneo) Nodo3.getUserObject();

                        DefaultMutableTreeNode NodoPartidos = (DefaultMutableTreeNode) Nodo3.getChildAt(0);
                        DefaultMutableTreeNode NodoEquipos = (DefaultMutableTreeNode) Nodo3.getChildAt(1);
                        for (int l = 0; l < NodoPartidos.getChildCount(); l++) {
                            DefaultMutableTreeNode NodoPartidos2 = (DefaultMutableTreeNode) NodoPartidos.getChildAt(l);
                            T.addPartido((Partido) NodoPartidos2.getUserObject());
                        }
                        for (int l = 0; l < NodoEquipos.getChildCount(); l++) {
                            DefaultMutableTreeNode NodoEquipos2 = (DefaultMutableTreeNode) NodoEquipos.getChildAt(l);
                            T.addEquipo((Equipo) NodoEquipos2.getUserObject());
                        }
                        D.addTorneo(T);
                        temp.add(D);

                    }
                }
            }
        }
        AdminBinario Admin = new AdminBinario(path + "\\" + temp.get(0).getNombreDelDeporte() + ".dp");
        Admin.setDeportes(temp);
        Admin.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Se ha Guardado Correctamente el Archivo", "Guardado", -1);
    }
}
