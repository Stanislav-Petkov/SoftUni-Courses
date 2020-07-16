
import java.text.SimpleDateFormat;
public class L1000DaysAfterBirth {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
        String myDateString = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(myDateString));
        c.add(Calendar.DATE, 999);  // number of days to add
        myDateString = sdf.format(c.getTime());  // dt is now the new date
        System.out.print(myDateString);

    }
}


