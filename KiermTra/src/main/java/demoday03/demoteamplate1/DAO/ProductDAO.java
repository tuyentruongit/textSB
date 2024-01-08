package demoday03.demoteamplate1.DAO;

import demoday03.demoteamplate1.database.ProductDb;
import demoday03.demoteamplate1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {
    public List<Product> findProduct() {
        return ProductDb.productList;
    }
}
