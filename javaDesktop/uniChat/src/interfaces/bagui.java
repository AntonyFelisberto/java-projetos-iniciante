/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import static java.awt.SystemColor.desktop;
import javax.swing.JOptionPane;

/**
 *
 * @author VP
 */
public class bagui extends javax.swing.JFrame {

    String nome,senha;
    int s=0,r=0,tamnome,tamsenha;
    public bagui() {
        initComponents();
        this.setSize(1200, 700);
        this.setLocationRelativeTo(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomes = new javax.swing.JPasswordField();
        senhas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        nomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomesActionPerformed(evt);
            }
        });
        getContentPane().add(nomes);
        nomes.setBounds(580, 340, 140, 30);
        getContentPane().add(senhas);
        senhas.setBounds(580, 300, 140, 30);

        jLabel2.setText("nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 300, 50, 20);

        jLabel3.setText("senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 340, 50, 20);

        jButton1.setText("valide");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 390, 80, 23);

        jButton2.setText("não sou cadastrado");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 420, 150, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3254aa65-0c96-4eaa-96b7-cf790d3eabfc.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      mm chame=new mm();
      do{
        nome=nomes.getText();
        tamnome=nome.length();
        
        if(nome.isEmpty() || tamnome<10 || tamnome>25){
            JOptionPane.showMessageDialog(null,"ERRO\n-VERIFIQUE SE NÃO HÁ UM CAMPO VAZIO\n-VERIFIQUE SE O TAMANHO NÃO ULTRAPASSA 10 OU 15 CARACTERES\n");
            break;
        }
        senha=senhas.getText();
        tamsenha=senha.length();
        if(senha.isEmpty() || tamsenha<10 || tamsenha>20){
            JOptionPane.showMessageDialog(null,"ERRO\n-VERIFIQUE SE NÃO HÁ UM CAMPO VAZIO\n-VERIFIQUE SE O TAMANHO NÃO ULTRAPASSA 10 OU 15 CARACTERES\n");
            break;
        }

    }while(nome.isEmpty() || tamnome<10 || tamnome>25 || senha.isEmpty() || tamsenha<10 || tamsenha>20);
 
        tela prin=new tela();
        prin.setVisible(true);
        dispose();
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void nomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomesActionPerformed
      
    }//GEN-LAST:event_nomesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        m asd=new m();
        asd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(bagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bagui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bagui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField nomes;
    private javax.swing.JTextField senhas;
    // End of variables declaration//GEN-END:variables

    private void setMaximumSize(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
