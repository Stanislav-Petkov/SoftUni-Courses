import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("R", -5),
                new Book("D", 12),
                new Book("D", 15),
                new Book("R", 123)));

        arrayList.stream()
                .sorted(new BookComparator())
                .peek(book -> System.out.println(book))
                .collect(Collectors.toList());
    }
}

/*

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("A", 12),
                new Book("C", 15),
                new Book("B", 5)));

        arrayList.stream()
                .sorted() // sravnqva gi po naturalniq red na bukvite kakto stringovete
                .peek(book -> System.out.println(book.getTitle() + ": " + book.getYear()))
                .collect(Collectors.toList());
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("firstName",12,"AuthorFoo"),
                new Book("second",15),
                new Book("third", 5)));

        arrayList.stream()
                .sorted((first,second) ->{
                    return first.getYear() - second.getYear();
                })
                .peek(book -> System.out.println(book.getTitle() + ": " + book.getYear()))
                .collect(Collectors.toList());

 */
/*
    public static void main(String[] args) {

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("firstName",12,"AuthorFoo"),
                new Book("second",15),
                new Book("third", 5)));

        arrayList.stream()
                .sorted((first,second) ->{
                    if(first.getYear() == second.getYear()){
                        return 0;
                    }else if(first.getYear() > second.getYear()){
                        return 1;
                    }else {
                        return -1;
                    }
                })
                .peek(book -> System.out.println(book.getTitle() + ": " + book.getYear()))
                .collect(Collectors.toList());

 */
/*
    public static void main(String[] args) {

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("FooName",12,"AuthorFoo"),
                new Book("Bar",15),
                new Book("var", 5)));

        arrayList.stream()
                .sorted(new BookComparator())
                .peek(book -> System.out.println(book.getTitle() + ": " + book.getYear()))
                .collect(Collectors.toList());



 */

/*
   public static void main(String[] args) {

        List<Book> arrayList = new ArrayList<>(List.of(
                new Book("FooName",12,"AuthorFoo"),
                new Book("Bar",15)));
        Collections.sort(arrayList, new BookComparator()); //BookComparator znae da sravnqva samo knigi i zatova mojem da sravnqvame
        //elementi v List samo ot knigi <Book>

        for(Book aBook : arrayList){
            System.out.println(aBook.getTitle() + ": " + aBook.getYear());
        }
        //izlizat po sortirani po godina kakto sme gi sravnili po godina v comparatora


 */
/*

//sortira chislata v list

   List<Integer> list = List.of(5,1,-8,1,15);
        List<Integer> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList);
            for(Integer l : arrayList){
            System.out.println(l);
        }

 */
/*
public static void main(String[] args) {

        NodeList<String, String> list = new NodeList<>();
        list.add(new Node<>("Alice", "plovdiv"));
        list.add(new Node<>("Bob", "London"));

        for (Node<String, String> node : list) {
            System.out.println(node.key);
        }
    }

 */
/*
   BookExample book = new BookExample("Title of book",1,"mark");
        BookExample book1 = new BookExample("Title of book1",1,"mark2");
        BookExample book2 = new BookExample("Title of book1",1,"mark2");

        List<BookExample> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
 */
/*


public static void printStrings( String... strings, String mandatory){
        //tova e nevalidno zashtoto neznaem kolko shte sa purvonachalniq broiq var args

       public static void printStrings( String... strings, String... strings){
        //tova e nevalidno zashtoto neznaem kolko shte sa purvonachalniq broiq var args




  public static void main(String[] args) {

        printStrings("");//moje da se vika bez da podavam nishto
        printStrings("A string1");//0,1, ili poveche stringove moje da se podadat
        printStrings("A string12","another");
    }

    public static void printStrings(String mandatory, String... strings){
//ako imame var args proizvolen broi argumenti vinagi trqbva da budat
        //posledniq argument na metoda
        System.out.println(mandatory);
        for(String string : strings){
            System.out.println(string);//purviq put ne printira nishto zaradi prazniq string
        }
    }

 */
/*
    public static void main(String[] args) {

        printStrings();//moje da se vika bez da podavam nishto
        printString(null);//trabva da podam neshto
    }
    public static void printString(String string){

    }
    public static void printStrings(String... strings){//priema variable arguments
        //ne znam kolko stringa shte polucha no znam che sa stringove

    }
}
 */

/*
  public static void main(String[] args) {

        printStrings();//moje da se vika bez da podavam nishto
        printStrings("A string1");//0,1, ili poveche stringove moje da se podadat
        printStrings("A string12","another");
    }

    public static void printStrings(String... strings){//priema variable arguments
        //ne znam kolko stringa shte polucha no znam che sa stringove

        for(String string : strings){
            System.out.println(string);//purviq put ne printira nishto zaradi prazniq string
        }
    }
 */

/*
za 2ra zadacha

  Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library library = new Library(bookOne, bookTwo, bookThree);

        for (Book book: library) {
            System.out.println(book.getTitle());
        }

 */