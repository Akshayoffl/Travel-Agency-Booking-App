
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class View_Ticket extends javax.swing.JInternalFrame {
    
      private Connection conn;

    public View_Ticket() {
        initComponents();
         connectToDatabase(); 
         lblInput.setVisible(false);
         txtInput.setVisible(false);
         btnSearch.setVisible(false);
         jDateChooser.setVisible(false);
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbSearchOption = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        lblSearchBy = new javax.swing.JLabel();
        lblInput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbSearchOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Ticket ID", "Vehicle ID", "Date", "Customer Name" }));
        cmbSearchOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSearchOptionActionPerformed(evt);
            }
        });

        tblResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Ticket ID", "Transport ID", "Transport Name", "Departure", "Arrival", "Date", "Time", "Customer Name", "Gender", "Age", "Phone Number", "Address", "price", "Duration"
            }
        ));
        jScrollPane1.setViewportView(tblResults);

        lblSearchBy.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblSearchBy.setText("Search Ticket By");

        lblInput.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lblInput.setText("Enter Value");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(lblSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSearchOption, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(lblInput)
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)))
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSearchOption, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbSearchOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSearchOptionActionPerformed
        // TODO add your handling code here:
        
         String selectedOption = (String) cmbSearchOption.getSelectedItem();

        lblInput.setVisible(false);
        txtInput.setVisible(false);
        btnSearch.setVisible(false);
        jDateChooser.setVisible(false);


    if (!selectedOption.equals("Select")) {
        lblInput.setText("Enter " + selectedOption + ":");
        lblInput.setVisible(true);
        btnSearch.setVisible(true);

        if (selectedOption.equals("Date")) {
            jDateChooser.setVisible(true);
        } else {
            txtInput.setVisible(true);
        }
    }
    }//GEN-LAST:event_cmbSearchOptionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
    String selectedOption = (String) cmbSearchOption.getSelectedItem();
    String inputValue = txtInput.getText().trim();

    
        if (selectedOption.equals("Date")) {
            Date selectedDate = jDateChooser.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Please select a date!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            inputValue = sdf.format(selectedDate);
        } else {
            if (inputValue.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a value!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

    String query = "";

    if (selectedOption.equals("Ticket ID")) {
        if (inputValue.startsWith("HAFLT")) {
            query = "SELECT * FROM flight_ticket WHERE Ticket_ID = ?";
        } else if (inputValue.startsWith("HTBUT")) {
            query = "SELECT * FROM bus_ticket WHERE Ticket_ID = ?";
        } else if (inputValue.startsWith("HTTAT")) {
            query = "SELECT * FROM taxi_ticket WHERE Ticket_ID = ?";
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Ticket ID!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        displayResults(query, inputValue);
    } 
    else if (selectedOption.equals("Vehicle ID")) {
        query = "SELECT * FROM flight_ticket WHERE Transport_ID = ? UNION ALL "
              + "SELECT * FROM bus_ticket WHERE Transport_ID = ? UNION ALL "
              + "SELECT * FROM taxi_ticket WHERE Transport_ID = ?";
        displayResults(query, inputValue, inputValue, inputValue); 
    } 
    else if (selectedOption.equals("Date")) {
        query = "SELECT * FROM flight_ticket WHERE Date = ? UNION ALL "
              + "SELECT * FROM bus_ticket WHERE Date = ? UNION ALL "
              + "SELECT * FROM taxi_ticket WHERE Date = ?";
        displayResults(query, inputValue, inputValue, inputValue);
    } 
    else if (selectedOption.equals("Customer Name")) {
        query = "SELECT * FROM flight_ticket WHERE Customer_Name LIKE ? UNION ALL "
              + "SELECT * FROM bus_ticket WHERE Customer_Name LIKE ? UNION ALL "
              + "SELECT * FROM taxi_ticket WHERE Customer_Name LIKE ?";
        inputValue = "%" + inputValue + "%"; // Wildcard for partial match
        displayResults(query, inputValue, inputValue, inputValue);
    }
    }


    private void connectToDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline_project", "root", "Akshay@2255");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + e.getMessage());
        }
    }

   private void displayResults(String query, String... params) {
    try (PreparedStatement pst = conn.prepareStatement(query)) {
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }
        ResultSet rs = pst.executeQuery();

        String[] columnNames = {
            "Ticket_ID", "Transport_ID", "Transport_Name", "Departure", "Arrival",
            "Date", "Time", "Customer_Name", "Gender", "Age", "Phone_Number",
            "Address", "Price", "Duration"
        };
        
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); 

        while (rs.next()) {
            Object[] rowData = new Object[columnNames.length];
            for (int i = 0; i < columnNames.length; i++) {
                rowData[i] = rs.getObject(columnNames[i]);
            }
            model.addRow(rowData);
        }
        
           tblResults.setModel(model);
            tblResults.setAutoCreateRowSorter(true);

        tblResults.setModel(model);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }



    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbSearchOption;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblSearchBy;
    private javax.swing.JTable tblResults;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
