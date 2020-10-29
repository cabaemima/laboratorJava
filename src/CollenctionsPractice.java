import java.util.*;
import java.util.stream.Collectors;

public class CollenctionsPractice {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Number of cities: ");
//        int n = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            cities.add(new City(scanner.next(), scanner.nextInt()));
//        }
//        System.out.println(cities.stream()
//                .filter(city -> city.getPopulation() > 10000)
//                .count());

        Map<Integer,City> map = new HashMap<>();
        map.put(1,new City("Oradea", 12345));
        map.put(2,new City("Cluj", 12345));
        map.put(3,new City("Brasov", 12345));

        System.out.println(map.get(2).getName());
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.isEmpty());
        map.remove(2);
        System.out.println(map.get(2));
    }
}
