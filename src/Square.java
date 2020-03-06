public class Square extends Rectangle {


    public Square(int side){
        super (side, side);
    }

    public String toString(){
        return super.toString() + "[Square]";
    }

    public static void main(String[] args) {
        Quadrilateral[] shapes = {new Rectangle(4, 9), new Square (6)};
        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());

    }

}
