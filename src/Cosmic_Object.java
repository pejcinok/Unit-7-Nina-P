public abstract class Cosmic_Object {
    private int size;
    private int radiation;

    public Cosmic_Object(int size, int radiation){
        this.size = size;
        this.radiation = radiation;

    }

    public abstract int calculateSize();

    public int getRadiation(){
        return radiation;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        String result = "";
        result +="size: " + calculateSize() + " \n This object radiates on a scale of 1-10:  " + radiation + "\n";
        return result;
    }
}
