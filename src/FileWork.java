import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork {

    public void readFile () {
        try (FileReader fileRead = new FileReader("work.txt")){
            int c;
            while((c=fileRead.read())!=-1){

                System.out.print((char)c);
            }
            System.out.print("\n");
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void writeFile () {
        Scanner toWrite = new Scanner(System.in);
        System.out.println("Введите строку для записи в файл:");
        String string = toWrite.nextLine();
        try (FileWriter writeFile = new FileWriter("work.txt", true)){
            writeFile.write(string);
            writeFile.flush();
        } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
