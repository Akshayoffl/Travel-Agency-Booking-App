
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;





public class Add_Taxi extends javax.swing.JInternalFrame {

   
    public Add_Taxi() {
        initComponents();
       autoid();
    }
    
     public void autoid()
    {
        try {  
            
            Connection con;
            PreparedStatement pre;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Akshay@2255");
            pre = con.prepareStatement("SELECT Taxi_ID FROM taxi ORDER BY taxi_ID DESC LIMIT 1");
            ResultSet rs=pre.executeQuery();
            
            
        if (rs.next()) {
            String maxID = rs.getString(1);
            if (maxID != null && maxID.startsWith("HTTA")) {
                String numericPart = maxID.substring(4); 
                try {
                    int id = Integer.parseInt(numericPart);
                    id++; 
                    taxiid.setText(String.format("HTTA%03d", id));
                } catch (NumberFormatException e) {
                    taxiid.setText("HTTA001"); 
                }
            } else {
                taxiid.setText("HTTA001"); 
            }
        } else {
            taxiid.setText("HTTA001"); 
        }

        con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book_Flight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book_Flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        departure = new javax.swing.JComboBox<>();
        arrival = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        taxiid = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        duration = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        totalseats = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ticketfare = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        taxiname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Add Taxi");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 10, 100, 24);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        departure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annur", "Ashokapuram", "Coimbatore", "Ettimadai", "Idikarai", "Irugur", "Karamadai", "Karumathampatti", "Madhukkarai", "Mettupalayam", "Narasimhanaickenpalayam", "Othakalmandapam", "Periyanaickenpalayam", "Perur", "Podanur", "Saravanampatti", "Thirumalayampalayam", "Thondamuthur", "Town Hall", "Ukkadam", " ", " " }));

        arrival.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annur", "Ashokapuram", "Coimbatore", "Ettimadai", "Idikarai", "Irugur", "Karamadai", "Karumathampatti", "Madhukkarai", "Mettupalayam", "Narasimhanaickenpalayam", "Othakalmandapam", "Periyanaickenpalayam", "Perur", "Podanur", "Saravanampatti", "Thirumalayampalayam", "Thondamuthur", "Town Hall", "Ukkadam" }));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Taxi Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Arrival");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Departure");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Time");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Total Seats");

        taxiid.setBackground(new java.awt.Color(204, 204, 204));

        time.setBackground(new java.awt.Color(204, 204, 204));

        date.setBackground(new java.awt.Color(204, 204, 204));

        duration.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Add Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Duration");

        totalseats.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Ticket Fare");

        ticketfare.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Taxi Name");

        taxiname.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(126, 126, 126)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalseats, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ticketfare, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taxiid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(taxiname, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(106, 106, 106)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(taxiid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(taxiname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6))
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(totalseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(ticketfare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 50, 410, 470);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\appua\\OneDrive\\Desktop\\Final year project\\Images\\GradientWallpaper.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 550);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(790, 160, 122, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String TaxiID = taxiid.getText();
            String TaxiName=taxiname.getText();
            String Departure = (String)departure.getSelectedItem();
            String Arrival=(String)arrival.getSelectedItem();
            String Time = time.getText();
            DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
            String Date=da.format(date.getDate());
            String Duration = duration.getText();
            String TotalSeats = totalseats.getText();
            String TicketFare = ticketfare.getText();
            
           
            
            
            
            
            Connection con;        
            PreparedStatement pre;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_project","root","Akshay@2255");
            pre=con.prepareStatement("insert into taxi(Taxi_ID,Taxi_Name,Departure,Arrival,Time,Date,Duration,Total_Seats,Ticket_Fare)values(?,?,?,?,?,?,?,?,?)");
            pre.setString(1, TaxiID);
            pre.setString(2, TaxiName);
            pre.setString(3, Departure);
            pre.setString(4, Arrival);
            pre.setString(5, Time);
            pre.setString(6, Date);
            pre.setString(7, Duration);
            pre.setString(8, TotalSeats);
            pre.setString(9, TicketFare);
            
            pre.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Taxi Added Successfully");
            
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Add_flight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Add_flight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arrival;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JComboBox<String> departure;
    private javax.swing.JTextField duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField taxiid;
    private javax.swing.JTextField taxiname;
    private javax.swing.JTextField ticketfare;
    private javax.swing.JTextField time;
    private javax.swing.JTextField totalseats;
    // End of variables declaration//GEN-END:variables
}
