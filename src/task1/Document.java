package task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Document {

    public static void readSmallFile() throws IOException, IvalidException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String file = scanner.nextLine();
        Path path = Paths.get(file);

        List<String> strings = Files.readAllLines(path);

        for (String s: strings) {
            if(s.length() != 15) {
                String massage = "length != 15";
                whenBufferedWriteerInvalid(massage, s);
//                throw new InvalidException(massage);
            }else if(s.contains("-")){
                String massage = "invalid";
                whenBufferedWriteerInvalid(massage, s);
//                throw new InvalidException(massage);
            }else if(!s.startsWith("docnum")){
                String massage = "!docnum";
                whenBufferedWriteerInvalid(massage, s);
//                throw new IvalidException(massage);
            }else{
                whenBufferedWriteerNotInvalid(s);
                System.out.println(s);
            }
        }

    }
    public static void whenBufferedWriteerInvalid(String massage, String docnum) throws IOException {
        String str = massage;
        String documentnum = docnum;
        FileWriter fileWriter = new FileWriter("invalid.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(str);
        writer.write(" ");
        writer.write(docnum);
        writer.write("\n");
        writer.close();
    }
    public static void whenBufferedWriteerNotInvalid(String docnum) throws IOException {
        String documentnum = docnum;
        FileWriter fileWriter = new FileWriter("notinvalid.txt", true);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(documentnum);
        writer.write(" ");
        writer.close();
    }
}
