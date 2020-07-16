import java.util.stream.Collectors;

public class BombNumbers05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int powerValue = tokens.get(1);
        int bombValue = tokens.get(0);
        while (firstList.contains(bombValue)) {
            int bombPosition = firstList.indexOf(tokens.get(0));
            int rightBound = Math.min(bombPosition + powerValue, firstList.size() - 1);
            int leftBound = Math.max(bombPosition - powerValue, 0);
            for (int i = rightBound; i >= leftBound; i--) {
                firstList.remove(i);
            }
        }
        int sum = firstList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}




/*
public class BombNumbers05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> firstList = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "2", "2", "2", "9"));
        List<String> firstList = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "2", "2", "2", "9"));
        //List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] tokens = new String[] {"4","2"};
        //for (int i = 0; i < firstList.size(); i++) {
        String tokenValue = tokens[0];
        int tokenAsNum = (Integer.parseInt(tokenValue));
        int positionOfBomb = Integer.parseInt(firstList.get(tokenAsNum));
        System.out.println(tokenValue);
        System.out.println(tokenAsNum);
       System.out.println(positionOfBomb);
            //firstList.re
        //}

        System.out.println();
        for (int i = 0; i < firstList.size(); i++) {
            System.out.print(firstList.get(i) + " ");
        }
    }
}

 */

/*
//zero test 1, 4 i posledniq ot judge
import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> firstList = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "2", "2", "2", "9"));
        //List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 7, 7, 1, 2, 3));
        String[] tokens = new String[] {"7","1"};

        //nashiq List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //nashiq var String[] tokens = scanner.nextLine().split("\\s+");

        String tokenValue = tokens[0]; // 4

        //kolko puti bombata q ima
        int occurencesOfBomb = 0;
        for (int i = 0; i < firstList.size(); i++) {
            if(firstList.get(i) == Integer.parseInt(tokens[0])){
                occurencesOfBomb++;
            }
        }
        //System.out.println(occurencesOfBomb);
        while (occurencesOfBomb > 0) {
            int tokenAsNum = (Integer.parseInt(tokenValue)); //4
            int positionOfBomb = firstList.indexOf(tokenAsNum);

            int secondToken = Integer.parseInt(tokens[1]);
            //System.out.println(tokenValue);
            //System.out.println(tokenAsNum);
            // System.out.println(positionOfBomb);
            for (int i = positionOfBomb - 1; i >= positionOfBomb - secondToken; i--) {
                firstList.remove(i);
            }
            int currentPositionOfbomb = firstList.indexOf(tokenAsNum); //1
            for (int i = currentPositionOfbomb + 1; i <= currentPositionOfbomb + secondToken; i++) {
                firstList.remove(i);
            }

            int finalPositionOfBomb = firstList.indexOf(tokenAsNum);//1
            firstList.remove(finalPositionOfBomb);
            occurencesOfBomb--;
        }

        //System.out.println();
        int sum = 0;
        for (int i = 0; i < firstList.size(); i++) {
            //System.out.print(firstList.get(i) + " ");
            sum += firstList.get(i);
        }
        System.out.println(sum);
    }
}
 */

