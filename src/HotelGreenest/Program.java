package HotelGreenest;

import javax.swing.*;

public class Program {
    Palm laura = new Palm(5,"Laura");
    Palm putte = new Palm(1,"Putte");
    Kaktus igge = new Kaktus(0.02,"Igge");
    Köttätare meatloaf = new Köttätare(0.7,"Meatloaf");

    public void kör() {
        String växt = JOptionPane.showInputDialog("Vilken växt ska få mat?");

        if (växt == null) {
            JOptionPane.showMessageDialog(null,"Raden var tom");

            // Stänger av programmet
            System.exit(0);
        }

        if (växt.equalsIgnoreCase(laura.getNamn())) {
            JOptionPane.showMessageDialog(null,laura.toString());
        }
        else if (växt.equalsIgnoreCase(putte.getNamn())) {
            JOptionPane.showMessageDialog(null, putte.toString());
        }
        else if (växt.equalsIgnoreCase(igge.getNamn())) {
            JOptionPane.showMessageDialog(null, igge.toString());
        }
        else if (växt.equalsIgnoreCase(meatloaf.getNamn())) {
            JOptionPane.showMessageDialog(null, meatloaf.toString());
        }
        else {
            JOptionPane.showMessageDialog(null,"Växten finns inte på hotellet");
        }



    }

}

