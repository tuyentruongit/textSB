package demoday03.demoteamplate1.service;

import demoday03.demoteamplate1.DAO.ProductDAO;
import demoday03.demoteamplate1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

    public List<Product> getAllProduct (){
        return  productDAO.findProduct();
    }

    public Product getProduct(int id) {
        Product product = productDAO.findProduct().stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

        return  product;
    }
}
