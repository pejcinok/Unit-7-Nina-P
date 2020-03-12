public class Star extends Cosmic_Object implements Comparable {

    private int radius;
    private String color;


    public Star(int size, int radiation ){
        super(size, radiation);
    }

    public Star(int radius, String color, int radiation){
        super(0, radiation);
        this.radius = radius;
        this.color = color;

}
    public Star(){
        super(0, 0);
        this.radius =0;
        this.color = "red";

    }


    public int getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public int calculateSize(){
        double size = 0.0;
         size = 4/3 *3/14 + Math.pow(3, getRadius());
        int roundSize = (int) size;
        return roundSize;
    }

    public int compareTo(Object otherStar){
         Cosmic_Object obj = (Cosmic_Object) otherStar;

         return (int) this.getSize() - (int) obj.getSize();

        }

        public boolean equals(Cosmic_Object obj){
        return (this.getSize() == obj.getSize() && this.getRadiation() == obj.getRadiation());
        }

        public boolean goSuperNova(){
            return (this.getSize()> 200 && (this.getColor().equals("blue") || this.getColor().equals ("yellow")));
        }

        public String toString(){

        return super.toString() + "does star explode? " + goSuperNova();

        }






}
