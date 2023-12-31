/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rapitgt;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.Vector;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author MCS
 */
public class UserTable extends javax.swing.JFrame {

   

    /**
     * Creates new form UserTable
     */
    public UserTable() {
        initComponents();
        loadData();
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        delete_user = new javax.swing.JButton();
        update_user = new javax.swing.JButton();
        search_user_in_db = new javax.swing.JButton();
        add_user = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Email", "Password", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DashBoard");

        delete_user.setText("Delete");
        delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_userActionPerformed(evt);
            }
        });

        update_user.setText("Update");
        update_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_userActionPerformed(evt);
            }
        });

        search_user_in_db.setText("Search");
        search_user_in_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_user_in_dbActionPerformed(evt);
            }
        });

        add_user.setText("Add");
        add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(usernameLabel)
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(delete_user)
                .addGap(18, 18, 18)
                .addComponent(update_user)
                .addGap(18, 18, 18)
                .addComponent(search_user_in_db)
                .addGap(18, 18, 18)
                .addComponent(add_user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(usernameLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_user)
                    .addComponent(update_user)
                    .addComponent(search_user_in_db)
                    .addComponent(add_user))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_userActionPerformed
  // Get the selected row index from the table
        int selectedRowIndex = jTable1.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex != -1) {
            // Assuming the user ID is stored in the first column (index 0)
            Object userId = jTable1.getValueAt(selectedRowIndex, 0);

            // Remove the user from the table
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRowIndex);

            // Remove the user from the database
            deleteFromDatabase(userId);
            JOptionPane.showMessageDialog(this, "User Delete Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a user to delete", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void deleteFromDatabase(Object id) {
        // TODO: Implement the database deletion logic here
        // Use your database connection and execute a DELETE query
        bll bl=new bll();
      bl.deletehandle(id); 
        
    
    }//GEN-LAST:event_delete_userActionPerformed




public class UpdateUserFrame extends JFrame {
    private JTextField usernameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JComboBox<String> genderComboBox;

    public UpdateUserFrame(String userId, String username, String email, String gender) {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Update User's Details");
        setSize(500, 300);

        // Initialize components
        usernameField = new JTextField(username);
        emailField = new JTextField(email);
        passwordField = new JPasswordField();
        genderComboBox = new JComboBox<>(new String[]{"Male", "Female" ,"Others"});
        genderComboBox.setSelectedItem(gender);

        JButton updateButton = new JButton("Update");
        updateButton.addActionListener(e -> updateActionPerformed(userId));

        // Set layout
        setLayout(new GridLayout(10, 6));
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(new JLabel("Gender:"));
        add(genderComboBox);
        add(new JLabel("")); // Empty label for spacing
        add(updateButton);

        setLocationRelativeTo(null); // Center the frame
    }

    private void updateActionPerformed(String userId) {
        // Retrieve values from fields
        String newUsername = usernameField.getText();
        String newEmail = emailField.getText();
        String newPassword = new String(passwordField.getPassword());
        String newGender = genderComboBox.getSelectedItem().toString();

        try {
            // Open connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "");

            // Prepare and execute the update query
            String updateQuery = "UPDATE registration_table SET username=?, email=?, password=?, gender=? WHERE id=?";
            try (PreparedStatement preparedStatement = con.prepareStatement(updateQuery)) {
                preparedStatement.setString(1, newUsername);
                preparedStatement.setString(2, newEmail);
                preparedStatement.setString(3, newPassword);
                preparedStatement.setString(4, newGender);
                preparedStatement.setString(5, userId);

                // Execute the update
                preparedStatement.executeUpdate();

                // Inform the user about the successful update
                JOptionPane.showMessageDialog(this, "User updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Close the update frame
                dispose();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            // Handle the exception appropriately
        }
    }
    // Method to refresh jTable1 data

}


    private void update_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_userActionPerformed
int selectedRowIndex = jTable1.getSelectedRow();

        if (selectedRowIndex != -1) {
            // Get values from the selected row in the JTable
            String userId = jTable1.getModel().getValueAt(selectedRowIndex, 0).toString();
            String username = jTable1.getModel().getValueAt(selectedRowIndex, 1).toString();
            String email = jTable1.getModel().getValueAt(selectedRowIndex, 2).toString();
            String gender = jTable1.getModel().getValueAt(selectedRowIndex, 4).toString();

            // Open the update frame
            SwingUtilities.invokeLater(() -> {
                UpdateUserFrame updateFrame = new UpdateUserFrame(userId, username, email, gender);
                updateFrame.setVisible(true);

                // Add a window listener to the update frame to refresh jTable1 after it's closed
                updateFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        // Refresh jTable1 after the update frame is closed
                        refreshJTableData();
                    }
                });
            });
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to update", "No Selection", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Method to refresh jTable1 data
    private void refreshJTableData() {
        // Clear the existing rows in the table model
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        try {
            // Fetch updated data from the database (replace the comment with your logic)
            Vector<Vector<Object>> newData = fetchDataFromDatabase();

            // Add the updated data to the table model
            for (Vector<Object> row : newData) {
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }

    // Example method to fetch updated data from the database (replace with your logic)
    private Vector<Vector<Object>> fetchDataFromDatabase() throws SQLException {
        Vector<Vector<Object>> data = new Vector<>();
 
        // Open connection
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "")) {
            // Execute a SELECT query to get updated data (replace the query with your logic)
            String selectQuery = "SELECT id, username, email, password, gender FROM registration_table";
            try (PreparedStatement preparedStatement = con.prepareStatement(selectQuery)) {
                // Execute the query and retrieve the result set
                var resultSet = preparedStatement.executeQuery();

                // Iterate over the result set and add rows to the data vector
                while (resultSet.next()) {
                    Vector<Object> row = new Vector<>();
                    row.add(resultSet.getObject("id"));
                    row.add(resultSet.getObject("username"));
                    row.add(resultSet.getObject("email"));
                    row.add(resultSet.getObject("password"));
                    row.add(resultSet.getObject("gender"));
                    data.add(row);
                }
            }
        }

        return data;
    

    }//GEN-LAST:event_update_userActionPerformed

    private void search_user_in_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_user_in_dbActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_search_user_in_dbActionPerformed

    private void add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_userActionPerformed
        // TODO add your handling code here:
         RegistrationForm registrationForm = new RegistrationForm();

    // Make the Registration form visible
    registrationForm.setVisible(true);

    // Close the current form (optional)
    this.dispose();
    
    }//GEN-LAST:event_add_userActionPerformed
 private void loadData() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            // Your database connection code
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rapitgt_db", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, username, email, password, gender FROM registration_table");

            // Iterate through the result set and add data to the table
            while (rs.next()) {
              int id = rs.getInt("id");
                String name = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String gender = rs.getString("gender");

                model.addRow(new Object[]{id,name, email, password, gender});
            }

            // Close the connection
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
          
    }

   


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
            java.util.logging.Logger.getLogger(UserTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserTable().setVisible(true);
            }
        });
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_user;
    private javax.swing.JButton delete_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search_user_in_db;
    private javax.swing.JButton update_user;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
