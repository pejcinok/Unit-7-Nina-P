public abstract class Quadrilateral {

    public static final int NUM_SIDES= 4;
    public static final int INTERIOR_ANGLE_SUM = 360;
    private int[] sides;
    private int[] angles;

    public Quadrilateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;

    }
    public int getSides(int index){
        return sides[index];
    }
    public int calculatePerimeter(){
        int perimeter =0;
        for (int n : sides){
            perimeter+= n;
        }
        return perimeter;
    }

    public abstract double calculateArea();

    public String toString(){
        String result = "Quadrilateral: ";
        for (int n :sides){
            result += n + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        int [] sides = {3, 4, 5, 6};
        int [] angles = {90, 90, 80, 100};
    }
}
