package wildFarm3_old;

public class Main_old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int counter = 0;

        List<Animal_old> list = new LinkedList<>();
        Animal_old animal = null;
        Food_old food = null;
        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            if (counter % 2 == 0) {
                //{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} =

                String animalType = tokens[0];
                String animalName = tokens[1];
                Double animalWeight = Double.parseDouble(tokens[2]);
                Integer foodEaten = 0;
                String animalLivingRegion = tokens[3];

                if (animalType.equals("Mouse")) {
                    animal = new Mouse_old(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
                } else if (animalType.equals("Cat")) {
                    String catBreed = tokens[4];
                    animal = new Cat_old(animalName, animalType, animalWeight, foodEaten, animalLivingRegion, catBreed);

                } else if (animalType.equals("Tiger")) {
                    animal = new Tiger_old(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);

                } else if (animalType.equals("Zebra")) {
                    animal = new Zebra_old(animalName, animalType, animalWeight, foodEaten, animalLivingRegion);
                }
            } else {
                String foodType = tokens[0];
                Integer quantity = Integer.parseInt(tokens[1]);
                if (foodType.equals("Vegetable")) {
                    food = new Vegetable_old(quantity);
                } else if (foodType.equals("Meat")) {
                    food = new Meat_old(quantity);
                }
            }

            if (food != null && animal != null) {
                animal.makeSound();
                animal.eat(food);
                list.add(animal);
                animal = null;
                food = null;
            }
            counter++;
            line = scanner.nextLine();
        }
        for (Animal_old a : list) {
            System.out.println(a.toString());
        }
    }
}
