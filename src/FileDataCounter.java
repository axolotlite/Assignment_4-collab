import java.io.File;

/**
 * sheet 5 Question 6
 * <p>
 *     Write a program that will count the number of characters, words, and lines in a file. Whitespace
 * characters separate words. Filename should be input to the program.
 * </p>
 */

public class FileDataCounter {
    //TODO implement string variable for location

    //TODO Function that checks if file exists or not

    //TODO function that returns the data scrapped from the text file

    //TODO test it
    public static void main(String[] args) {

        int Count_Char=0,Count_Word=0,Count_Line=0;

        Scanner InputFile = new Scanner(System.in);
        File file = new File(InputFile.next());

     if(file.exists())
      System.out.println("File exits");

     else {
         file.createNewFile();
               PrintWriter NewFile= new PrintWriter(file);
          NewFile.println("Good Boring");
          NewFile.println("I wish");
          NewFile.println("A Good Day For You");
          NewFile.close();
     }
        String Line;
        String Words[];

        Scanner Input = new Scanner(file);


        while (Input.hasNext()) {
            Line = Input.nextLine();
            Words = Line.split(" ");
            for(int i=0;i<Words.length;i++)
            {
                    Count_Word ++;
            }

            for(int i=0;i<Line.length();i++)
            {
                if(Line.charAt(i)!=' '&&Line.charAt(i)!='\n')
                    Count_Char ++;
            }

            Count_Line++;
          }

        System.out.println(Count_Line);
        System.out.println(Count_Word);
        System.out.println(Count_Char);

    }
}
