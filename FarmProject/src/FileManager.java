import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;*/

public class FileManager {
    public void fileWriter() {

        File farmLog = new File("farmLog.csv");
        try {
            FileOutputStream oFile = new FileOutputStream(farmLog, false);
        } catch (FileNotFoundException e) {
            try {
                farmLog.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

   /* public List<String[]> fileReader() {
        CSVReader csvReader = null;
        List<String[]> farmLog = new ArrayList<>();
        try {
            csvReader = new CSVReader(new FileReader("farmLog.csv"), ',', '"', 1);
            farmLog = csvReader.readAll();
        }
        catch (Exception ee) {
            ee.printStackTrace();
        }
        return farmLog;
    }*/

}
