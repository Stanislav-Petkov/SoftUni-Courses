package shoppingSpree;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(";");

        Map<String, Person> peopleByName = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            Person p = new Person(name, money);
            peopleByName.putIfAbsent(name, p);
        }

        input = scanner.nextLine().split(";");

        Map<String, Product> productByNames = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            String[] tokens = input[i].split("=");
            String name = tokens[0];
            double money = Double.parseDouble(tokens[1]);
            Product p = new Product(name, money);
            productByNames.putIfAbsent(name, p);
        }

        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] tokens = line.split(" ");

            String name = tokens[0];
            String product = tokens[1];
            try {
                peopleByName.get(name).buyProduct(productByNames.get(product));
                System.out.println(name + " bought " + product);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
            line = scanner.nextLine();
        }

        for (Person value : peopleByName.values()) {
            System.out.println(value.toString());
        }
    }
}

/*


//90/100
package shoppingSpree;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money){
        this.setName(name);
        this.setMoney(money);
        this.products = new LinkedList<>();
    }

    private void setMoney(double money) {
        if(money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    public void buyProduct(Product product){
        if(this.money >= product.getCost()){
            this.products.add(product);
            this.money = this.money - product.getCost();
            System.out.printf("%s bought %s%n",this.getName(),product.getName());
        }else {
            System.out.printf("%s can't afford %s%n",this.getName(),product.getName());
        }
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        if(this.products.size() > 0) {
            return this.name + " - " + printList(this.products);
        }else {
            return String.format("%s – Nothing bought",this.getName());
        }
    }

    private String printList(List<Product> products) {
        String names = "";
        for (int i = 0; i < products.size() - 1; i++) {
            names += products.get(i).getName() + ", ";
        }
        names += products.get(products.size() -1).getName();
        return names;
    }
}

package shoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost){
        this.setName(name);
        this.setCost(cost);
    }

    private void setCost(double cost) {
        if(cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public double getCost(){
        return this.cost;
    }
}



package shoppingSpree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesInput = scanner.nextLine();
        String[] names = namesInput.split(";");

        List<Person> personList = new LinkedList<>();

        for (int i = 0; i < names.length; i++) {
            String[] nameAndMoney = names[i].split("=");
            String name = nameAndMoney[0];
            try {
                double money = Double.parseDouble(nameAndMoney[1]);
                Person person = new Person(name,money);
                personList.add(person);
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }


        List<Product> productList = new LinkedList<>();

        String productsInput = scanner.nextLine();
        String[] products = productsInput.split(";");
        for (int i = 0; i < products.length; i++) {
            String[] nameAndCost = products[i].split("=");
            String name = nameAndCost[0];
            double cost = Double.parseDouble(nameAndCost[1]);
            Product product = new Product(name,cost);
            productList.add(product);
        }


        String line = scanner.nextLine();
        while (!line.equals("END")){
            String[] nameProduct = line.split("\\s+");
            String name = nameProduct[0];
            String product = nameProduct[1];
            for (int i = 0; i < personList.size(); i++) {
                for (int j = 0; j < productList.size() ; j++) {

                    String personName = personList.get(i).getName();
                    String productName = productList.get(j).getName();
                    if(personName.equals(name) && productName.equals(product)){
                        Person person = personList.get(i);
                        Product product1 = productList.get(j);
                        person.buyProduct(product1);
                    }
                }
            }

            line = scanner.nextLine();
        }
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }
}
 */
