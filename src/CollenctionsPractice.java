import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CollenctionsPractice {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of cities: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            cities.add(new City(scanner.next(), scanner.nextInt()));
        }
        System.out.println(cities.stream()
                .filter(city -> city.getPopulation() > 10000)
                .count());
    }
}
