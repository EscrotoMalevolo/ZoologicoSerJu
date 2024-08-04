package zoologico.view.servicios;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import zoologico.controller.Jaulas;
import zoologico.controller.Zoologico;
import zoologico.controller.clasesAnimales.Animales;
import zoologico.view.ZooView;

/**
 *
 * @author juan_
 */
public class FrameVerJaulas extends javax.swing.JFrame {

    public FrameVerJaulas() {
        initComponents();
        DefaultListModel<String> modelJaulas=new DefaultListModel<>();
        listaNombreJaulas.setModel(modelJaulas); 
        for(Jaulas jaula: Zoologico.getJaulas()){
            modelJaulas.addElement(jaula.getNombreJaula());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1VerJaula = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        listaNombreJaulas = new javax.swing.JList<>();
        botonVolver = new javax.swing.JButton();
        ScrollPaneMostrarJaula = new javax.swing.JScrollPane();
        tablaMostrarJaula = new javax.swing.JTable();
        texto2AnimalesJaula = new javax.swing.JLabel();
        ScrollPaneAnimals = new javax.swing.JScrollPane();
        tablaMostrarAnimales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        texto1VerJaula.setText("Elija una Jaula para verla: ");

        listaNombreJaulas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNombreJaulasMouseClicked(evt);
            }
        });
        scrollPanel.setViewportView(listaNombreJaulas);

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        tablaMostrarJaula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Habitat", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPaneMostrarJaula.setViewportView(tablaMostrarJaula);

        texto2AnimalesJaula.setText("Animales de la Jaula:");

        tablaMostrarAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Especie", "Nombre", "Clasificación", "Habitat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPaneAnimals.setViewportView(tablaMostrarAnimales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texto1VerJaula)
                        .addContainerGap(513, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVolver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPaneAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(ScrollPaneMostrarJaula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(texto2AnimalesJaula)
                                    .addGap(192, 192, 192)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto1VerJaula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(ScrollPaneMostrarJaula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(texto2AnimalesJaula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPaneAnimals, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        ZooView zooView = new ZooView();
        zooView.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_botonVolverActionPerformed

    private void listaNombreJaulasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaNombreJaulasMouseClicked
        // Obtener el índice de la jaula seleccionada
        int indice = listaNombreJaulas.getSelectedIndex();

        // Limpiar la tabla de jaulas
        DefaultTableModel tablitaJaulas = (DefaultTableModel) tablaMostrarJaula.getModel();
        tablitaJaulas.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

        // Agregar los datos de la jaula seleccionada a la tabla
        tablitaJaulas.addRow(new Object[]{
            Zoologico.getJaulas().get(indice).getNombreJaula(), 
            Zoologico.getJaulas().get(indice).getAmbienteJaula(), 
            Zoologico.getJaulas().get(indice).getNumJaula()
        });

        // Limpiar la tabla de animales
        DefaultTableModel tablitaAnimals = (DefaultTableModel) tablaMostrarAnimales.getModel();
        tablitaAnimals.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

        // Agregar los datos de los animales de la jaula seleccionada a la tabla
        for (Animales animal : Zoologico.getJaulas().get(indice).getTamJaula()) {
            tablitaAnimals.addRow(new Object[]{
                animal.getEspecie(), 
                animal.getName(), 
                animal.getClasificacion(), 
                animal.getHabitat()
            });
        }
    }//GEN-LAST:event_listaNombreJaulasMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneAnimals;
    private javax.swing.JScrollPane ScrollPaneMostrarJaula;
    private javax.swing.JButton botonVolver;
    private javax.swing.JList<String> listaNombreJaulas;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tablaMostrarAnimales;
    private javax.swing.JTable tablaMostrarJaula;
    private javax.swing.JLabel texto1VerJaula;
    private javax.swing.JLabel texto2AnimalesJaula;
    // End of variables declaration//GEN-END:variables
}
