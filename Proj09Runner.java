/***************************************************
 File: Proj09runner.java
 Author: Fred Butoma
 Purpose: Proj09Runner.java is a class that has a
 run method that sorts strings and integers from the
 command line and returns a decscending ordered list
 ***************************************************/
import java.util.*;
import java.util.stream.*;

public class Proj09Runner {
    private String[] data;

    // Constructor for Proj07Runner
    public Proj09Runner() {
        // Print the certification statement
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma");


    }
    public List<String> run(){
        List<String> sortedList = Arrays.stream(data)
                                        .sorted(Comparator.reverseOrder())
                                        .collect(Collectors.toList());

        return sortedList;
    }
}
