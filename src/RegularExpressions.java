import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RegularExpressions { // The class starts here

    private static final Scanner scanner = new Scanner(System.in); // The program starts here

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String regex = "[a-z]+@gmail\\.com$"; // This will match gmail.com
        Pattern p = Pattern.compile(regex); // create a Pattern object (compiled RegEx) and save it as 'p' compile the Pattern
        List<String> nameList = new ArrayList<String>();


        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID); // Matcher to match our compiled RegEx to a String , pattern is matched and find add to array list
            if(m.find())
            // Print the match find the first name from the list
            {
                nameList.add(firstName);

            }
        }

        Collections.sort(nameList);
        for(String value: nameList)
        {
            System.out.println(value);
        }
        scanner.close();
    }
} // the class ends here
