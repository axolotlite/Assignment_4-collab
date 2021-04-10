import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Sheet 5 Question 7
 * <p>
 *     Write a program to create a file named tst.txt if it does not exist. Write 100 integers created
 * randomly into the file using text I/O. Integers are separated by spaces in the file. Read the data
 * back from the file and display the data in increasing order.
 * </p>
 */
public class RandomNumFileGenerator {
    //TODO implement the variables
    private String loc;
    private File io;
    private PrintWriter writer;
    private Random seed = new Random();
    public RandomNumFileGenerator(){}
    public RandomNumFileGenerator(String loc){
        this.loc = loc;
        try{
            io = new File(loc);
            writer = new PrintWriter(io);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found, please check if it exists");
            return;
        }
        for(int i=0;i<100;i++) writer.printf("%d ",seed.nextInt(Integer.MAX_VALUE));
        writer.close();
    }

    //TODO test it
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        String loc =  "tst.txt";
        new RandomNumFileGenerator(loc);
        try {
            Scanner reader = new Scanner(new File(loc));
            while(reader.hasNext()){
                int num = Integer.parseInt(reader.next());
                data.add(num);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Really?");
        }

        Collections.sort(data);
        System.out.println(data.toString());
    }
}
