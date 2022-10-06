package HotelGreenest;

public class Köttätare extends Plantor implements PlantInterface {
    public Köttätare(double längd, String namn) {
        super(längd, namn);
        typ = "Köttätaren";
    }
// Taget från interface
    @Override
    public double räknaVätskeMängd() {
        double bas = 0.1;
        double bas2 = 0.2;
        double längd = getLängd();
        double resultat = bas2 * längd + bas;
        return resultat;
    }
    // Polymorfism
    public String toString() {
        double mängd = räknaVätskeMängd();
        String namn = getNamn();
        return typ + " " + namn + "\nska få " + mängd + " liter proteindryck";
    }
}
