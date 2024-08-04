/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zoologico.view.servicios;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import zoologico.controller.Jaulas;
import zoologico.controller.Zoologico;
import zoologico.model.Db;
import zoologico.view.ZooView;

/**
 *
 * @author juan_
 */
public class FrameSubirCargarDb extends javax.swing.JFrame {
    Db db = new Db();

    /**
     * Creates new form FrameSubirCargarDb
     */
    public FrameSubirCargarDb() {
        initComponents();
        DefaultListModel<String> modelJaulas=new DefaultListModel<>();
        listaJaulas.setModel(modelJaulas); 
        for(Jaulas jaula: Zoologico.getJaulas()){
            modelJaulas.addElement(jaula.getNombreJaula());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaJaulas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        textoConocedor = new javax.swing.JLabel();
        varCodeJaula = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoNotificacion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        listaJaulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaJaulasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaJaulas);

        jLabel1.setText("Jaulas Creadas: ");

        textoConocedor.setText("Si conoce el codigo de una Jaula para importar, Digitelo:");

        varCodeJaula.setText("Codigo de Jaula para Importar de DataBase");

        botonEnviar.setText("Enviar");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        textoNotificacion.setColumns(20);
        textoNotificacion.setRows(5);
        jScrollPane2.setViewportView(textoNotificacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoConocedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEnviar)
                    .addComponent(varCodeJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoConocedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(varCodeJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEnviar)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        ZooView zooView = new ZooView();
        zooView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void listaJaulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaJaulasMouseClicked
        int indice = listaJaulas.getSelectedIndex();
        try{
            db.guardarJaula(Zoologico.getJaulas().get(indice));
        }catch(SQLException ex){
            System.out.println("Error en la subida a la base de datos: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_listaJaulasMouseClicked

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        try {
            Zoologico.setJaulas(db.obtenerJaula(Integer.parseInt(varCodeJaula.getText())));
            textoNotificacion.setText("Felicidades, importó la Jaula con los datos: " + db.obtenerJaula(Integer.parseInt(varCodeJaula.getText())));
        } catch (SQLException ex) {
            Logger.getLogger(FrameSubirCargarDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaJaulas;
    private javax.swing.JLabel textoConocedor;
    private javax.swing.JTextArea textoNotificacion;
    private javax.swing.JTextField varCodeJaula;
    // End of variables declaration//GEN-END:variables
}
