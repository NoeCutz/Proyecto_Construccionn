/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import controlador.AdministradorProveedores;

/**
 *
 * @author rodrigopeniche
 */
class PanelEliminarProveedor extends javax.swing.JPanel {

    /**
     * Creates new form PanelEliminarProveedor
     */
    PanelVerProveedores panelVerProveedores;
    
    PanelEliminarProveedor(PanelVerProveedores panelVerProveedores) {
        initComponents();
        this.panelVerProveedores= panelVerProveedores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaEliminar = new javax.swing.JLabel();
        etiquetaClave = new javax.swing.JLabel();
        campoTextoClave = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        etiquetaEliminar.setText("Eliminar proveedor");

        etiquetaClave.setText("Clave:");

        botonEliminar.setText("Eliminar proveedor");
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaEliminar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaClave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonEliminar)
                                .addGap(76, 76, 76)
                                .addComponent(botonCancelar))
                            .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        // TODO add your handling code here:
        String claveProveedor= campoTextoClave.getText();
        AdministradorProveedores admin= new AdministradorProveedores();
        admin.eliminar(claveProveedor);
        
        panelVerProveedores.actualizarTablaProveedores();
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_botonCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaEliminar;
    // End of variables declaration//GEN-END:variables
}
