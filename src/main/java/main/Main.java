package main;

import converters.Converter;
import converters.ConverterFactory;
import models.Admin;
import models.Model;
import models.User;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static utils.Constants.*;

public class Main {

    public static void main(String[] args) throws Exception {


        User model = new User("Artsiom", "Skliar", "artsiom.sk@gmail.com", 22);
        User model2 = new User("Rameen", "Rastan-Vadiveloo", "rameen.rastan@munvo.com", 25);
        User model5 = new User("Philippe", "Kwan", "phil.kwan@munvo.com", 24);



        Admin model3 = new Admin("David", "Parr", "david.parr@munvo.com", 31, false);
        Admin model4 = new Admin("David", "Gilbert", "david.gilbert@munvo.com", 22, true);



        List<Model> listToConvertUsers = new ArrayList<>();
        listToConvertUsers.add(model);
        listToConvertUsers.add(model2);
        listToConvertUsers.add(model5);

        List<Model> listToConvertAdmins = new ArrayList<>();
        listToConvertAdmins.add(model3);
        listToConvertAdmins.add(model4);

        Converter csvConverterForUser = ConverterFactory.getConverter(CONVERTER_FORMATS.CSV, listToConvertUsers);
        Converter csvConverterForAdmin = ConverterFactory.getConverter(CONVERTER_FORMATS.CSV, listToConvertAdmins);

        csvConverterForUser.convert((Paths.get(PATH_OUTPUT_CSV_USER)));
        csvConverterForAdmin.convert(Paths.get(PATH_OUTPUT_CSV_ADMIN));

    }
}
