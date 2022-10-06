package HotelGreenest;

public class Kaktus extends Plantor implements PlantInterface {
    public Kaktus(double längd, String namn) {
        super(längd, namn);
        typ = "Kaktusen";
    }
// Taget från interface
    @Override
    public double räknaVätskeMängd() {
        double resultat = 0.02;
        return resultat;
    }
    // Polymorfism
    public String toString() {
        double mängd = räknaVätskeMängd();
        String namn = getNamn();
        return typ + " " + namn + "\nska få " + mängd + " liter mineralvatten";
    }
}
