//package Task_4;
//multiline notes until hitted END 
//used stringbuilder to....
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class NotesApp {
    public static void writeNote(){
        Scanner sc = new Scanner(System.in);
        StringBuilder note = new StringBuilder(); 
        System.out.println("Enter title of Note : "); 
        String title = sc.nextLine();
        System.out.println("Enter Note (Type END on a new line to finish writing): ");
        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("END")) {
                break;
            }         
            note.append(line).append("\n");   
        }
        try {
            FileWriter w = new FileWriter("notes.txt",true);
            w.write("Title : "+title + "\n");
            w.write(note.toString());
            w.write("-----\n");
            w.close();
            System.out.println("Note saved successfully...");
        } catch (IOException e) {
           System.out.println("An error occurred while writing note : "+e.getMessage());
        }
    }
    
    public static void readNote(){
        File f = new File("notes.txt");
        if (!f.exists()) {
            System.out.println("File doesn't Exists");
            return;
        }
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String line;
                System.out.println("\n--- your Saved Notes --- : ");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("------------------");
                br.close();
                fr.close();
            } catch (IOException e) {
                System.out.println("Error occurred whie reading file "+e.getMessage());
            }            
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*****Notes Management app*****");
            System.out.println("1.Write Note.");
            System.out.println("2.View Note");
            System.out.println("3.Exit");
            System.out.println("Chose Any one option from the above Menu.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    writeNote();
                    break;
                case 2:
                    readNote();
                    break;
                case 3:
                    System.out.println("Exiting...Thank you for using our app.");
                    return;
            
                default:
                    System.out.println("Invalid choice....Try again later");
                    break;
            }
        }
    }
}
