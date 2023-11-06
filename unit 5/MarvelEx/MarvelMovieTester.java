package MarvelEx;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power spideyPower = new Power("Spidey Sense", 7);
        Power superBrain = new Power("Super Smarts", 9);
        System.out.println("Number of heroes: " + MarvelCharacter.getNumHeroes());
        System.out.println("Number of heroes: " + MarvelCharacter.getNumVillains());
        MarvelCharacter brainiac = new MarvelCharacter("Brainiac", superBrain, false);
        MarvelCharacter spiderman = new MarvelCharacter("Spiderman", spideyPower, true);
        System.out.println("Number of heroes: " + MarvelCharacter.getNumHeroes());
        System.out.println("Number of heroes: " + MarvelCharacter.getNumVillains());
        System.out.println(spiderman);
        System.out.println(brainiac);
        System.out.println();
        battle(spiderman, brainiac);
    }
    public static void battle(MarvelCharacter char1, MarvelCharacter char2){
        int numDamage1 = (int)(Math.random() * char1.getSpecialPower().getStrength()+1);
        int numDamage2 = (int)(Math.random() * char2.getSpecialPower().getStrength()+1);

        char1.setHealth(char1.getHealth() - numDamage2);
        char2.setHealth(char2.getHealth() - numDamage1);

        System.out.println(char1.getName() + " Health: " + char1.getHealth());
        System.out.println(char2.getName() + " Health: " + char2.getHealth());
    }
}
