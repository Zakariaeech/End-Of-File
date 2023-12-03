import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // create scanner object
        Scanner In = new Scanner(System.in);
        int i = 1;
        // Print the string
        while (In.hasNext()){
            String Input = In.nextLine();
            System.out.printf(i+" %s\n",Input,i++);
        } 
        In.close();
    }
}