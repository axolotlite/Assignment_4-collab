import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * sheet 5 Question 6
 * <p>
 *     Write a program that will count the number of characters, words, and lines in a file. Whitespace
 * characters separate words. Filename should be input to the program.
 * </p>
 */

public class FileDataCounter {
    //TODO implement string variable for location
    private String location;
    private File loc;
    private Scanner inp;
    public int[] scrapped = {1,1,1}; //scanner doesn't count the last line, word or char.
    private boolean flag = true;
    public FileDataCounter(){}
    public FileDataCounter(String location){
        try {
            loc = new File(location);
            inp = new Scanner(loc);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found, please check if it exists");
            this.flag = false;
        }
        finally{
            countAll(flag);
        }
    }

    //TODO function that returns the data scrapped from the text file
    private void countAll(boolean flag){
        if(flag)
        while(inp.hasNextLine()){
            Scanner input = new Scanner(inp.nextLine());
            scrapped[0]++;
            while(input.hasNext()){
                scrapped[1]++;
                scrapped[2] += input.next().length(); //whitespaces are not counted.
            }
        }
    }
    public void printInfo(){
        if(flag)System.out.println("The number of lines: "+scrapped[0]+"The number of words: "+scrapped[1]+"The number of letters without whitespace: "+scrapped[2]);
    }
    //TODO test it
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        FileDataCounter tick; // = new FileDataCounter("/home/starchild/IdeaProjects/Assignment_4_Collab/src/Text Files/On GP");
        System.out.println("Input file to read: ");
        String loc = io.next();
        tick = new FileDataCounter(loc);
        tick.printInfo();
        //System.out.println(tick.scrapped[0]+" "+tick.scrapped[1]+" "+tick.scrapped[2]);
    }
}
