package demoday03.demoteamplate1.Controller;

import demoday03.demoteamplate1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public String getAll(Model model){
        model.addAttribute("products" , productService.getAllProduct());
        return "index";
    }
    @GetMapping("/products/{id}")
    public String getProduct(@PathVariable int id, Model model){
        model.addAttribute("product" , productService.getProduct(id));
        return "product-detail";
    }
}
