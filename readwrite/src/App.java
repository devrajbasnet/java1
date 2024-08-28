import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
try {
//writing to file
FileWriter mywriter = new FileWriter( "D: JavaFile1.txt");
 mywriter.write( "Hello World!Welcome to Java class");
mywriter.close();
System.out.println("writing to the file successful");
// Reading From file
File myObj = new File( "D: JavaFile1.txt");
Scanner myReader = new Scanner(myObj);
while (myReader.hasNextLine()) {
String data = myReader.nextLine();
System.out.println(data);
}
myReader.close();
}
catch (IOException e)
{
System.out.println( "An error occurred.");
e.printStackTrace();
}}}
