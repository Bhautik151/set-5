
public class pr_6 {
    public static void main(String[] args) {

        int k = 80;
        double n = 80.5;

        Integer aObj = Integer.valueOf(k);
        Double bObj = Double.valueOf(n);

        if (aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if (bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
        System.out.println("\nBhautik_21CE151");
    }
}