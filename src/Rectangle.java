public class Rectangle extends Quadrilateral {

    public static final int[] RECT_ANGLES = {90, 90, 90, 90};

    public Rectangle (int s1, int s2){
        super( new int[]{s1, s1, s2, s2}, RECT_ANGLES);
    }

    public double calculateArea(){
        return getSides(0) * getSides(3);
    }
    public String toString(){
        return super.toString() + "[Rectangle]";
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println(r);
        System.out.println("Perimeter " +  r.calculatePerimeter());
        System.out.println("Area " + r. calculateArea());
    }

}