/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Friends;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniel
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    public Formulario() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Number");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreate)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRead)
                                .addComponent(btnClear))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnExit)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnDelete))))
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        try {
 
            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = String.valueOf(txtName.getText());
 
            // Get the number to be updated
            // from the Command line argument
            long newNumber = Long.parseLong(txtNumber.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\Daniel\\Desktop\\FINALES\\POO\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name == newName
                    || number == newNumber) {
                    found = true;
                    break;
                }
            }
 
            if (found == false) {
 
                // Enter the if block when a record
                // is not already present in the file.
                nameNumberString
                    = newName + "!"
                      + String.valueOf(newNumber);
 
                // writeBytes function to write a string
                // as a sequence of bytes.
                raf.writeBytes(nameNumberString);
 
                // To insert the next record in new line.
                raf.writeBytes(System.lineSeparator());
 
                // Print the message
                JOptionPane.showMessageDialog(null, " The friend " + newName+" added. ");
                //System.out.println(" The friend " + newName+" added. ");
 
                // Closing the resources.
                raf.close();
            }
            // The contact to be updated
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                System.out.println(" Input name"
                                   + " does not exists. ");
            }
        }
 
        catch (IOException ioe) {
 
            System.out.println(ioe);
        }
        catch (NumberFormatException nef) {
 
            System.out.println(nef);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    {
 
        try {
 
            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = String.valueOf(txtName.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\Daniel\\Desktop\\FINALES\\POO\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name.equals(newName)) {
                    found = true;
                    break;
                }
            }
 
            // Delete the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()
                       < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    // Check if the fetched contact
                    // is the one to be deleted
                    if (name.equals(newName)) {
 
                        // Skip inserting this contact
                        // into the temporary file
                        continue;
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 
                // The contact has been deleted now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                JOptionPane.showMessageDialog(null,"Friend deleted");
            }
 
            // The contact to be deleted
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                JOptionPane.showMessageDialog(null,"Friend does not exist");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
    }    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtNumber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
    try {
 
            String nameNumberString;
            String name;
            String newName = String.valueOf(txtName.getText());
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\Daniel\\Desktop\\FINALES\\POO\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
 
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Traversing the file
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // Print the contact data
                if (name.equals(newName)){
                    txtName.setText(name);
                    txtNumber.setText(Long.toString(number));
                //System.out.println(
                    //"Friend Name: " + name + "\n"
                    //+ "Contact Number: " + number + "\n");
                found = true;
                }
            }
         }
        catch (IOException ioe)
            {
 
                System.out.println(ioe);
            }
        catch (NumberFormatException nef)
            {
 
                System.out.println(nef);
            }
    
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
 
            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = String.valueOf(txtName.getText());
 
            // Get the number to be updated
            // from the Command line argument
            long newNumber = Long.parseLong(txtNumber.getText());
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("C:\\Users\\Daniel\\Desktop\\FINALES\\POO\\friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name
            // of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name.equals(newName)
                    || number == newNumber) {
                    found = true;
                    break;
                }
            }
 
            // Update the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()
                       < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    // Check if the fetched contact
                    // is the one to be updated
                    if (name.equals(newName)) {
 
                        // Update the number of this contact
                        nameNumberString
                            = name + "!"
                              + String.valueOf(newNumber);
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 
                // The contact has been updated now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                JOptionPane.showMessageDialog(null,"Friend updated");
            }
 
            // The contact to be updated
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                JOptionPane.showMessageDialog(null,"That friend does not exist");
            }
        }
 
        catch (IOException ioe) {
            System.out.println(ioe);
        }
 
        catch (NumberFormatException nef) {
            System.out.println(nef);
        }    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
