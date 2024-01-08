package demoday03.demoteamplate1.Untils;

import demoday03.demoteamplate1.model.Product;

import java.io.FileNotFoundException;
import java.util.List;

public interface IFileReader {
    List<Product> readFile (String filePath) throws FileNotFoundException;
}
