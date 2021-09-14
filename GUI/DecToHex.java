//Name: Trevor Klar
//Date: 12-7-18
//Application: GUI
//Purpose: This is a dialog for the DecToHex method.

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

class DecToHex extends JInternalFrame {
   private static DecToHex instance = null;
   private JTextField tf;
   private JButton btn;
   private JLabel lbl, lbl2;
   private JPanel upperPanel, lowerPanel;
   // Change these when porting this class for another purpose
   //Search for: TITLE_TEXT
   //Search for: BUTTON_TEXT = "Calculate";
   //Search for: STARTING_TEXT = "Enter Your Weight";
   final private String LABEL1 = "Hex: "; // BOTTOM_TEXT_1

   //THE FUNCTION TO DO STUFF
   private String calculateDecToHex(String input) {
       String result = Integer.toHexString(Integer.parseInt(input));
       return (result);
   }

   public static DecToHex getInstance() {
      if(instance == null) {
         instance = new DecToHex();
      }
      return instance;
   }

   private void buttonAction() {
      Double input = 0.0;
      lbl.setText(LABEL1);
      lbl2.setText("");
      try {
         lbl2.setText(calculateDecToHex(tf.getText()));
      }
      catch(Exception e) {
         JOptionPane.showMessageDialog(this, "Bad input! Try again.");
      }
   } // end buttonAction

   // private constructor
   private DecToHex() {
      // call constructor of JInternalFrame
      // Arguments: title, resizability, closability,
      //               maximizability, and iconifiability
      super("Decimal to Hex", false, true, false, false);

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

      setBounds(25, 25, 250, 120);
      setLocation(140, 140);
      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

   } // end private constructor

} // end class DecToHex
