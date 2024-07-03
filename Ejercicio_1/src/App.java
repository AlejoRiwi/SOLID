import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<String> items = Arrays.asList("Item1", "Item2", "Item3");
        Order order = new Order(items);

        printOrder print = new printOrder();
        print.printOrder(order);

        saveToDatabase save = new saveToDatabase();
        save.saveToDatabase(order);
    }
}
