package HotelGreenest;

public class Palm extends Plantor implements PlantInterface {
    public Palm(double längd, String namn) {
        super(längd, namn);
        typ = "Palmen";
    }
// Taget från interface
    @Override
    public double räknaVätskeMängd() {
        double bas = 0.5;
        double längd = getLängd();
        double resultat = bas * längd;
        return resultat;
    }
    // Polymorfism
    public String toString() {
        double mängd = räknaVätskeMängd();
        String namn = getNamn();
        return typ + " " + namn + "\nska få " + mängd + " liter kranvatten";
    }
}
