package kata4;

import kata4.model.Mail;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String filename) {
        List<Mail> list = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
            String line;
            while((line = reader.readLine()) != null) {
                if(Mail.isMail(line)) {
                    list.add(new Mail(line));
                }
            }


        }catch (FileNotFoundException e){
            System.out.println("ERROR MailListReader::read (File not Found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR MailListReader::read (IO" + e.getMessage());
        }


        return list;
    }
}
