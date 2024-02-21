package domen;

public class Prodyct {
    private long id;
    private String name;
    private double prise;
    private int place;
    
    public Prodyct(long id, String name, double prise, int place) {
        this.id = id;
        this.name = name;
        this.prise = prise;
        this.place = place;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrise() {
        return prise;
    }
    public void setPrise(double prise) {
        this.prise = prise;
    }
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    @Override
    public String toString() {
        return "Prodyct [id=" + id + ", name=" + name + ", prise=" + prise + ", place=" + place + "]";
    }
}