package kata4;


import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;

import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        String filename = "email.txt";
        List<Mail> mailList = MailListReader.read(filename);

        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);

        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", mailHistogram);
        histogramDisplay.execute();
    }

}
