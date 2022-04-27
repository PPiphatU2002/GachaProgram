package EtcProgram;

import LogIn.SignUpWindow;
import EtcProgram.NekoGachaWindow;
import ClassMethod.DB_Con;
import ClassMethod.Method;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PIPHAT
 */
public class TopUpWindow extends javax.swing.JFrame {

    /**
     * Creates new form TopUpWindow
     */
    public TopUpWindow() {
        initComponents();
        UID.setText(SignUpWindow.get_id());
        MB.setText(Method.get_money(SignUpWindow.get_id()) + "");
        Money.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Money = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MB = new javax.swing.JTextField();
        UID = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\Back.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 39, -1));

        jLabel2.setFont(new java.awt.Font("Angsana New", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("เติมเงิน");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 17, -1, -1));

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ใส่จำนวนเงินที่ต้องการ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 94, -1, -1));

        Money.setColumns(256);
        Money.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        Money.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoneyActionPerformed(evt);
            }
        });
        getContentPane().add(Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 91, 100, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("เงินคงเหลือ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 126, -1, -1));

        MB.setEditable(false);
        MB.setColumns(256);
        MB.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        MB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MB.setFocusable(false);
        MB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBActionPerformed(evt);
            }
        });
        getContentPane().add(MB, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 126, 100, -1));

        UID.setEditable(false);
        UID.setBackground(new java.awt.Color(255, 102, 102));
        UID.setColumns(256);
        UID.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        UID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        UID.setFocusable(false);
        UID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDActionPerformed(evt);
            }
        });
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 267, 100, -1));

        OK.setBackground(new java.awt.Color(255, 255, 255));
        OK.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        OK.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\Ok.png")); // NOI18N
        OK.setText("ตกลง");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\TopUp Cat.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        NekoGachaWindow IGW = new NekoGachaWindow();
        this.setVisible(false);
        IGW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MoneyActionPerformed

    private void MBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MBActionPerformed

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // TODO add your handling code here:
        ImageIcon Cat_Warning = new ImageIcon("C://My Learing//Java//DIT102//GachaProgram//photo//Cat Warning.gif");
        DB_Con db = new DB_Con();
        try {
            String money = Money.getText();
            if (money.length() > 4) {
                JOptionPane.showMessageDialog(null, "Can input money from 1 to 9999!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
            } else {
                int money1 = Integer.parseInt(money);
                String sql = String.format("Update user set user_money = ((select user_money from user where user_id='%s') + '%d') where user_id ='%s'", SignUpWindow.get_id(), money1, SignUpWindow.get_id());
                if (money1 >= 1) {
                    if (db.execute(sql)) {
                        ImageIcon Cat = new ImageIcon("C://My Learing//Java//DIT102//GachaProgram//photo//Cat Success.gif");
                        JOptionPane.showMessageDialog(null, "Success!", "", JOptionPane.INFORMATION_MESSAGE, Cat);
                        MB.setText(Method.get_money(SignUpWindow.get_id()) + "");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please input Numeric (Start at 1) without Negative mark!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something was Wrong!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
        }
    }//GEN-LAST:event_OKActionPerformed

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
            java.util.logging.Logger.getLogger(TopUpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TopUpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TopUpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TopUpWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopUpWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MB;
    private static javax.swing.JTextField Money;
    private javax.swing.JButton OK;
    private javax.swing.JTextField UID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
