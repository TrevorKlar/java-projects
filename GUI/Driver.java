//Name: Trevor Klar
//Date: 12-7-18
//Application: GUI
//Purpose: Makin a GUI.

import javax.swing.SwingUtilities;

class Driver {
    // main
    public static void main(String[] args) {
        // build and show app using the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUIApp app = new GUIApp();
            }
        });
    } // end main
}
