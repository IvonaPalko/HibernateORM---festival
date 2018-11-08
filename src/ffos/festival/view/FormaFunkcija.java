/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.festival.view;

import ffos.festival.controller.ObradaFunkcija;
import ffos.festival.model.Funkcija;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivona
 */
public class FormaFunkcija extends javax.swing.JFrame {
        private ObradaFunkcija of;
    /**
     * Creates new form FormaFunkcija
     */
    public FormaFunkcija() {
        initComponents();
        of = new ObradaFunkcija();
        ucitaj();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
        private void ucitaj() {
        DefaultListModel m = new DefaultListModel();
        for (Funkcija f : of.getFunkcijas()) {
            m.addElement(f);
        }
        lstFunkcija.setModel(m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstFunkcija = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNazivFunkcije = new javax.swing.JTextField();
        btnDodajFunkciju = new javax.swing.JButton();
        btnPromjeniFunkciju = new javax.swing.JButton();
        btnObrisiFunkciju = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funkcija");

        lstFunkcija.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFunkcijaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstFunkcija);

        jLabel1.setText("FUNKCIJA");

        jLabel3.setText("Naziv");

        btnDodajFunkciju.setText("dodaj");
        btnDodajFunkciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajFunkcijuActionPerformed(evt);
            }
        });

        btnPromjeniFunkciju.setText("promjeni");
        btnPromjeniFunkciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniFunkcijuActionPerformed(evt);
            }
        });

        btnObrisiFunkciju.setText("obriši");
        btnObrisiFunkciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiFunkcijuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(txtNazivFunkcije, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajFunkciju)
                    .addComponent(btnPromjeniFunkciju)
                    .addComponent(btnObrisiFunkciju))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNazivFunkcije, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnDodajFunkciju)
                        .addGap(33, 33, 33)
                        .addComponent(btnPromjeniFunkciju)
                        .addGap(33, 33, 33)
                        .addComponent(btnObrisiFunkciju)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajFunkcijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajFunkcijuActionPerformed
        Funkcija f = new Funkcija();
        f.setNaziv(txtNazivFunkcije.getText());
        of.dodaj(f);
        ucitaj();

    }//GEN-LAST:event_btnDodajFunkcijuActionPerformed

    private void btnPromjeniFunkcijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniFunkcijuActionPerformed
        Funkcija f = null;
        try {
            DefaultListModel m = (DefaultListModel)lstFunkcija.getModel();
            f = (Funkcija)m.get(lstFunkcija.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        
        f.setNaziv(txtNazivFunkcije.getText());
        of.dodaj(f);
        ucitaj();
    }//GEN-LAST:event_btnPromjeniFunkcijuActionPerformed

    private void btnObrisiFunkcijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiFunkcijuActionPerformed
        Funkcija f = null;
        try {
            DefaultListModel m = (DefaultListModel)lstFunkcija.getModel();
            f = (Funkcija)m.get(lstFunkcija.getSelectedIndex());
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "Prvo odaberite stavku");
        }
        
        f.setNaziv(txtNazivFunkcije.getText());
        of.obrisi(f);
        ucitaj();
    }//GEN-LAST:event_btnObrisiFunkcijuActionPerformed

    private void lstFunkcijaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFunkcijaValueChanged
        try {
            DefaultListModel m = (DefaultListModel)lstFunkcija.getModel();
            Funkcija f = (Funkcija)m.get(lstFunkcija.getSelectedIndex());
            txtNazivFunkcije.setText(f.getNaziv());
        } catch (Exception e) {
        }

    }//GEN-LAST:event_lstFunkcijaValueChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajFunkciju;
    private javax.swing.JButton btnObrisiFunkciju;
    private javax.swing.JButton btnPromjeniFunkciju;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstFunkcija;
    private javax.swing.JTextField txtNazivFunkcije;
    // End of variables declaration//GEN-END:variables
}