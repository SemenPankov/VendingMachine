package domen;

public class Bottle extends Prodyct {
    private double volume;

    public Bottle(long id, String name, double prise, int place, double volume) {
        super(id, name, prise, place);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle [" + super.toString() + "volume=" + volume + "]";
    }
}
