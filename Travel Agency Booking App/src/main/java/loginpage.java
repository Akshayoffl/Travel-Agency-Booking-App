
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class loginpage extends javax.swing.JFrame {

    
    public loginpage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));
        setPreferredSize(new java.awt.Dimension(680, 360));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(54, 69, 79,80));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 28)); // NOI18N
        jLabel1.setText("Sign In");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 140, 80, 40);

        username.setBackground(new java.awt.Color(204, 255, 255));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(160, 240, 210, 36);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 220, 66, 16);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 280, 66, 16);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(210, 360, 101, 34);

        password.setBackground(new java.awt.Color(204, 255, 255));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(160, 300, 210, 35);

        jLabel5.setFont(new java.awt.Font("Pristina", 1, 24)); // NOI18N
        jLabel5.setText("SunStone Holidays");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 50, 170, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 50, 520, 520);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\appua\\OneDrive\\Desktop\\Final year project\\Images\\LoginWallpaper.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1020, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if(username.getText().equals("Enter Username"))
        {
            username.setText("");
            username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if(username.getText().equals(""))
        {
            username.setText("Enter Username");
            username.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if(password.getText().equals("Enter Password"))
        {
            password.setText("");
            password.setForeground(new Color(153,153,153));
        } else {
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if(password.getText().equals(""))
        {
            password.setText("Enter Password");
            password.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String Username = username.getText();
            String Password = new String(password.getPassword());
            
            Connection con;
            PreparedStatement pre;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Akshay@2255");
            pre=con.prepareStatement("SELECT * FROM admin WHERE Username=? and Password=?");
            pre.setString(1, Username);
            pre.setString(2, Password);
            
            ResultSet rs = pre.executeQuery();
            
            if(rs.next()!=false){
                Admin_Section main = new Admin_Section();
                main.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(loginpage.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
