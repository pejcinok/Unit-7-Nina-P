public abstract class Vegetable implements Growable {

    private String name;
    private String type;
    private String instructions;

    public Vegetable(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String otherName) {
        this.name = otherName;
    }

    public String getInstructions(){
        return instructions;
    }

    protected void setInstructions(String instructions) {
            this.instructions = instructions;
    }
    public abstract String feed();
    public abstract String water();
    public abstract String harvest();

}


