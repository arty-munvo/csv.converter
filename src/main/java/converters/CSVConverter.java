package converters;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import models.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;

public class CSVConverter implements Converter {

    List<Model> listToConvert;

    public CSVConverter(List<Model> modelToConvert) {
        this.listToConvert = modelToConvert;
    }

    @Override
    public void convert(Path path) {
        writeCsvListFromModel(path);
    }


     private void writeCsvListFromModel(Path path) {




        try (Writer writer  = new FileWriter(path.toString())){
            StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                    .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                    .build();
            sbc.write(this.listToConvert);
        } catch (CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            System.err.println("You cannot use the same converter for two separate model objects");
        } catch(IOException ioe){
            System.err.println("IO Exception");
        } catch (IllegalArgumentException iae) {
            System.err.println("IAE Exception");

        }
    }


        @Override
        public String toString() {
            return listToConvert.toString();
    }
}
