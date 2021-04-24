package practico_6.formularios;


import javax.swing.JOptionPane;
import practico_6.entidades.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class AgregarClientes extends javax.swing.JInternalFrame {
    private Directorio directorio;
    /**
     * Creates new form Agregar_clientes
     */
    public AgregarClientes(Directorio directorio) {
        this.directorio = directorio;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Agregar Clientes");
        setToolTipText("");
        setName(""); // NOI18N
        setNextFocusableComponent(dni);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        dni.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        dni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dni.setName(""); // NOI18N
        dni.setNextFocusableComponent(apellido);
        dni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dniFocusLost(evt);
            }
        });
        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("APELLIDO");

        apellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        apellido.setNextFocusableComponent(nombre);
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("CIUDAD");

        ciudad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ciudad.setNextFocusableComponent(direccion);
        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nombre.setNextFocusableComponent(ciudad);
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("TELEFONO");

        telefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        telefono.setNextFocusableComponent(guardar);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        guardar.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        guardar.setText("Guardar");
        guardar.setNextFocusableComponent(nuevo);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                guardarKeyPressed(evt);
            }
        });

        nuevo.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.setNextFocusableComponent(salir);
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        nuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nuevoKeyPressed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        salir.setText("Salir");
        salir.setNextFocusableComponent(dni);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                salirKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("DIRECCION");

        direccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        direccion.setNextFocusableComponent(telefono);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(direccion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ciudad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dni))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ciudad)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direccion)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telefono)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        apellido.setText("");
        ciudad.setText("");
        dni.setText("");
        nombre.setText("");
        direccion.setText("");
        telefono.setText("");
        dni.setFocusable(true);
        dni.requestFocusInWindow();
        dni.requestFocus(true);
        dni.requestFocus();
        
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        long tel = 0, nDni = 0;
        try {
            tel = Long.parseLong(telefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,  "Usted no ingresó un nro correcto de teléfono",
                "ERROR!", JOptionPane.ERROR_MESSAGE);
            telefono.selectAll();
            telefono.setFocusable(true);
            telefono.requestFocusInWindow();
            telefono.requestFocus(true);
            telefono.requestFocus();
            return;
        }
        try {
            nDni = Long.parseLong(dni.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,  "Usted no ingresó un nro de correcto de Dni ",
                "ERROR!", JOptionPane.ERROR_MESSAGE);
            dni.selectAll();
            dni.setFocusable(true);
            dni.requestFocusInWindow();
            dni.requestFocus(true);
            dni.requestFocus();
            return;
        }
        String ape = apellido.getText();
        int espacios = 0;
        for (int i=0;i<ape.length();i++) {
                if (ape.charAt(i)==' ') {
                espacios++;
            }
        }
        if (ape.isEmpty() || espacios==ape.length()) {
            JOptionPane.showMessageDialog(this, "No puede estar vacio el apellido", 
                    "ATENCION!", JOptionPane.WARNING_MESSAGE);
            apellido.selectAll();
            apellido.setFocusable(true);
            apellido.requestFocusInWindow();
            apellido.requestFocus(true);
            apellido.requestFocus();
            return;
        }
        String nom = nombre.getText();
        for (int i=0;i<nom.length();i++) {
                if (nom.charAt(i)==' ') {
                espacios++;
            }
        }
        if (nom.isEmpty() || espacios==nom.length()) {
            JOptionPane.showMessageDialog(this,  "No puede estar vacio el nombre", 
                    "ATENCION!", JOptionPane.WARNING_MESSAGE);
            nombre.selectAll();
            nombre.setFocusable(true);
            nombre.requestFocusInWindow();
            nombre.requestFocus(true);
            nombre.requestFocus();
            return;
        }    
        String ciu = ciudad.getText();
        for (int i=0;i<ciu.length();i++) {
                if (ciu.charAt(i)==' ') {
                espacios++;
            }
        }
        if (ciu.isEmpty() || espacios==ciu.length()) {
            JOptionPane.showMessageDialog(this,  "No puede estar vacio la ciudad", 
                    "ATENCION!", JOptionPane.WARNING_MESSAGE);
            ciudad.selectAll();
            ciudad.setFocusable(true);
            ciudad.requestFocusInWindow();
            ciudad.requestFocus(true);
            ciudad.requestFocus();
            return;
        }         
        String dir = direccion.getText();
        for (int i=0;i<dir.length();i++) {
                if (dir.charAt(i)==' ') {
                espacios++;
            }
        }
        if (dir.isEmpty() || espacios==dir.length()) {
            JOptionPane.showMessageDialog(this,  "No puede estar vacio la dirección", 
                    "ATENCION!", JOptionPane.WARNING_MESSAGE);
            direccion.selectAll();
            direccion.setFocusable(true);
            direccion.requestFocusInWindow();
            direccion.requestFocus(true);
            direccion.requestFocus();
            return;
        }         
        int opcion = JOptionPane.showConfirmDialog(null, "Se guardara el cliente\nDNI: "+nDni+"\nNombre: "+ape+", "+nom+"\nCiudad: "+ciu+"\nTelefono: "+tel+"\ndirección: "+dir,
                "Confirme los datos", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        switch (opcion) {
            case 0:
                directorio.agregarCliente(tel, nDni, ape, nom, ciu, dir);
                nuevo.doClick();
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente");
                break;
            case 1:
                dni.setFocusable(true);
                dni.requestFocusInWindow();
                dni.requestFocus(true);
                dni.requestFocus();
                break;
        }
        
    }//GEN-LAST:event_guardarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void dniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dniFocusLost

    }//GEN-LAST:event_dniFocusLost

    private void dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniActionPerformed
        apellido.setFocusable(true);
        apellido.requestFocusInWindow();
        apellido.requestFocus(true);
        apellido.requestFocus();
    }//GEN-LAST:event_dniActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        nombre.setFocusable(true);
        nombre.requestFocusInWindow();
        nombre.requestFocus(true);
        nombre.requestFocus();
    }//GEN-LAST:event_apellidoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        ciudad.setFocusable(true);
        ciudad.requestFocusInWindow();
        ciudad.requestFocus(true);
        ciudad.requestFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        direccion.setFocusable(true);
        direccion.requestFocusInWindow();
        direccion.requestFocus(true);
        direccion.requestFocus();
    }//GEN-LAST:event_ciudadActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        guardar.setFocusable(true);
        guardar.requestFocusInWindow();
        guardar.requestFocus(true);
        guardar.requestFocus();
    }//GEN-LAST:event_telefonoActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void salirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salirKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) dispose();
    }//GEN-LAST:event_salirKeyPressed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        dni.setFocusable(true);
        dni.requestFocusInWindow();
        dni.requestFocus(true);
        dni.requestFocus();
    }//GEN-LAST:event_formFocusGained

    private void guardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guardarKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) guardar.doClick();
    }//GEN-LAST:event_guardarKeyPressed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        telefono.setFocusable(true);
        telefono.requestFocusInWindow();
        telefono.requestFocus(true);
        telefono.requestFocus();
    }//GEN-LAST:event_direccionActionPerformed

    private void nuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoKeyPressed
        if (evt.getKeyCode()==evt.VK_ENTER) {
            nuevo.doClick();
        }
    }//GEN-LAST:event_nuevoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField ciudad;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dni;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
