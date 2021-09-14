//Name: Trevor Klar
//Date: 12-7-18
//Application: GUI
//Purpose: This is a dialog for the PassGen method.

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.concurrent.ThreadLocalRandom;

class PassGen extends JInternalFrame {
   private static PassGen instance = null;
   private JTextField tf;
   private JButton btn;
   private JLabel lbl, lbl2;
   private JPanel upperPanel, lowerPanel;
   // Change these when porting this class for another purpose
   //Search for: TITLE_TEXT
   //Search for: BUTTON_TEXT = "Calculate";
   //Search for: STARTING_TEXT = "Enter Your Weight";
   final private String LABEL1 = "Password: "; // BOTTOM_TEXT_1

   //THE FUNCTION TO DO STUFF
   private String calculatePassGen(String input) {
       int length = Integer.parseInt(input);
       String result = "";
       int randomNum;
       for (int i=0; i<length; i++) {
           randomNum = ThreadLocalRandom.current().nextInt(32, 126 + 1); //32 to 126
           result += (char)randomNum;
       }
       return (result);
   }

   public static PassGen getInstance() {
      if(instance == null) {
         instance = new PassGen();
      }
      return instance;
   }

   private void buttonAction() {
      Double input = 0.0;
      lbl.setText(LABEL1);
      lbl2.setText("");
      try {
         lbl2.setText(calculatePassGen(tf.getText()));
      }
      catch(Exception e) {
         JOptionPane.showMessageDialog(this, "Bad input! Try again.");
      }
   } // end buttonAction

   // private constructor
   private PassGen() {
      // call constructor of JInternalFrame
      // Arguments: title, resizability, closability,
      //               maximizability, and iconifiability
      super("Password Generator", false, true, false, false);

      tf = new JTextField(10);
      btn = new JButton("generate");
      lbl = new JLabel("");
      lbl2 = new JLabel("Enter password length");
      upperPanel = new JPanel();
      lowerPanel = new JPanel();

      upperPanel.setLayout(new FlowLayout());
      upperPanel.setLayout(new FlowLayout());

      upperPanel.add(tf);
      upperPanel.add(btn);

      lowerPanel.add(lbl);
      lowerPanel.add(lbl2);

      add(upperPanel, BorderLayout.NORTH);
      add(lowerPanel, BorderLayout.SOUTH);

      // add button listener
      btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            buttonAction();
         }
      });

      setBounds(25, 25, 250, 120);
      setLocation(160, 160);
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

   } // end private constructor

} // end class PassGen
