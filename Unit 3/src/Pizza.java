public class Pizza {
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    public Pizza(String str, int length, int toppings, boolean deepDish){
        store = str;
        inches = length;
        numToppings = toppings;
        isDeepDish = deepDish;
    }
    public Pizza(String str, int length, boolean deepDish){
        store = str;
        inches = length;
        numToppings = 0;
        isDeepDish = deepDish;
    }


    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    public boolean equals(Pizza za){
        if (inches == za.getInches()){
            if (numToppings == za.getNumToppings()){
                if(isDeepDish == za.isDeepDish()){
                    return true;
                }
            }
        }
        return false;
    }
    public String toString(){
        String output = "";

        output += "\nStore name: " + store;
        output += "\nSize of Pizza: " + inches;
        output += "\nNumber of Toppings: " + numToppings;
        output += "\nIs Deep Dish: " + isDeepDish;
        if (isDeepDish){
            output += "\nThis is a deep dish pizza!!!!!!";
        }
        else{
            output += "\nThis is not a deep dish pizza.";
        }
        return output;
    }
}
