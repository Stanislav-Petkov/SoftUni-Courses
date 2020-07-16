public class CitiesByContinentAndCountry06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Map<String, ArrayList<String>>> towns = new LinkedHashMap<>();
        while (num-- > 0) {
            String[] inputData = scanner.nextLine().split("\\s+");
            String continent = inputData[0];
            String country = inputData[1];
            String city = inputData[2];

            if (!towns.containsKey(continent)) {
                towns.put(continent, new LinkedHashMap<>() {{
                    put(country, new ArrayList<>() {{
                        add(city);
                    }});
                }});
            } else {
                if (!towns.get(continent).containsKey(country)) {
                    towns.get(continent).put(country, new ArrayList<>() {{
                        add(city);
                    }});
                } else {
                    towns.get(continent).get(country).add(city);
                }
            }
        }
        for (Map.Entry<String, Map<String, ArrayList<String>>> entry : towns.entrySet()) {

            System.out.println(entry.getKey() + ":"); // print Continent

            Set<String> countryNames = entry.getValue().keySet();
            Collection<ArrayList<String>> cityNames = entry.getValue().values();

            int counter = 0;
            for (String s : countryNames) {
                System.out.print("  " + s + " -> ");
                for (ArrayList<String> ar : cityNames) {
                    while (ar.get(counter).length() != 0) {
                        int i = 0;
                        System.out.print(entry.getValue().get(s).get(0));
                        ar.remove(0);
                        if (i != ar.size() - 1) {
                            System.out.print(", ");
                        }
                        if (ar.get(counter).isEmpty()) {
                            break;
                        }
                    }
                    counter++;
                    System.out.println();
                    break;
                }
            }
            System.out.println();
        }
    }
}
