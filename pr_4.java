import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pr_4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("pr4_IPfile.txt");
            fos = new FileOutputStream("pr4_OPfile.txt");

            int temp;

            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\nBhautik_21CE151");
    }
}