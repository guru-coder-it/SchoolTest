/**
 * @author guru-coder-it
 * @version 1.0
 */

package school_test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class School_Test_JFrame extends javax.swing.JFrame {

    public static final String DEFAULT_TITULE = "School Test"; // name window
    public static final int DEFAULT_WIDTH = 600; // width window
    public static final int DEFAULT_HEIGHT = 270;// height window
    public static final int DEFAULT_POSITION_X = 100;// position window Х 
    public static final int DEFAULT_POSITION_Y = 100;// position window Y 
    public static int NumberQuestion = 0; // number of the question
    public static int NumberString = 0; // number of the line
    public static int Estimation = 0; // estimation
    public static String[] StringFile;    // array of the questions and answer
    public static String CorrectAnswer = "";    // correct answer
    public static int PercentAnswer = 0;    // % on one question
    public static int PercentAnswers = 0;    // % on all questions

    public School_Test_JFrame() {
        initComponents();
    
    // name window   
    setTitle(DEFAULT_TITULE);
    // position window    
    setBounds(DEFAULT_POSITION_X,
              DEFAULT_POSITION_Y,
              DEFAULT_WIDTH, DEFAULT_HEIGHT);
    // forbid to change sizes a window
    setResizable(false);
    // text for button
    jButton1.setText("Confirm");
       
    NumberString = 0; // number of the line  
    StringFile = new String[1000]; // initialize array
    // read file in array    
    try 
    {
         File file = new File("TestFile.txt");
         FileReader reader = new FileReader(file);
         BufferedReader in = new BufferedReader(reader);
         String string;
         while ((string = in.readLine()) != null) {
           StringFile[NumberString] = string.toString();
           ++NumberString;
    }
         in.close();
    } catch (IOException e) 
    {
         e.printStackTrace();
    }
        jLabel1.setText(StringFile[0]);
        jRadioButton1.setText(StringFile[1]);
        jRadioButton2.setText(StringFile[2]);
        jRadioButton3.setText(StringFile[3]);
        jRadioButton4.setText(StringFile[4]);
        jLabel5.setText(""+(NumberString/6));   // amount of the questions
        jLabel6.setText(""+NumberQuestion);     // amount correct answer     
        jLabel7.setText(""+Estimation);         // estimation
        PercentAnswer = 100/(NumberString/6);   // % on one question
        PercentAnswers = PercentAnswer;         // % on all questions
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.blue);
        jLabel1.setText("jLabel1");

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1(evt);
            }
        });

        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2(evt);
            }
        });

        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3(evt);
            }
        });

        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1(evt);
            }
        });

        jLabel2.setText("Amount of the questions: ");

        jLabel3.setText("Correct answer:");

        jLabel4.setText("Estimation:");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jRadioButton1.getAccessibleContext().setAccessibleDescription("");

        jLabel8.setText("T E S T I N G     IS    T E R M I N A T E D !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1
        // REMOVE CHOICE WITH ALL SWITCHES EXCEPT 1
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        CorrectAnswer = "1"; 
    }//GEN-LAST:event_jRadioButton1

    private void jRadioButton2(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2
        // REMOVE CHOICE WITH ALL SWITCHES EXCEPT 2
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        CorrectAnswer = "2"; 
    }//GEN-LAST:event_jRadioButton2

    private void jRadioButton3(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3
        // REMOVE CHOICE WITH ALL SWITCHES EXCEPT 3
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
        CorrectAnswer = "3"; 
    }//GEN-LAST:event_jRadioButton3

    private void jRadioButton4(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4
        // REMOVE CHOICE WITH ALL SWITCHES EXCEPT 4
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        CorrectAnswer = "4"; 
    }//GEN-LAST:event_jRadioButton4

    private void jButton1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1
        // REMOVE CHOICE WITH ALL SWITCHES
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        // Change the question, determination of the correct answer
        // the calculation %-that correct answer and etc.
        if(NumberQuestion < (NumberString-6))
        {
        NumberQuestion+=6;
        jLabel1.setText(StringFile[NumberQuestion]);
        jRadioButton1.setText(StringFile[NumberQuestion+1]);
        jRadioButton2.setText(StringFile[NumberQuestion+2]);
        jRadioButton3.setText(StringFile[NumberQuestion+3]);
        jRadioButton4.setText(StringFile[NumberQuestion+4]);
        
        if(StringFile[NumberQuestion-1].equals(CorrectAnswer))
        {
            ++Estimation;
            jLabel6.setText(""+Estimation);  // amount correct answer
            jLabel7.setText(""+PercentAnswers+"%");  // amount correct answer
            PercentAnswers = PercentAnswers + PercentAnswer;
        }
        }  
        else
        {
            NumberQuestion+=6;
            jLabel1.setText(StringFile[NumberQuestion]);
            jRadioButton1.setText(StringFile[NumberQuestion+1]);
            jRadioButton2.setText(StringFile[NumberQuestion+2]);
            jRadioButton3.setText(StringFile[NumberQuestion+3]);
            jRadioButton4.setText(StringFile[NumberQuestion+4]);
            if(Estimation != 0){++Estimation;}
            jLabel6.setText(""+Estimation);  // amount correct answer
            if(Estimation == 0){PercentAnswers = PercentAnswers - PercentAnswer;}
            jLabel7.setText(""+PercentAnswers+"%");  // amount correct answer
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            jRadioButton4.setVisible(false);
            jRadioButton4.setVisible(false);
            jButton1.setVisible(false);
            jLabel7.setVisible(true);
        }
    }//GEN-LAST:event_jButton1

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
            java.util.logging.Logger.getLogger(School_Test_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(School_Test_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(School_Test_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(School_Test_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new School_Test_JFrame().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables

}
