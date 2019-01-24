
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.log.Log;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pirana
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);

    }
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/librarydb?zeroDateTimeBehavior=convertToNull";
    String user = "root";
    String pass = "";

    int xx;
    int xy;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        Log_Btn = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        txt_Combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SLTC LMS");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(860, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 22, -1));

        jLabelMinimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 0, 20, -1));

        jLabel10.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Login Panal");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 20));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Library Management System");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Access_25px.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Reading_100px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 200));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 118, 232));
        jLabel1.setText("User Id :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 71, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 143, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 118, 232));
        jLabel2.setText("Forgot Password....? Click Here");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 210, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 143, -1));

        jCheckBox1.setForeground(new java.awt.Color(45, 118, 232));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        Log_Btn.setBackground(new java.awt.Color(34, 167, 240));
        Log_Btn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Log_Btn.setForeground(new java.awt.Color(255, 255, 255));
        Log_Btn.setText("Login");
        Log_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_BtnActionPerformed(evt);
            }
        });
        jPanel1.add(Log_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 90, 30));

        btn_exit.setBackground(new java.awt.Color(192, 57, 43));
        btn_exit.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 90, 30));

        txt_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Librarian", "Admin" }));
        jPanel1.add(txt_Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 140, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 118, 232));
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 71, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);

        } else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void Log_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_BtnActionPerformed
        // TODO add your handling code here
        String access = (txt_Combo.getSelectedItem().toString());

        if ("Student".equals(access)) {
            String sql = "select * from student_data where Id = ? and Password = ?";
            try {
                Class.forName(driver);
                Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jPasswordField1.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Logged in Successesfully as a student");
                    Studentpanel search = new Studentpanel();
                    search.setVisible(true);
                    search.pack();
                    search.setLocationRelativeTo(null);
                    search.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username and password");
                    jTextField1.setText(null);
                    jPasswordField1.setText(null);

                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if ("Admin".equals(access)) {
            String sql = "select * from adminlogin where username = ? and Password = ?";
            try {
                Class.forName(driver);
                Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jPasswordField1.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Logged in Successesfully as an admin");
                    SuperAdmin sa = new SuperAdmin();
                    sa.setVisible(true);
                    sa.pack();
                    sa.setLocationRelativeTo(null);
                    sa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username and password");
                    jTextField1.setText(null);
                    jPasswordField1.setText(null);

                }
                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if ("Librarian".equals(access)) {
            String sql = "select * from login where username = ? and password = ?";
            try {
                Class.forName(driver);
                Connection con = (Connection) DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jPasswordField1.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "Successesfully Logged in as a Librarian");
                    AdminHome LH = new AdminHome();
                    LH.setVisible(true);
                    LH.pack();
                    LH.setLocationRelativeTo(null);
                    LH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username and password");
                    jTextField1.setText(null);
                    jPasswordField1.setText(null);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }

    }//GEN-LAST:event_Log_BtnActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Please contact the administration... ");
    }//GEN-LAST:event_jLabel2MousePressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Log_Btn;
    private javax.swing.JButton btn_exit;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel exit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> txt_Combo;
    // End of variables declaration//GEN-END:variables
}
