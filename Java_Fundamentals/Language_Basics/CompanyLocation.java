package Language_Basics;
public class CompanyLocation {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two command line arguments.");
            System.out.println("Usage: java CompanyLocation <CompanyName> <Location>");
            return;
        }
        String company = args[0];
        String location = args[1];
        System.out.println(company + " Technologies " + location);
    }
}
