/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import telas.Cadastrodecliente;

/**
 *
 * @author Wagner Luiz
 */
public class Telainicial extends javax.swing.JFrame {

    /**
     * Creates new form painelinicial
     */
    public Telainicial() {
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

        sair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sairinicial = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        logado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        consultaclientes = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        gerarrecibo = new javax.swing.JMenu();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        consultarecibo = new javax.swing.JRadioButtonMenuItem();
        gerarorcamento = new javax.swing.JMenu();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        consultaorcamentos = new javax.swing.JRadioButtonMenuItem();
        cadastracliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cadastraproduto = new javax.swing.JMenuItem();
        cadastraservico = new javax.swing.JMenuItem();
        alteradados = new javax.swing.JMenu();

        sair.setText("Sair");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        sairinicial.setText("Sair");
        sairinicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairinicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sairinicial)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(sairinicial)
                .addContainerGap())
        );

        logado.setText("Bem vindo ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logado)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logado)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));

        consultaclientes.setText("Consulta");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Clientes");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        consultaclientes.add(jRadioButtonMenuItem3);

        jMenuBar1.add(consultaclientes);

        gerarrecibo.setText("Recibos");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Gerar recibo");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        gerarrecibo.add(jRadioButtonMenuItem4);

        consultarecibo.setSelected(true);
        consultarecibo.setText("Recibos gerados");
        gerarrecibo.add(consultarecibo);

        jMenuBar1.add(gerarrecibo);

        gerarorcamento.setText("Orçamentos");

        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Gerar orçamento");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        gerarorcamento.add(jRadioButtonMenuItem6);

        consultaorcamentos.setSelected(true);
        consultaorcamentos.setText("Orçamentos gerados");
        gerarorcamento.add(consultaorcamentos);

        jMenuBar1.add(gerarorcamento);

        cadastracliente.setText("Cadastrar");

        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cadastracliente.add(jMenuItem1);

        cadastraproduto.setText("Produtos");
        cadastraproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraprodutoActionPerformed(evt);
            }
        });
        cadastracliente.add(cadastraproduto);

        cadastraservico.setText("Serviços");
        cadastraservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraservicoActionPerformed(evt);
            }
        });
        cadastracliente.add(cadastraservico);

        jMenuBar1.add(cadastracliente);

        alteradados.setText("Alterar dados ");
        alteradados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alteradadosActionPerformed(evt);
            }
        });
        jMenuBar1.add(alteradados);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       Cadastrodecliente cliente= new Cadastrodecliente();
       cliente.setVisible(true);
       
       
       
       
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void sairinicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairinicialActionPerformed
        int valor = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?","Sistema de recibos.", 1);
        if (valor == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_sairinicialActionPerformed

    private void cadastraprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraprodutoActionPerformed
Cadastroproduto cadastprod=new Cadastroproduto();
cadastprod.setVisible(true);
    }//GEN-LAST:event_cadastraprodutoActionPerformed

    private void cadastraservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraservicoActionPerformed
Cadastroservico cadserv =new Cadastroservico();
cadserv.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_cadastraservicoActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
Recibo r = new Recibo();
r.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
Orcamento orc = new Orcamento();
orc.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
Cadastrodecliente cadclient=new Cadastrodecliente();
cadclient.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void alteradadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alteradadosActionPerformed
Cadastro cad = new Cadastro();
cad.setVisible(true);
    }//GEN-LAST:event_alteradadosActionPerformed

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
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Telainicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alteradados;
    private javax.swing.JMenu cadastracliente;
    private javax.swing.JMenuItem cadastraproduto;
    private javax.swing.JMenuItem cadastraservico;
    private javax.swing.JMenu consultaclientes;
    private javax.swing.JRadioButtonMenuItem consultaorcamentos;
    private javax.swing.JRadioButtonMenuItem consultarecibo;
    private javax.swing.JMenu gerarorcamento;
    private javax.swing.JMenu gerarrecibo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JLabel logado;
    private javax.swing.JButton sair;
    private javax.swing.JButton sairinicial;
    // End of variables declaration//GEN-END:variables
}
