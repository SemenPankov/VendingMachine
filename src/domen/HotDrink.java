package domen;

public class HotDrink extends Prodyct{
    private int temperature;

    public HotDrink(long id, String name, double prise, int place, int temperature) {
        super(id, name, prise, place);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString() + "temperature=" + temperature + "]";
    }

}
