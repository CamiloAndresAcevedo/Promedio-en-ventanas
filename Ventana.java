//Programa que muestra los promedios desde un archivo csv en una ventana usando un boton.
//Creado por Camilo Acevedo
//Inspirado en alejandro programacion.

package main;

import java.util.ArrayList; // import the ArrayList class
import javax.swing.JFileChooser; //clase para mostrar una ventana para la selección de un fichero.
import javax.swing.filechooser.FileNameExtensionFilter; //Implementación de filtros usando un conjunto específico de extensiones.
import javax.swing.table.DefaultTableModel; //Implementación de TableModelque que usa un vector para almacenar los objetos de valor de celda.

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents(); //Se cargan los objetos del jFrame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        File = new javax.swing.JFileChooser(); //Mecanismo para que el usuario elija un archivo.
        jButton1 = new javax.swing.JButton(); //Implementación de un botón "pulsador".
        jScrollPane2 = new javax.swing.JScrollPane(); //Proporciona una vista desplazable de un componente.
        Tabla = new javax.swing.JTable(); //Componente visual de java que nos permite dibujar una tabla.
        jLabel1 = new javax.swing.JLabel(); //Mostramos los diferentes tipos de variables como texto.
        lblPromedioTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PromN1 = new javax.swing.JLabel(); 
        jLabel3 = new javax.swing.JLabel(); 
        jLabel4 = new javax.swing.JLabel(); 
        jLabel5 = new javax.swing.JLabel(); 
        PromN2 = new javax.swing.JLabel();
        PromN3 = new javax.swing.JLabel();
        PromN4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir"); //Texto que tendra el boton.
        jButton1.addActionListener(new java.awt.event.ActionListener() { //Proceso para la ejecucion del boton.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Estudiante", "Promedio" //Titulos para las columnas.
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla); //Mostramos en la tabla los promedios por nota y un promedio general.

        jLabel1.setText("Promedio Total:");

        jLabel2.setText("Promedio Nota 1:");

        jLabel3.setText("Promedio Nota 2:");

        jLabel4.setText("Promedio Nota 3:");

        jLabel5.setText("Promedio Nota 4:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); //Configuramos la ventana, sus caracteristicas y su interior.
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() //Agregamos el contenido de la ventana.
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPromedioTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PromN1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PromN3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PromN4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PromN2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblPromedioTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PromN1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PromN2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PromN3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PromN4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Promedio CSV", "csv"); //Definimos la extension en formato CSV.
        File.setFileFilter(filtro); // se filtran los datos para poderlos mostrar mas adelante.
        int result = File.showOpenDialog(this); //se declara una variable tipo entera.
        if (result == JFileChooser.APPROVE_OPTION) { //metodo que proporciona instrucciones al programa.
            LectorCSV lector = new LectorCSV(); //lee fichero csv.
            lector.extraerDatos(File.getSelectedFile().getAbsolutePath()); //metodo que extrae los datos del archivo csv
            String[][] promedios = lector.calcularPromedio(); //Cadena de caracteres para el promedio.
            String[] columnas = new String[]{"Estudiante","Promedio"}; //Definimos el titulo de las columnas en la ventana.
            DefaultTableModel model = new DefaultTableModel(promedios, columnas); //Definimos los datos para cada fila/columna
            Tabla.setModel(model);
            float promedioTotal = 0; //Representamos un dato.
            for(String[] x :promedios){
                promedioTotal+=Float.parseFloat(x[1]);
            }
            promedioTotal /=promedios.length; //Leemos los promedios tanto por columna como el promedio total.
            lblPromedioTotal.setText(promedioTotal+"");
            PromN1.setText(lector.getPromedioNota(1)+""); 
            PromN2.setText(lector.getPromedioNota(2)+"");
            PromN3.setText(lector.getPromedioNota(3)+"");
            PromN4.setText(lector.getPromedioNota(4)+"");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true); //Control de la ventana.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser File;
    private javax.swing.JLabel PromN1;
    private javax.swing.JLabel PromN2;
    private javax.swing.JLabel PromN3;
    private javax.swing.JLabel PromN4;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPromedioTotal;
    // End of variables declaration//GEN-END:variables
}