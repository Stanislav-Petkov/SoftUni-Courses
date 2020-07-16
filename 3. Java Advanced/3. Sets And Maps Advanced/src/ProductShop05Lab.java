public class ProductShop05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, ArrayList<String>> shopsMap = new TreeMap<>();

        while (!line.equals("Revision")) {
            String[] arr = line.split(", ");
            String nameShop = arr[0];
            String productAndPrice = "Product: " + arr[1] + ", ";

            productAndPrice += "Price: " + String.format("%.1f", Double.parseDouble(arr[2]));
            ArrayList<String> newValuesList = new ArrayList<>();
            newValuesList.add(productAndPrice);
            if (!shopsMap.containsKey(nameShop)) {
                shopsMap.put(nameShop, newValuesList);
            } else {
                ArrayList<String> currentValue = shopsMap.get(nameShop);
                currentValue.add(productAndPrice);
                shopsMap.put(nameShop, currentValue);
            }

            line = scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : shopsMap.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (String s : shopsMap.get(entry.getKey())) {
                System.out.println(s);
            }
        }
    }
}
