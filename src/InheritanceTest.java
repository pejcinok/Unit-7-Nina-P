public class InheritanceTest {
    public static void main(String[] args) {

        Star alpha = new Star( 70, "yellow",6 );
        Star beta = new Star( 30, "red", 8);
        Star gamma = new Star(30, 5);
        Sun earthSun = new Sun( 20, "yellow", 6, true);
        Sun habitableSun = new Sun(33493, 6, true);


        System.out.println("Does the star gamma go supernova? " + gamma.goSuperNova() +"\n");
        System.out.println("are the stars alpha and beta comparable? " + alpha.equals(beta));
        System.out.println("star alpha: " + alpha.toString());
        earthSun.calculateSize();
        System.out.println("\n is habitableSun comparable to earthSun? " + earthSun.equals(habitableSun));

    }
}
