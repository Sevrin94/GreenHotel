package HotelGreenest;

public abstract class Plantor{
    //Inkapsling private nås bara inom klassen
    private String namn;
    private double längd;
    // Inkapsling protected nås av alla subklasser
    protected String typ;

    public Plantor(double längd, String namn) {
        this.längd = längd;
        this.namn = namn;
    }
    public String getNamn() {
        return namn;
    }
    public double getLängd() {
        return längd;
    }

    @Override
    public String toString() {
        return "namn " + namn + "\nlängd " + längd;
    }
}
