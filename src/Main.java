/**
 * This will contain the main testing cases for the project.
 * due to the ****ery caused by koms last main, we'll call the main of each question in here.
 */
public class Main {
    public static void main(String[] args) {
        FileDataCounter f1 = new FileDataCounter();
        RandomNumFileGenerator f2 = new RandomNumFileGenerator();
        f1.main(args);
        f2.main(args);
    }
}
