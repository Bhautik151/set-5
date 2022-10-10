import java.util.*;
import java.io.*;
import java.io.IOException;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class pr_5 {
    public static void copycontent(File input, File even) throws Exception {
        FileInputStream in = new FileInputStream(input);
        FileOutputStream out = new FileOutputStream(even);

        try {
            int n;
            while ((n = in.read()) != -1) {

                out.write(n);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
    public static void CopyContent(File input, File odd)
            throws Exception {
        FileInputStream in = new FileInputStream(input);
        FileOutputStream out = new FileOutputStream(odd);

        try {
            int n;

            while ((n = in.read()) != -1) {

                out.write(n);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }

            if (out != null) {
                out.close();
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        for(int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            try {
                FileWriter fw = new FileWriter("C:\\Programs\\part 5\\input.txt");
                BufferedWriter wb = new BufferedWriter(fw);
                wb.write(i+"\n");
                wb.newLine();
                wb.close();

                FileReader fr=new FileReader("C:\\Programs\\part 5\\input.txt");
                BufferedReader rb=new BufferedReader(fr);
                int read =rb.read();
                if(read%2==0){

                    File x=new File("input.txt");
                    File y=new File("even.txt");
                    pr_5.copycontent(x, y);
                }
                if(read%2!=0) {
                    File x = new File("input.txt");
                    File y = new File("odd.txt");
                    pr_5.CopyContent(x, y);
                }
                rb.close();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("for even file type 1 and for odd type 2: ");
        int n=sc.nextInt();
        if(n==1)
        {
            RandomAccessFile race = new RandomAccessFile(new File("C:\\Programs\\part 5\\even.txt"), "r");
            race.seek(0);
            FileReader evenread=new FileReader("C:\\Programs\\part 5\\even.txt");
            BufferedReader erb=new BufferedReader(evenread);

            System.out.println(erb.readLine());

            erb.close();
        }
        if(n==2)
        {
            RandomAccessFile raco = new RandomAccessFile(new File("C:\\Programs\\part 5\\odd.txt"), "r");
            raco.seek(0);
            FileReader oddread=new FileReader("C:\\Programs\\part 5\\odd.txt");
            BufferedReader orb=new BufferedReader(oddread);

            System.out.println(orb.readLine());

            orb.close();
        }
    }
}