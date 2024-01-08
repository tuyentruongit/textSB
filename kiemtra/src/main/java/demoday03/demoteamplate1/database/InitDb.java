package demoday03.demoteamplate1.database;

import com.opencsv.exceptions.CsvException;
import demoday03.demoteamplate1.Untils.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class InitDb implements CommandLineRunner {
    @Autowired
    private  IFileReader iFileReader;

    @Override
    public void run(String... args) throws Exception {

        ProductDb.productList= iFileReader.readFile("pro.csv");

        System.out.println(ProductDb.productList.size());
    }
}
