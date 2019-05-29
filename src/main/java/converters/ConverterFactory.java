package converters;

import models.Model;
import utils.Constants;

import java.util.List;

public class ConverterFactory {

    public static Converter getConverter(Enum converterFormat, List<Model> modelsToConvert) {

        if (converterFormat == Constants.CONVERTER_FORMATS.CSV) {
            return new CSVConverter(modelsToConvert);
        }

        return null;
    }

}
