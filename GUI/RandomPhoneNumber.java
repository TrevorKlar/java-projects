//Name: Trevor Klar
//Date: 12-7-18
//Application: GUI
//Purpose: This is a dialog for the RandomPhoneNumber method.

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

class RandomPhoneNumber extends JInternalFrame {
   private static RandomPhoneNumber instance = null;
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
   private String calculateRandomPhoneNumber(String input) {
       String areaCode = "(" + Integer.parseInt(input) + ") ";
       String part1 = "";
       int randomNum;
       for (int i=0; i<3; i++) {
           randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1); //0 to 9
           part1 += Integer.toString(randomNum);
       }
       part1 += "-";
       String part2 = "";
       for (int i=0; i<4; i++) {
           randomNum = ThreadLocalRandom.current().nextInt(0, 9 + 1); //0 to 9
           part2 += Integer.toString(randomNum);
       }
       String result = "" + areaCode + part1 + part2;
       return (result);
   }

   public static RandomPhoneNumber getInstance() {
      if(instance == null) {
         instance = new RandomPhoneNumber();
      }
      return instance;
   }

   private void buttonAction() {
      Double input = 0.0;
      lbl.setText(LABEL1);
      lbl2.setText("");
      try {
         lbl2.setText(calculateRandomPhoneNumber(tf.getText()));
      }
      catch(Exception e) {
         JOptionPane.showMessageDialog(this, "Bad input! Try again.");
      }
   } // end buttonAction

   // private constructor
   private RandomPhoneNumber() {
      // call constructor of JInternalFrame
      // Arguments: title, resizability, closability,
      //               maximizability, and iconifiability
      super("Phone Number Generator", false, true, false, false);

      tf = new JTextField(10);
      btn = new JButton("generate");
      lbl = new JLabel("");
      lbl2 = new JLabel("Enter area code");
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
      setLocation(170, 170);
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

   } // end private constructor

} // end class RandomPhoneNumber
