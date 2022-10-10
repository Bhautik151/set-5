import java.util.*;
import java.io.*;
public class pr_2 {

    public static void main(String[] args) throws IOException {
        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("C:/Programs/part 5/pr2.txt");

            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.print((char) temp);

            System.out.println("\nsuccessfully executed");
        }

        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
        System.out.println("\nBhautik_21CE151");
    }
}