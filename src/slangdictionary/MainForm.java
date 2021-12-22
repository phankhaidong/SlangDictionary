/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slangdictionary;

import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {
    
    public void switchPanels(JPanel panel){
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        SearchGroup = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        AddSlangButton = new javax.swing.JButton();
        DeleteSlangButton = new javax.swing.JButton();
        layeredPane = new javax.swing.JLayeredPane();
        AddSlangPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SlangTxtField = new javax.swing.JTextField();
        DefTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddButon = new javax.swing.JButton();
        DeleteSlangPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DeleteTxtField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        EditSlangPanel = new javax.swing.JPanel();
        QuizPanel = new javax.swing.JPanel();
        RandomPanel = new javax.swing.JPanel();
        SearchHistoryPanel = new javax.swing.JPanel();
        ResetButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Search here");

        SearchButton.setText("Search");

        AddSlangButton.setText("Add Slang");
        AddSlangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSlangButtonActionPerformed(evt);
            }
        });

        DeleteSlangButton.setText("Delete Slang");
        DeleteSlangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSlangButtonActionPerformed(evt);
            }
        });

        layeredPane.setLayout(new java.awt.CardLayout());

        AddSlangPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Add new slang word");

        jLabel3.setText("Slang word:");

        jLabel4.setText("Definition:");

        AddButon.setText("Add");

        javax.swing.GroupLayout AddSlangPanelLayout = new javax.swing.GroupLayout(AddSlangPanel);
        AddSlangPanel.setLayout(AddSlangPanelLayout);
        AddSlangPanelLayout.setHorizontalGroup(
            AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSlangPanelLayout.createSequentialGroup()
                .addGroup(AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSlangPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddSlangPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSlangPanelLayout.createSequentialGroup()
                .addGroup(AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddSlangPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButon))
                    .addGroup(AddSlangPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SlangTxtField)
                            .addComponent(DefTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        AddSlangPanelLayout.setVerticalGroup(
            AddSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSlangPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SlangTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DefTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(AddButon)
                .addGap(20, 20, 20))
        );

        layeredPane.add(AddSlangPanel, "card2");

        DeleteSlangPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Delete Slang Word");

        DeleteButton.setText("Delete");

        jLabel5.setText("Slang word to be deleted:");

        javax.swing.GroupLayout DeleteSlangPanelLayout = new javax.swing.GroupLayout(DeleteSlangPanel);
        DeleteSlangPanel.setLayout(DeleteSlangPanelLayout);
        DeleteSlangPanelLayout.setHorizontalGroup(
            DeleteSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteSlangPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(DeleteSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteSlangPanelLayout.createSequentialGroup()
                        .addGroup(DeleteSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DeleteSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DeleteSlangPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(100, 100, 100))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteSlangPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(DeleteButton))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeleteSlangPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        DeleteSlangPanelLayout.setVerticalGroup(
            DeleteSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteSlangPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        layeredPane.add(DeleteSlangPanel, "card3");

        javax.swing.GroupLayout EditSlangPanelLayout = new javax.swing.GroupLayout(EditSlangPanel);
        EditSlangPanel.setLayout(EditSlangPanelLayout);
        EditSlangPanelLayout.setHorizontalGroup(
            EditSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        EditSlangPanelLayout.setVerticalGroup(
            EditSlangPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        layeredPane.add(EditSlangPanel, "card4");

        javax.swing.GroupLayout QuizPanelLayout = new javax.swing.GroupLayout(QuizPanel);
        QuizPanel.setLayout(QuizPanelLayout);
        QuizPanelLayout.setHorizontalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        QuizPanelLayout.setVerticalGroup(
            QuizPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        layeredPane.add(QuizPanel, "card5");

        javax.swing.GroupLayout RandomPanelLayout = new javax.swing.GroupLayout(RandomPanel);
        RandomPanel.setLayout(RandomPanelLayout);
        RandomPanelLayout.setHorizontalGroup(
            RandomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        RandomPanelLayout.setVerticalGroup(
            RandomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        layeredPane.add(RandomPanel, "card6");

        javax.swing.GroupLayout SearchHistoryPanelLayout = new javax.swing.GroupLayout(SearchHistoryPanel);
        SearchHistoryPanel.setLayout(SearchHistoryPanelLayout);
        SearchHistoryPanelLayout.setHorizontalGroup(
            SearchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        SearchHistoryPanelLayout.setVerticalGroup(
            SearchHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        layeredPane.add(SearchHistoryPanel, "card7");

        ResetButton.setText("Reset");

        jButton2.setText("Quiz");

        jButton3.setText("Edit Slang");

        SearchGroup.add(jRadioButton1);
        jRadioButton1.setText("By Definition");

        SearchGroup.add(jRadioButton2);
        jRadioButton2.setText("By Slang");

        jButton4.setText("Random");

        jButton5.setText("Search History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteSlangButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddSlangButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(layeredPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchButton)
                            .addComponent(jRadioButton2))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddSlangButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteSlangButton)
                        .addGap(16, 16, 16)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(ResetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(layeredPane))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSlangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSlangButtonActionPerformed
        switchPanels(AddSlangPanel);
    }//GEN-LAST:event_AddSlangButtonActionPerformed

    private void DeleteSlangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSlangButtonActionPerformed
        switchPanels(DeleteSlangPanel);
    }//GEN-LAST:event_DeleteSlangButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButon;
    private javax.swing.JButton AddSlangButton;
    private javax.swing.JPanel AddSlangPanel;
    private javax.swing.JTextField DefTxtField;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DeleteSlangButton;
    private javax.swing.JPanel DeleteSlangPanel;
    private javax.swing.JTextField DeleteTxtField;
    private javax.swing.JPanel EditSlangPanel;
    private javax.swing.JPanel QuizPanel;
    private javax.swing.JPanel RandomPanel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.ButtonGroup SearchGroup;
    private javax.swing.JPanel SearchHistoryPanel;
    private javax.swing.JTextField SlangTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLayeredPane layeredPane;
    // End of variables declaration//GEN-END:variables
}
