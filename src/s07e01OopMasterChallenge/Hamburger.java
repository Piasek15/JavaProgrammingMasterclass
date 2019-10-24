package s07e01OopMasterChallenge;

public class Hamburger {
    private String name;
    private String beadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean bacon;
    private double basePrice;
    private double lettucePrice = 0.2;
    private double tomatoPrice = 0.3;
    private double cheesePrice = 0.7;
    private double baconPrice = 1.2;

    public Hamburger(String beadRoll, String meat) {
        this.name = "Classic Burger";
        this.basePrice = 2.0;
        this.beadRoll = beadRoll;
        this.meat = meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getFullPrice(){
        double fullPrice = basePrice;

        if (lettuce) fullPrice += lettucePrice;
        if (tomato) fullPrice += tomatoPrice;
        if (cheese) fullPrice += cheesePrice;
        if (bacon) fullPrice += baconPrice;

        return fullPrice;
    }

    public void getBurgerInfo(){
        System.out.println(getName() + " with " + getBeadRoll() + " and " + getMeat() + "(" + getBasePrice() + " $)");
        System.out.println("Additionals:");
        if (lettuce) System.out.println("lettuce (" + getLettucePrice() + " $)");
        if (tomato) System.out.println("tomato (" + getTomatoPrice() + " $)");
        if (cheese) System.out.println("cheese (" + getCheesePrice() + " $)");
        if (bacon) System.out.println("bacon (" + getBaconPrice() + " $)");
    }

    public void addLettuce() {
        lettuce = true;
    }

    public void addTomato() {
        tomato = true;
    }

    public void addCheese() {
        cheese = true;
    }

    public void addBacon() {
        bacon = true;
    }

    public String getName() {
        return name;
    }

    public String getBeadRoll() {
        return beadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isBacon() {
        return bacon;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getBaconPrice() {
        return baconPrice;
    }
}
