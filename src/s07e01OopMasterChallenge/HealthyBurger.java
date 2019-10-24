package s07e01OopMasterChallenge;

public class HealthyBurger extends Hamburger {
    private boolean cucumber;
    private boolean egg;
    private double cucumberPrice = 0.35;
    private double eggPrice = 0.45;

    public HealthyBurger(String meat) {
        super("Brown rye bread roll", meat);
        setName("Healthy Burger");
        setBasePrice(3.0);
    }

    @Override
    public double getFullPrice() {
        double fullPrice = super.getFullPrice();

        if (cucumber) fullPrice += cucumberPrice;
        if (egg) fullPrice += eggPrice;

        return fullPrice;
    }

    @Override
    public void getBurgerInfo() {
        super.getBurgerInfo();
        if (cucumber) System.out.println("cucumber (" + getCucumberPrice() + " $)");
        if (egg) System.out.println("egg (" + getEggPrice() + " $)");
    }

    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public double getEggPrice() {
        return eggPrice;
    }

    public void addCucumber() {
        cucumber = true;
    }

    public void addEgg(){
        egg = true;
    }
}
