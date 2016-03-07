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

import java.util.*;
import javax.swing.table.DefaultTableModel;

public class ConsumerShowAppts extends javax.swing.JFrame {
    
    /**
     * Creates new form ContactEditor
     */
    public ConsumerShowAppts() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jConsumerApptsScrollPane = new javax.swing.JScrollPane();
        jConsumerApptsTable = new javax.swing.JTable();
        jConsumerApptsCloseButton = new javax.swing.JButton();
        jConsumerApptsPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cancelling Appointment(s)");

        jConsumerApptsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Business Name", "Date", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jConsumerApptsScrollPane.setViewportView(jConsumerApptsTable);
        if (jConsumerApptsTable.getColumnModel().getColumnCount() > 0) {
            jConsumerApptsTable.getColumnModel().getColumn(0).setResizable(false);
            jConsumerApptsTable.getColumnModel().getColumn(1).setResizable(false);
            jConsumerApptsTable.getColumnModel().getColumn(3).setResizable(false);
        }
        jConsumerApptsTable.getSelectionModel().addListSelectionListener( new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                apptSelected(evt);
            }
        });

        jConsumerApptsCloseButton.setText("Close");
        jConsumerApptsCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsumerApptsCloseButtonActionPerformed(evt);
            }
        });

        jConsumerApptsPrompt.setText("Your appointments are shown below. Please select the one you would like to cancel.");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jConsumerApptsPrompt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jConsumerApptsCloseButton)
                            .add(jConsumerApptsScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(jConsumerApptsPrompt)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 34, Short.MAX_VALUE)
                .add(jConsumerApptsScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jConsumerApptsCloseButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsumerApptsCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsumerApptsCloseButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jConsumerApptsCloseButtonActionPerformed
    
    void populateApptsTable( HashSet<String> apptList )
    {
        DefaultTableModel model = (DefaultTableModel) jConsumerApptsTable.getModel();
        model.setRowCount(0);
        
        apptLocationInTable = new HashMap<Integer,String>();
        Iterator apptIter = apptList.iterator();
        int index = 0;
        while( apptIter.hasNext() )
        {
            String appt = (String) apptIter.next();
            String businessName = appt.substring(0, appt.indexOf(' '));
            appt = appt.substring(appt.indexOf(' ')+1, appt.length());
            String date = appt.substring(0, appt.indexOf(' '));
            appt = appt.substring(appt.indexOf(' ')+1, appt.length());
            String startTime = appt.substring(0, appt.indexOf(' '));
            appt = appt.substring(appt.indexOf(' ')+1, appt.length());
            String endTime = appt.substring(0, appt.indexOf(' '));
            String apptId = appt.substring(appt.indexOf(' ')+1,appt.length());
            model.addRow( new Object[] {businessName,date,startTime,endTime} );
            apptLocationInTable.put(index, apptId);
            ++index;
        }
    }
    
    private void apptSelected(javax.swing.event.ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting() & (jConsumerApptsTable.getSelectedRow() > -1)) {
            int selectedRow = jConsumerApptsTable.getSelectedRow();
            String apptId = apptLocationInTable.get(selectedRow);
            System.out.println("You would like to cancel appointment: " + apptId);
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsumerShowAppts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumerShowAppts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumerShowAppts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumerShowAppts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumerShowAppts().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jConsumerApptsCloseButton;
    private javax.swing.JLabel jConsumerApptsPrompt;
    private javax.swing.JScrollPane jConsumerApptsScrollPane;
    private javax.swing.JTable jConsumerApptsTable;
    // End of variables declaration//GEN-END:variables
    
    //static HashSet<String> apptList;
    HashMap<Integer,String> apptLocationInTable;
    
}
