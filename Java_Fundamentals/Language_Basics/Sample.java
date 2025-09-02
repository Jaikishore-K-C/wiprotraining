package Language_Basics;
public class Sample {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Please provide exactly one command line argument.");
            System.out.println("Usage: java Sample <Name>");
            return;
        }
        String name = args[0];
        System.out.println("Welcome " + name);
    }
}
