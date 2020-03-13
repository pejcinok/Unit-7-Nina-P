import java.util.ArrayList;
import java.util.List;

public class VegetableTester {
    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList();
        garden.add(new Zucchini());
        garden.add(new Tomato());
        garden.add(new Potato());

        garden.get(0).harvest();
        garden.get(1).water();
        garden.get(2).feed();

        for(int i =0; i<garden.size(); i++){
            System.out.println(garden.get(i).toString());
        }

    }
}
