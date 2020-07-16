import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount06Ex {
    public static void main(String[] args) throws IOException {
        String words = "C:\\Users\\admin-pc\\Desktop\\advResources\\words.txt";
        String fileToCheck = "C:\\Users\\admin-pc\\Desktop\\advResources\\text.txt";
        BufferedReader br = new BufferedReader(new FileReader(words));
        BufferedReader brTest = new BufferedReader(new FileReader(fileToCheck));
        Map<String, Integer> wordsCount = new LinkedHashMap<>();
        String line = br.readLine();
        String[] lines = line.split("\\s+");
        for (int i = 0; i < lines.length; i++) {
            wordsCount.putIfAbsent(lines[i], 0);
        }
        String text = brTest.readLine();
        String[] textWordsArr = text.split("\\s+");
        int counter = 0;
        int currentValue = 0;
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            String mapKey = entry.getKey();
            for (int j = 0; j < textWordsArr.length; j++) {
                if (textWordsArr[j].equals(mapKey)) {
                    currentValue = entry.getValue() + 1;
                    wordsCount.put(mapKey, currentValue);
                }
            }
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
