import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> specialItems = new HashMap<>();
        Map<String, Integer> junkItem = new TreeMap<>();
        specialItems.put("motes", 0);
        specialItems.put("fragments", 0);
        specialItems.put("shards", 0);
        boolean isObtained = false;
        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (specialItems.containsKey(item)) {
                    int num = specialItems.get(item) + quantity;
                    specialItems.put(item, num);
                } else {
                    if (!junkItem.containsKey(item)) {
                        junkItem.put(item, quantity);
                    } else {
                        int secNum = junkItem.get(item) + quantity;
                        junkItem.put(item, secNum);
                    }
                }
                if (specialItems.get("motes") >= 250) {
                    int num = specialItems.get("motes") - 250;
                    specialItems.put("motes", num);
                    System.out.println("Dragonwrath obtained!");
                    isObtained = true;
                    break;
                } else if (specialItems.get("shards") >= 250) {
                    int num = specialItems.get("shards") - 250;
                    specialItems.put("shards", num);
                    System.out.println("Shadowmourne obtained!");
                    isObtained = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    int num = specialItems.get("fragments") - 250;
                    specialItems.put("fragments", num);
                    System.out.println("Valanyr obtained!");
                    isObtained = true;
                    break;
                }
            }
        }
        specialItems.entrySet().stream()
                .sorted((a, b) -> {
                    if (b.getValue() - a.getValue() == 0) {
                        return a.getKey().compareTo(b.getKey());
                    } else {
                        return b.getValue() - a.getValue();
                    }
                })
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItem.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}






/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> specialItems = new HashMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();

        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (specialItems.containsKey(item)) {
                    int num = specialItems.get(item) + quantity;
                    specialItems.put(item, num);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int secondNum = junkItems.get(item) + quantity;
                        junkItems.put(item, secondNum);
                    }
                }
                if (specialItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int num = specialItems.get("shards") - 250;
                    specialItems.put("shards", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int num = specialItems.get("fragments") - 250;
                    specialItems.put("fragments", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int num = specialItems.get("motes") - 250;
                    specialItems.put("motes", num);
                    isObtained = true;
                    break;
                }
            }
        }
        specialItems.entrySet()
                .stream()
                .sorted((a,b) -> {//ako izvadim ot ednoto drugoto i e 0 oznachava che sa ednakvi
                    if(b.getValue() - a.getValue() == 0){//kogato polzvam HashMap //ako stoinostite sa ednakvi sortirai po kluchovete
                        return a.getKey().compareTo(b.getKey());//ako stoinostite sa ednakvi sortirai po kluchovete | ako stoinostite sa ednakvi
                        //printirame po azbuchen red na kluchovete
                    }else {
                        return b.getValue() - a.getValue();//ako stoinostite sa razlichni sortirai po stoinostite
                    }
                })
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkItems.forEach((key, value) -> System.out.println(key + ": " + value));
    }
 */
/*
//drugo reshenie s hashMap
  Scanner scanner = new Scanner(System.in);
        Map<String, Integer> specialItems = new HashMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();

        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (specialItems.containsKey(item)) {
                    int num = specialItems.get(item) + quantity;
                    specialItems.put(item, num);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int secondNum = junkItems.get(item) + quantity;
                        junkItems.put(item, secondNum);
                    }
                }
                if (specialItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int num = specialItems.get("shards") - 250;
                    specialItems.put("shards", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int num = specialItems.get("fragments") - 250;
                    specialItems.put("fragments", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int num = specialItems.get("motes") - 250;
                    specialItems.put("motes", num);
                    isObtained = true;
                    break;
                }
            }
        }
        specialItems.entrySet()
                .stream()
                .sorted((a,b) -> {
                    if(b.getValue() - a.getValue() == 0){//kogato polzvam HashMap //ako stoinostite sa ednakvi sortirai po kluchovete
                        return a.getKey().compareTo(b.getKey());//ako stoinostite sa ednakvi sortirai po kluchovete
                    }else {
                        return b.getValue() - a.getValue();//ako stoinostite sa razlichni sortirai po stoinostite
                    }
                })
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkItems.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}


 */
/*
//100
//s specialItems s treeMap veche e sortirano
 Map<String, Integer> specialItems = new TreeMap<>();
        Map<String, Integer> junkItems = new TreeMap<>();

        specialItems.put("shards", 0);
        specialItems.put("fragments", 0);
        specialItems.put("motes", 0);

        boolean isObtained = false;

        while (!isObtained) {
            String input = scanner.nextLine();
            String[] tokens = input.split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int quantity = Integer.parseInt(tokens[i]);
                String item = tokens[i + 1].toLowerCase();
                if (specialItems.containsKey(item)) {
                    int num = specialItems.get(item) + quantity;
                    specialItems.put(item, num);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int secondNum = junkItems.get(item) + quantity;
                        junkItems.put(item, secondNum);
                    }
                }
                if (specialItems.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    int num = specialItems.get("shards") - 250;
                    specialItems.put("shards", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    int num = specialItems.get("fragments") - 250;
                    specialItems.put("fragments", num);
                    isObtained = true;
                    break;
                } else if (specialItems.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    int num = specialItems.get("motes") - 250;
                    specialItems.put("motes", num);
                    isObtained = true;
                    break;
                }
            }
        }
        specialItems.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));//treeMapa veche gi e sortiral po kluch

        junkItems.forEach((key, value) -> System.out.println(key + ": " + value));
    }


 */

