public class Sun extends Star implements Comparable{

    private boolean hasPlanets;

    public Sun(int size, int radiation, boolean hasPlanets){
        super(size, radiation);
        this.hasPlanets = hasPlanets;
    }

    public Sun( int radius, String color, int radiation, boolean hasPlanets){
        super(radius, color,  radiation);
        this.hasPlanets = hasPlanets;
    }

    public boolean goSuperNova(){
        return true;
    }

    public boolean getHasPlanets(){
        return hasPlanets;
    }

    public boolean equals(Object obj){
        Sun sun = (Sun) obj;
        return  (this.getHasPlanets() == sun.getHasPlanets() && super.equals(sun));
    }

    public String toString(){
        return super.toString() + "Has Planets? " + hasPlanets;

    }
}
