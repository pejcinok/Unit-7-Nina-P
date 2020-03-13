public class Zucchini extends Vegetable implements Growable {

    private boolean doesCreep;
    private boolean feed;
    private boolean water;
    private boolean harvest;

    public Zucchini() {
        super("Zucchini", "gourd");
        super.setInstructions("Plant seeds about 1-inch deep and 2 to 3 feet apart in a traditional garden bed.\n" +
                "Harvest in the summertime. ");
        feed = false;
        water = false;
        harvest = false;
    }



    public Zucchini(boolean doesCreep, boolean feed, boolean water, boolean harvest) {
        super("Zucchini", "gourd");
        this.doesCreep = doesCreep;
        this.feed = feed;
        this.water = water;
        this.harvest = harvest;
    }

    public String feed() {
         feed = true;
            return "Your zucchini was fed!";


    }

    public String water() {
        water = true;
            return "Your zucchini was watered!";
        }



    public String harvest() {
      harvest = true;
            return "your zucchini is harvested!";

    }


    public String toString() {
        String result = "";
        result += "Zucchini Fed?: " +feed + " Zucchini watered?: " + water + " Zucchini harvested?: " + harvest;
        return result;
    }
}