//Name: Trevor Klar
//Date: 12-7-18
//Application: GUI
//Purpose: This is a dialog for the DecToBin method.

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

class DecToBin extends JInternalFrame {
   private static DecToBin instance = null;
   private JTextField tf;
   private JButton btn;
   private JLabel lbl, lbl2;
   private JPanel upperPanel, lowerPanel;
   // Change these when porting this class for another purpose
   //Search for: TITLE_TEXT = "Weight on Moon"
   //Search for: BUTTON_TEXT = "Calculate";
   //Search for: STARTING_TEXT = "Enter Your Weight";
   final private String LABEL1 = "Binary: "; // BOTTOM_TEXT_1

   //THE FUNCTION TO DO STUFF // check that it takes String and returns String
   public String calculateDecToBin(String input) {
     int userInput = Integer.parseInt(input);
     return String.format("%32s", Integer.toBinaryString(userInput)).replace(' ', '0');
   } // end calculateDecToBin

   public static DecToBin getInstance() {
      if(instance == null) {
         instance = new DecToBin();
      }
      return instance;
   }

   private void buttonAction() {
      Double input = 0.0;
      lbl.setText(LABEL1);
      lbl2.setText("");
      try {
         String labelText = calculateDecToBin(tf.getText());
         System.out.print("Debug: " + labelText + "\n");
         lbl2.setText(labelText);
      }
      catch(Exception e) {
         JOptionPane.showMessageDialog(this, "Bad input! Try again.");
      }
   } // end buttonAction

   // private constructor
   private DecToBin() {
      // call constructor of JInternalFrame
      // Arguments: title, resizability, closability,
      //               maximizability, and iconifiability
      super("Decimal to Binary", false, true, false, false);

      tf = new JTextField(10);
      btn = new JButton("Calculate");
      lbl = new JLabel("");
      lbl2 = new JLabel("Enter a number");
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

      setBounds(25, 25, 350, 120);
      setLocation(130, 130);
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

   } // end private constructor

} // end class DecToBin
