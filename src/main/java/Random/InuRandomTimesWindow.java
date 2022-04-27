package Random;

import LogIn.SignUpWindow;
import Random.NekoRecieveWindow;
import ClassMethod.Method;
import ClassMethod.DB_Con;
import ClassMethod.ItemObject;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template


/**
 *
 * @author PIPHAT
 */
public class InuRandomTimesWindow extends javax.swing.JFrame {
ImageIcon Inu = new ImageIcon("C://My Learing//Java//DIT102//GachaProgram//photo//Inu Show.gif");
ImageIcon Cat_Warning = new ImageIcon("C://My Learing//Java//DIT102//GachaProgram//photo//Cat Warning.gif");
    /**
     * Creates new form RandomTimesWindow
     */
    public static String GachaID;

    public InuRandomTimesWindow(String Gacha) {
        initComponents();
        UID.setText(SignUpWindow.get_id());
        STB.setText(Method.get_exchange(SignUpWindow.get_id()) + "");
        onetime.requestFocus();
        GachaID = Gacha;
    }

    private String[] CountOn100(String GachaID) {
        String sql = String.format("Select item_id,history_id from history where user_id = '%s' and gacha_id = '%s'", SignUpWindow.get_id(), GachaID);
        DB_Con db = new DB_Con();
        try {
            ResultSet rs = db.getResultSet(sql);
            int count = 0;
            sql = String.format("Select item_id , item_rate  from item where gacha_id ='%s'",GachaID);
            ResultSet rt = db.getResultSet(sql);
            String item = "";
            int minrate = Integer.MAX_VALUE;
            while (rt.next()) {
                if (minrate > rt.getInt(2)) {
                    minrate = rt.getInt(2);
                    item = rt.getString(1);
                }
            }
            while (rs.next()) {
                count++;
                if (rs.getString(1).equals(item)) {
                    count = 0;
                }
            }
            
            String[] count100 = {String.valueOf(count), item};
            return count100;
        } catch (Exception e) {
            return null;
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

        jLabel1 = new javax.swing.JLabel();
        fivetime = new javax.swing.JButton();
        onetime = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        STB = new javax.swing.JTextField();
        UID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tentime = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(340, 235));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("จะสุ่มกี่ครั้ง ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        fivetime.setBackground(new java.awt.Color(255, 102, 102));
        fivetime.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        fivetime.setText("5 ครั้ง");
        fivetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivetimeActionPerformed(evt);
            }
        });
        getContentPane().add(fivetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 151, 79, -1));

        onetime.setBackground(new java.awt.Color(255, 102, 102));
        onetime.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        onetime.setText("1 ครั้ง");
        onetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetimeActionPerformed(evt);
            }
        });
        getContentPane().add(onetime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 104, 79, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Token คงเหลือ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 265, -1, -1));

        STB.setEditable(false);
        STB.setColumns(256);
        STB.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        STB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        STB.setFocusable(false);
        STB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STBActionPerformed(evt);
            }
        });
        getContentPane().add(STB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

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
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 263, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\Back.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 39, -1));

        tentime.setBackground(new java.awt.Color(255, 102, 102));
        tentime.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        tentime.setText("10 ครั้ง");
        tentime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentimeActionPerformed(evt);
            }
        });
        getContentPane().add(tentime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 198, 79, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\Dog Random.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void STBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STBActionPerformed

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    private void onetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetimeActionPerformed
        // TODO add your handling code here:
        DB_Con db = new DB_Con();
        try {
            if (Method.get_exchange(SignUpWindow.get_id()) < 1) {
                JOptionPane.showMessageDialog(null, "You Don't have enoght Neko Roll!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
            } else {
                for (int i = 0; i < 1; i++) {
                    String[] temp = CountOn100(GachaID);
                    if (temp[0].equals("99")) {
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, temp[1]);
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        ItemObject item = Method.RandomItem(Method.GetItem(GachaID));
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, item.getId());
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        if (item.getId().equals(temp[1])){
                            JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        } 
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                InuRecieveWindow IRW = new InuRecieveWindow(1);
                this.setVisible(false);
                IRW.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_onetimeActionPerformed

    private void fivetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivetimeActionPerformed
        // TODO add your handling code here:
        DB_Con db = new DB_Con();
        try {
            if (Method.get_exchange(SignUpWindow.get_id()) <= 4) {
                JOptionPane.showMessageDialog(null, "You Don't have enoght Neko Roll!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
            } else {
                for (int i = 1; i <= 5; i++) {
                    String[] temp = CountOn100(GachaID);
                    if (temp[0].equals("99")) {
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, temp[1]);
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        ItemObject item = Method.RandomItem(Method.GetItem(GachaID));
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, item.getId());
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        if (item.getId().equals(temp[1])){
                            JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        } 
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {

                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                InuRecieveWindow IRW = new InuRecieveWindow(5);
                this.setVisible(false);
                IRW.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_fivetimeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GachaSelectedWindow GSW = new GachaSelectedWindow();
        this.setVisible(false);
        GSW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tentimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentimeActionPerformed
        // TODO add your handling code here:
        DB_Con db = new DB_Con();
        try {
            if (Method.get_exchange(SignUpWindow.get_id()) <= 9) {
                JOptionPane.showMessageDialog(null, "You Don't have enoght Neko Roll!", "", JOptionPane.INFORMATION_MESSAGE, Cat_Warning);
            } else {
                for (int i = 1; i <= 10; i++) {
                    String[] temp = CountOn100(GachaID);
                    if (temp[0].equals("99")) {
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, temp[1]);
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        ItemObject item = Method.RandomItem(Method.GetItem(GachaID));
                        String sql = String.format("INSERT INTO history (user_id,gacha_id,item_id) values ('%s','%s','%s') ", SignUpWindow.get_id(), GachaID, item.getId());
                        String sql1 = String.format("Update user set user_exchange = ((select user_exchange from user where user_id='%s') - '%d') where user_id ='%s' ", SignUpWindow.get_id(), 1, SignUpWindow.get_id());
                        if (item.getId().equals(temp[1])){
                           JOptionPane.showMessageDialog(null, "Wan Wan!", "", JOptionPane.INFORMATION_MESSAGE, Inu);
                        } 
                        try {
                            if (db.execute(sql) && db.execute(sql1)) {
                            } else {
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                }
                InuRecieveWindow IRW = new InuRecieveWindow(10);
                this.setVisible(false);
                IRW.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something was Wrong!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tentimeActionPerformed

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
            java.util.logging.Logger.getLogger(InuRandomTimesWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InuRandomTimesWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InuRandomTimesWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InuRandomTimesWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InuRandomTimesWindow(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField STB;
    private javax.swing.JTextField UID;
    private javax.swing.JButton fivetime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton onetime;
    private javax.swing.JButton tentime;
    // End of variables declaration//GEN-END:variables
}
