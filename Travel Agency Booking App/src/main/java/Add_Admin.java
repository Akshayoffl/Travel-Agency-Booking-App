
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Add_Admin extends javax.swing.JInternalFrame {

        public Add_Admin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adminid = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Welcome To Admin Panel");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 40, 230, 24);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Admin ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(244, 61, 73, 19);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(244, 100, 84, 23);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(244, 141, 84, 19);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(244, 178, 84, 19);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(244, 218, 84, 19);
        jPanel1.add(adminid);
        adminid.setBounds(380, 60, 100, 22);
        jPanel1.add(firstname);
        firstname.setBounds(380, 101, 100, 22);
        jPanel1.add(lastname);
        lastname.setBounds(380, 138, 100, 22);
        jPanel1.add(username);
        username.setBounds(380, 175, 100, 22);
        jPanel1.add(password);
        password.setBounds(380, 215, 100, 22);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(307, 271, 72, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 100, 700, 350);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\appua\\OneDrive\\Desktop\\Final year project\\Images\\GradientWallpaper.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 891, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                String AdminID=adminid.getText();
                String FirstName=firstname.getText();
                String LastName=lastname.getText();
                String UserName=username.getText();
                String Password=password.getText();
                
                Connection con;
                PreparedStatement pre;
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_project","your server name","your password");
                pre=con.prepareStatement("insert into admin(Admin_ID,First_Name,Last_Name,Username,Password)values(?,?,?,?,?)");
                pre.setString(1, AdminID);
                pre.setString(2, FirstName);
                pre.setString(3, LastName);
                pre.setString(4, UserName);
                pre.setString(5, Password);
                
                pre.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Admin Added Successfully");
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Add_Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Add_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminid;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}