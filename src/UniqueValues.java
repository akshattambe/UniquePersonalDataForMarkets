import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UniqueValues {
    public String providePersonalDetails(String emailAddress, int countryCode){

        //Get the country code.
        System.out.println("Please enter 2 digit country code for telephone like 46 for SE: ");
        int phone = (countryCode * 100000) + 75155; //75155 is fixed code.

        //Process email.
        String[] emailArr = emailAddress.split("@");

        //Generate random string.
        String suf = String.format("%04d", new Random().nextInt(10000));

        //Prepare Personal details.
        List<Object> li = new ArrayList<>();
        li.add("+" + phone);
        li.add("Hisingsgatan ");

        //Print unique data.
        String email123 = emailArr[0] + "+" + suf + "@" + emailArr[1];
        System.out.println(email123);
        for (Object e : li) {
            System.out.println(e + suf);
        }
        return email123 + "\n" +  li.get(0)+ suf + "\n" + li.get(1)+ suf;
    }
}
