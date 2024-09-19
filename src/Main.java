import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);


        //For the date
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));
        System.out.println("===================");

        //For the time

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));
        System.out.println("===================");


        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeek.format(currentDate));
        System.out.println("===================");

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
    }


}
