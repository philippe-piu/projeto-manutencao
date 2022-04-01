/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import controller.GerenciaAndar;
import controller.GerenciaQuarto;
import model.Andar;
import model.Quarto;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class TelaAmbientes extends javax.swing.JFrame {
    private GerenciaAndar gencAndar = new GerenciaAndar();
    private GerenciaQuarto gencQuarto = new GerenciaQuarto();
    /**
     * Creates new form AndarViewTest
     */
    public TelaAmbientes() {
        initComponents();
        gerenciaTable();
    }
    
    public void gerenciaTable(){     
        if(rbAndares.isSelected()){
            jpAndar.setVisible(true);
            jpQuarto.setVisible(false);
            buttonSalvar.setEnabled(true);
            buttonEditar.setEnabled(false);
            populaTabelaAndar();
        }else if(rbQuartos.isSelected()){
            jpAndar.setVisible(false);
            jpQuarto.setVisible(true);
            buttonSalvar.setEnabled(false);
            buttonEditar.setEnabled(true);
            populaTabelaQuarto();
        }
    }
    
    public void populaTabelaAndar(){
        DefaultTableModel modelo = (DefaultTableModel) tblAndar.getModel();
        
        modelo.setNumRows(0);
        
        for(Andar a: gencAndar.buscTodosAndares()){
            modelo.addRow(new Object[]{
                a.getIdAndar(),
                a.getNumAndar(),
                a.getFuncionario().getNomeFuncionario()
            });
        }
        
    }
    
    public void populaTabelaQuarto(){
        DefaultTableModel modelo = (DefaultTableModel) tblQuarto.getModel();
        
        modelo.setNumRows(0);
        
        for(Quarto q: gencQuarto.buscTodosQuartos()){
            modelo.addRow(new Object[]{
                q.getIdQuarto(),
                q.getNumQuarto(),
                q.getTipoQuarto(),
                q.getNumCamasQuarto(),
                q.getQtdBanheirosQuarto(),
                q.getDescricaoQuarto(),
                q.getContatoQuarto(),
                q.getAndar().getNumAndar()
            });
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cbxAndar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxQuarto = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        rbAndares = new javax.swing.JRadioButton();
        rbQuartos = new javax.swing.JRadioButton();
        jpAndar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAndar = new javax.swing.JTable();
        jpQuarto = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQuarto = new javax.swing.JTable();
        btnInfos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Andar :");

        cbxAndar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbxAndar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Quantidade Quartos :");

        cbxQuarto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbxQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));

        buttonSalvar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonEditar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAndares);
        rbAndares.setSelected(true);
        rbAndares.setText("Gerenciar Andar");
        rbAndares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAndaresActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbQuartos);
        rbQuartos.setText("Gerenciar Quartos");
        rbQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbQuartosActionPerformed(evt);
            }
        });

        tblAndar.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        tblAndar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Andar", "Número do Andar", "ID Funionário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAndar);

        javax.swing.GroupLayout jpAndarLayout = new javax.swing.GroupLayout(jpAndar);
        jpAndar.setLayout(jpAndarLayout);
        jpAndarLayout.setHorizontalGroup(
            jpAndarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAndarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpAndarLayout.setVerticalGroup(
            jpAndarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tblQuarto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Número Quarto", "Tipo", "Camas", "Banheiros", "Descrição", "Contato", "Andar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblQuarto);

        javax.swing.GroupLayout jpQuartoLayout = new javax.swing.GroupLayout(jpQuarto);
        jpQuarto.setLayout(jpQuartoLayout);
        jpQuartoLayout.setHorizontalGroup(
            jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpQuartoLayout.setVerticalGroup(
            jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInfos.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnInfos.setText("Informações dos Quartos");
        btnInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jpAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(575, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(rbAndares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbQuartos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInfos)
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbxQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(rbQuartos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jpAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(627, 627, 627))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEditar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbAndares)
                                .addContainerGap(1052, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInfos)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        //EditarAndar criação de Andar
        gencAndar.criarNewAndar(Integer.parseInt(cbxAndar.getSelectedItem().toString()),Integer.parseInt(cbxQuarto.getSelectedItem().toString()));
        gerenciaTable();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        if(rbAndares.isSelected()){
            if(tblAndar.getSelectedRow() != -1){
                Andar andar = new Andar();
                andar.setNumAndar(Integer.parseInt(String.valueOf(tblAndar.getValueAt(tblAndar.getSelectedRow(), 1))));
                gencAndar.excluirAndar(andar.getNumAndar());
                gerenciaTable();
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um andar para excluir.");
            }
        }else if(rbQuartos.isSelected()){
            if(tblQuarto.getSelectedRow() != -1){
                Quarto quarto = new Quarto();
                quarto.setIdQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 0))));
                gencQuarto.excluirQuarto(quarto.getIdQuarto());
                gerenciaTable();
            }else{
                JOptionPane.showMessageDialog(null,"Selecione um andar para excluir.");
            }
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
        if(tblQuarto.getSelectedRow() != -1){
            Quarto quarto = new Quarto();
            quarto.setIdQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 0))));
            quarto.setNumQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 1))));
            quarto.setTipoQuarto(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 2)));
            quarto.setNumCamasQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 3))));
            quarto.setQtdBanheirosQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 4))));
            quarto.setDescricaoQuarto(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 5)));
            quarto.setContatoQuarto(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 6))));
            quarto.setAndar(gencAndar.buscarAndar(Integer.parseInt(String.valueOf(tblQuarto.getValueAt(tblQuarto.getSelectedRow(), 7)))));
            TelaEditarQuarto qtView = new TelaEditarQuarto();
            qtView.populaCampos(quarto);
            qtView.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um andar para editar.");
        }
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void rbAndaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAndaresActionPerformed
        gerenciaTable();
    }//GEN-LAST:event_rbAndaresActionPerformed

    private void rbQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbQuartosActionPerformed
        gerenciaTable();
    }//GEN-LAST:event_rbQuartosActionPerformed

    private void btnInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfosActionPerformed
        InformacaoQuartoView infoQView = new InformacaoQuartoView();
        infoQView.setVisible(true);
        
    }//GEN-LAST:event_btnInfosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmbientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAmbientes tlAmb = new TelaAmbientes();
                //Define o que acontece ao clicar em fechar
                tlAmb.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                
                tlAmb.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent evt){
                        //TelaPrincipal tlPrinc = new TelaPrincipal();
                        //tlPrinc.setVisible(true);
                        tlAmb.dispose();
                    }
                });
                
                tlAmb.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfos;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> cbxAndar;
    private javax.swing.JComboBox<String> cbxQuarto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpAndar;
    private javax.swing.JPanel jpQuarto;
    private javax.swing.JRadioButton rbAndares;
    private javax.swing.JRadioButton rbQuartos;
    private javax.swing.JTable tblAndar;
    private javax.swing.JTable tblQuarto;
    // End of variables declaration//GEN-END:variables
}
