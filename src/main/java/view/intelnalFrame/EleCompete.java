/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.intelnalFrame;

import model.DAO.DAO;
import model.DAO.EleCompetenciasDAO;
import model.DAO.UniCompetenciasDAO;
import model.Entity.EleCompetencias;
import model.Entity.UniCopetencias;

/**
 *
 * @author oem
 */
public class EleCompete extends javax.swing.JInternalFrame {

    /**
     * Creates new form EleCompete
     */
    public EleCompete() {
        initComponents();
        popCbox();
        popCboxUniComp();
    }

    private void popCbox() {
        EleCompetenciasDAO e = new EleCompetenciasDAO();

        e.findAll().forEach((g) -> {
            cboxEdit.addItem(g);
        });
    }

    private void popCboxUniComp() {
        UniCompetenciasDAO udao = new UniCompetenciasDAO();

        udao.findAll().forEach((a) -> {
            cboxUniComp.addItem(a);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxUniComp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtADesc = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboxEdit = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lblUni = new javax.swing.JLabel();

        cboxUniComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));

        jLabel1.setText("Descrição");

        txtADesc.setColumns(20);
        txtADesc.setRows(5);
        jScrollPane1.setViewportView(txtADesc);

        btnCancel.setText("Cancelar");

        btnSave.setText("Salvar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Editar Elementos de Competencia");

        cboxEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione..." }));
        cboxEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEditActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        jLabel3.setText("Unidade de Competencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cboxEdit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxUniComp, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblUni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxUniComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSave))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DAO<EleCompetencias> dao = new DAO<>();
        EleCompetencias ecp = new EleCompetencias();
        UniCopetencias u = null;
        if (cboxUniComp.getSelectedIndex() != 0) {
            u = (UniCopetencias) cboxUniComp.getSelectedItem();
            ecp.setUniCopetencias(u);
        }

        if (!txtADesc.getText().isEmpty()) {
            ecp.setDescricao(txtADesc.getText());
        }

        try {
            if (lblUni.getText().isEmpty()) {
                dao.save(ecp);
            } else{
                EleCompetencias ec = (EleCompetencias) cboxEdit.getSelectedItem();
                
                ec.setDescricao(txtADesc.getText());
                if (u != null) {
                    ec.setUniCopetencias(u);
                } else{
                    ec.setUniCopetencias(ec.getUniCopetencias());
                }
                dao.update(ec);
            }
        } catch (Exception ex) {
            System.err.println("Erro ao salvar capacidade: " + ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cboxEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEditActionPerformed
        EleCompetencias e = (EleCompetencias) cboxEdit.getSelectedItem();
        if (e != null) {
            txtADesc.setText(e.getDescricao());
            lblUni.setText(e.getUniCopetencias().getDescricao());
        }
    }//GEN-LAST:event_cboxEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<Object> cboxEdit;
    private javax.swing.JComboBox<Object> cboxUniComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblUni;
    private javax.swing.JTextArea txtADesc;
    // End of variables declaration//GEN-END:variables

}
