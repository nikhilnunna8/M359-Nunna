package MarvelEx;

public class Power {
    String name;
    int strength;
    public Power(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
