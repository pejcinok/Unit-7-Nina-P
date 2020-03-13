public class Potato extends Vegetable {

    private int size;
    private boolean feed;
    private boolean water;
    private boolean harvest;

    public Potato() {
        super("potato", "root");
        super.setInstructions("Plant in mid April. Stop watering in mid-August. Harvest 2-3 weeks after that.  ");
        feed = false;
        water = false;
        harvest = false;
    }



    public Potato(boolean harvest, boolean feed, boolean water, int size) {
        super("potato", "root");
        this.size = size;
        this.feed = feed;
        this.water = water;
        this.harvest = harvest;
        this.size = size;
    }

    public String feed() {
        feed = true;
        return "Your potato was fed!";
    }


    public String water() {
        water = true;
        return "Your potato was watered!";
    }

    public String harvest() {
        harvest = true;
        return "your potato is harvested!";
    }



    public String toString() {
        String result = "";
        result += "Potato Fed?: " +feed + " Tomato watered?: " + water + " Tomato harvested?: " + harvest;
        return result;
    }
}
