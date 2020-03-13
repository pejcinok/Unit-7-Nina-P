public class Tomato extends Vegetable{
    private int size;
    private boolean feed;
    private boolean water;
    private boolean harvest;

    public Tomato() {
        super("Tomato", "fruit?");
        super.setInstructions("Plant seeds ain individual pots and keep in sun for 6-8 hours a day. Ready for harvest when red but still firm. ");
        feed = false;
        water = false;
        harvest = false;
    }



    public Tomato(boolean harvest, boolean feed, boolean water, int size) {
        super("tomato", "fruit?");
        this.size = size;
        this.feed = feed;
        this.water = water;
        this.harvest = harvest;
    }

    public String feed() {
       feed = true;
            return "Your tomato was fed!";
        }


    public String water() {
        water = true;
            return "Your tomato was watered!";
        }

    public String harvest() {
        harvest = true;
            return "your tomato is harvested!";
        }



    public String toString() {
        String result = "";
        result += "tomato Fed?: " + feed + " Tomato watered?: " + water + " Tomato harvested?: " + harvest;
        return result;
    }
}
