import java.io.IOError;
import java.util.Scanner;
public class gettysburgAddressReader {
    public static void main(String[] args) {
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt ");
            Scanner input = new Scanner(url.openStream());
            int count = 0;
            while (input.hasNext()) {
                input.next();
                count++;
            }

            System.out.println("The Gettysburg Address has "+count+" words");
        } catch (java.net.MalformedURLException ex) {
            System.out.println("Invalid URL");
        } catch (java.io.IOException ex) {
            System.out.println("IO ERRORS");
        }
    }
}





