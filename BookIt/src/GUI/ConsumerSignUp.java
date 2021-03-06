/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package GUI;

import Consumer.Consumer;

public class ConsumerSignUp extends javax.swing.JFrame {
    
    /**
     * Creates new form ContactEditor
     */
    public ConsumerSignUp() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jConsumerFirstLabel = new javax.swing.JLabel();
        jConsumerLastLabel = new javax.swing.JLabel();
        jConsumerLastField = new javax.swing.JTextField();
        jConsumerUsernameLabel = new javax.swing.JLabel();
        jConsumerUsernameField = new javax.swing.JTextField();
        jConsumerPasswordLabel = new javax.swing.JLabel();
        jConsumerPasswordField = new javax.swing.JTextField();
        jConsumerPhoneField = new javax.swing.JTextField();
        jConsumerPhoneLabel = new javax.swing.JLabel();
        jConsumerEmailLabel = new javax.swing.JLabel();
        jConsumerAddressLabel = new javax.swing.JLabel();
        jConsumerAddressField = new javax.swing.JTextField();
        jConsumerFirstField = new javax.swing.JTextField();
        jConsumerEmailField = new javax.swing.JTextField();
        jConsumerOkButton = new javax.swing.JButton();
        jConsumerCancelButton = new javax.swing.JButton();
        jConsumerSignUpPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consumer Sign-up");

        jConsumerFirstLabel.setText("First name:");

        jConsumerLastLabel.setText("Last name:");

        jConsumerLastField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsumerLastFieldActionPerformed(evt);
            }
        });

        jConsumerUsernameLabel.setText("Username:");

        jConsumerUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsumerUsernameFieldActionPerformed(evt);
            }
        });

        jConsumerPasswordLabel.setText("Password:");

        jConsumerPhoneLabel.setText("Phone:");

        jConsumerEmailLabel.setText("Email:");

        jConsumerAddressLabel.setText("Address:");

        jConsumerOkButton.setText("OK");
        jConsumerOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsumerOkButtonActionPerformed(evt);
            }
        });

        jConsumerCancelButton.setText("Cancel");
        jConsumerCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsumerCancelButtonActionPerformed(evt);
            }
        });

        jConsumerSignUpPrompt.setText("Please provide your information below to sign up:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(61, 61, 61)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(jConsumerOkButton)
                        .add(18, 18, 18)
                        .add(jConsumerCancelButton))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(layout.createSequentialGroup()
                            .add(jConsumerEmailLabel)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jConsumerEmailField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(37, 37, 37)
                            .add(jConsumerPhoneLabel)
                            .add(18, 18, 18)
                            .add(jConsumerPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(jConsumerAddressLabel)
                            .add(18, 18, 18)
                            .add(jConsumerAddressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 341, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jConsumerSignUpPrompt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 413, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(jConsumerUsernameLabel)
                                    .add(18, 18, 18)
                                    .add(jConsumerUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jConsumerFirstLabel)
                                    .add(18, 18, 18)
                                    .add(jConsumerFirstField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(18, 18, 18)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(jConsumerPasswordLabel)
                                    .add(18, 18, 18)
                                    .add(jConsumerPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                    .add(jConsumerLastLabel)
                                    .add(18, 18, 18)
                                    .add(jConsumerLastField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 126, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .add(jConsumerSignUpPrompt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jConsumerUsernameLabel)
                    .add(jConsumerUsernameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jConsumerPasswordLabel)
                    .add(jConsumerPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jConsumerFirstLabel)
                    .add(jConsumerLastLabel)
                    .add(jConsumerLastField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jConsumerFirstField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jConsumerEmailLabel)
                    .add(jConsumerPhoneLabel)
                    .add(jConsumerPhoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jConsumerEmailField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jConsumerAddressLabel)
                    .add(jConsumerAddressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(26, 26, 26)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jConsumerOkButton)
                    .add(jConsumerCancelButton))
                .add(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsumerOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsumerOkButtonActionPerformed
        String firstName = jConsumerFirstField.getText();
        String lastName = jConsumerLastField.getText();
        String username = jConsumerUsernameField.getText();
        String password = jConsumerPasswordField.getText();
        String address = jConsumerAddressField.getText();
        String email = jConsumerEmailField.getText();
        String phone = jConsumerPhoneField.getText();
        System.out.println(firstName + " " + lastName + " " + username + " " + password + " " + address
            + " " + email + " " + phone);
        String str = (firstName + " " + lastName + " " + username + " " + password + " " + address
                + " " + phone + " " + email);
        Consumer c = new Consumer();
        c.addSignupDetails(str);
        jConsumerSignUpPrompt.setText("Information registered. You can now log in.");
    }//GEN-LAST:event_jConsumerOkButtonActionPerformed

    private void jConsumerUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsumerUsernameFieldActionPerformed
    }//GEN-LAST:event_jConsumerUsernameFieldActionPerformed

    private void jConsumerLastFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsumerLastFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsumerLastFieldActionPerformed

    private void jConsumerCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsumerCancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jConsumerCancelButtonActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsumerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumerSignUp().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jConsumerAddressField;
    private javax.swing.JLabel jConsumerAddressLabel;
    private javax.swing.JButton jConsumerCancelButton;
    private javax.swing.JTextField jConsumerEmailField;
    private javax.swing.JLabel jConsumerEmailLabel;
    private javax.swing.JTextField jConsumerFirstField;
    private javax.swing.JLabel jConsumerFirstLabel;
    private javax.swing.JTextField jConsumerLastField;
    private javax.swing.JLabel jConsumerLastLabel;
    private javax.swing.JButton jConsumerOkButton;
    private javax.swing.JTextField jConsumerPasswordField;
    private javax.swing.JLabel jConsumerPasswordLabel;
    private javax.swing.JTextField jConsumerPhoneField;
    private javax.swing.JLabel jConsumerPhoneLabel;
    private javax.swing.JLabel jConsumerSignUpPrompt;
    private javax.swing.JTextField jConsumerUsernameField;
    private javax.swing.JLabel jConsumerUsernameLabel;
    // End of variables declaration//GEN-END:variables
    
}