//zero test 1 3 4
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<String> firstList = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "2", "2", "2", "9"));
        //List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 7, 7, 1, 2, 3));
        String[] tokens = new String[] {"7","1"};

       // List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //String[] tokens = scanner.nextLine().split("\\s+");

        String tokenValue = tokens[0]; // 4

        //kolko puti bombata q ima
        int occurencesOfBomb = 0;
        for (int i = 0; i < firstList.size(); i++) {
            if(firstList.get(i) == Integer.parseInt(tokens[0]) && firstList.get(i + 1) != Integer.parseInt(tokens[0]) ){
                occurencesOfBomb++;
            }
        }
        //System.out.println(occurencesOfBomb);
        while (occurencesOfBomb > 0) {
            int tokenAsNum = (Integer.parseInt(tokenValue)); //4
            int positionOfBomb = firstList.indexOf(tokenAsNum);

            int secondToken = Integer.parseInt(tokens[1]);
            //System.out.println(tokenValue);
            //System.out.println(tokenAsNum);
            // System.out.println(positionOfBomb);
            for (int i = positionOfBomb - 1; i >= positionOfBomb - secondToken; i--) {
                firstList.remove(i);
            }
            int currentPositionOfbomb = firstList.indexOf(tokenAsNum); //1
            for (int i = currentPositionOfbomb + 1; i <= currentPositionOfbomb + secondToken; i++) {
                firstList.remove(i);
            }

            int finalPositionOfBomb = firstList.indexOf(tokenAsNum);//1
            firstList.remove(finalPositionOfBomb);
            occurencesOfBomb--;
        }

        //System.out.println();
        int sum = 0;
        for (int i = 0; i < firstList.size(); i++) {
            //System.out.print(firstList.get(i) + " ");
            sum += firstList.get(i);
        }
        System.out.println(sum);
    }
 */

///vsichki zero testove minavat
/*
 Scanner scanner = new Scanner(System.in);
        //List<String> firstList = new ArrayList<>(Arrays.asList("1", "2", "2", "4", "2", "2", "2", "9"));
        //List<String> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

       // List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 4, 4, 2, 8, 9, 1));
       // String[] tokens = new String[] {"9","3"};

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split("\\s+");

        String tokenValue = tokens[0]; // 4

        //kolko puti bombata q ima v neposledovatelni chisle
        int occurencesOfBomb = 0;
        for (int i = 0; i < firstList.size(); i++) {
            if(firstList.get(i) == Integer.parseInt(tokens[0]) && firstList.get(i + 1) != Integer.parseInt(tokens[0]) ){
                occurencesOfBomb++;
            }
        }
        //System.out.println(occurencesOfBomb);
        while (occurencesOfBomb > 0) {
            int tokenAsNum = (Integer.parseInt(tokenValue)); //4
            int positionOfBomb = firstList.indexOf(tokenAsNum);

            int secondToken = Integer.parseInt(tokens[1]);
            //System.out.println(tokenValue);
            //System.out.println(tokenAsNum);
            // System.out.println(positionOfBomb);
            for (int i = positionOfBomb - 1; i >= positionOfBomb - secondToken; i--) {
                firstList.remove(i);
            }
            int currentPositionOfbomb = firstList.indexOf(tokenAsNum); //2
            for (int i = currentPositionOfbomb + 1; i <= currentPositionOfbomb + secondToken; i++) {
                if((i - 1)  == firstList.size()){
                    break;
                }
                firstList.remove(i);
            }

            int finalPositionOfBomb = firstList.indexOf(tokenAsNum);//1
            firstList.remove(finalPositionOfBomb);
            occurencesOfBomb--;
        }

        //System.out.println();
        int sum = 0;
        for (int i = 0; i < firstList.size(); i++) {
            //System.out.print(firstList.get(i) + " ");
            sum += firstList.get(i);
        }
        System.out.p
 */
//
/*
//100/1000
import java.util.*;
import java.util.stream.Collectors;

public class BombNumbers05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 4, 4, 2, 8, 9, 1));
       // String[] tokens = new String[] {"9","3"};

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String[] tokens = scanner.nextLine().split("\\s+");
        int powerValue = Integer.parseInt(tokens[1]);
        int bombValue = Integer.parseInt(tokens[0]);
        while (firstList.contains(bombValue)){
            int bombPosition = firstList.indexOf(Integer.parseInt(tokens[0]));

            int rightBound = Math.min(bombPosition + powerValue, firstList.size() - 1);
            int leftBound = Math.max(bombPosition - powerValue, 0);
            for (int i = rightBound; i >= leftBound ; i--) {
                firstList.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < firstList.size(); i++) {
            sum += firstList.get(i);
        }
        System.out.println(sum);
    }
}


 */