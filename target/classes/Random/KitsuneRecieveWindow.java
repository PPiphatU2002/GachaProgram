package Random;


import LogIn.SignUpWindow;
import EtcProgram.NekoGachaWindow;
import ClassMethod.Method;
import javax.swing.table.DefaultTableModel;
import ClassMethod.DB_Con;
import EtcProgram.NekoGachaWindow;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template


/**
 *
 * @author PIPHAT
 */
public class KitsuneRecieveWindow extends javax.swing.JFrame {

    /**
     * Creates new form ItemWhatYouHaveWindow
     */

    public KitsuneRecieveWindow(int number) {
        initComponents();
        UID.setText(SignUpWindow.get_id());
        STB.setText(Method.get_exchange(SignUpWindow.get_id()) + "");
        RTD.requestFocus();
        String column[] = {"Item Name","Level"};
        DefaultTableModel dt = new DefaultTableModel(column,0);
        String sql = String.format("Select item.item_name,item.item_level from history join item on history.item_id = item.item_id where user_id = '%s' ORDER BY history_id DESC LIMIT %d  ",SignUpWindow.get_id(),number);
        DB_Con db = new DB_Con();
        try{
            ResultSet rs = db.getResultSet(sql);
            while(rs.next()){
                String Row[] = {rs.getString(1),rs.getString(2)};
                dt.addRow(Row);
            }
            YouHave.setModel(dt);
        }catch(Exception e){
            
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
        jLabel4 = new javax.swing.JLabel();
        STB = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        YouHave = new javax.swing.JTable();
        RTD = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        UID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("คุณได้รับ Item");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Token คงเหลือ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 263, -1, -1));

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
        getContentPane().add(STB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 260, 100, -1));

        YouHave.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        YouHave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        YouHave.setFocusable(false);
        jScrollPane1.setViewportView(YouHave);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 52, 349, 150));

        RTD.setBackground(new java.awt.Color(255, 102, 102));
        RTD.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        RTD.setText("กลับไปหน้าหลัก");
        RTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTDActionPerformed(evt);
            }
        });
        getContentPane().add(RTD, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 218, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Angsana New", 1, 18)); // NOI18N
        jButton3.setText("สุ่มอีกครั้ง");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 218, -1, -1));

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
        getContentPane().add(UID, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 261, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\My Learing\\Java\\DIT102\\GachaProgram\\photo\\Fox Recieve.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void STBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STBActionPerformed

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        KitsuneRandomTimesWindow KRW = new KitsuneRandomTimesWindow(KitsuneRandomTimesWindow.GachaID);
        this.setVisible(false);
        KRW.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void RTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTDActionPerformed
        // TODO add your handling code here:
        NekoGachaWindow IGW = new NekoGachaWindow();
        this.dispose();
        IGW.setVisible(true);
        
    }//GEN-LAST:event_RTDActionPerformed

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
            java.util.logging.Logger.getLogger(KitsuneRecieveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitsuneRecieveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitsuneRecieveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitsuneRecieveWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KitsuneRecieveWindow(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RTD;
    private javax.swing.JTextField STB;
    private javax.swing.JTextField UID;
    private javax.swing.JTable YouHave;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
