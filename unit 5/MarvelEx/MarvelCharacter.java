package MarvelEx;
public class MarvelCharacter {
    String name;
    Power specialPower;
    boolean hero;
    private int health;
    private static int numHeroes=0;

    public static int numVillains=0;
    public MarvelCharacter(String name, Power specialPower, boolean hero){
        this.name = name;
        this.specialPower = specialPower;
        this.hero = hero;
        health = 100;
        if(isHero()){
            numHeroes++;
        }else{
            numVillains++;
        }
    }

    public static int getNumHeroes() {
        return numHeroes;
    }

    public static int getNumVillains() {
        return numVillains;
    }

    public Power getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(Power specialPower) {
        this.specialPower = specialPower;
    }
    public boolean isHero() {
        return hero;
    }

    public void setHero(boolean hero) {
        this.hero = hero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public String toString(){
        String output = "";
        output += "Name: " + name + "\n";
        output += "Super Power: " + specialPower.getName() + "\n";
        output += "Public Status: ";

        if (isHero()){
            output+="Hero\n";
        }
        else{
            output+="Villain\n";
        }
        return output;
    }
}

