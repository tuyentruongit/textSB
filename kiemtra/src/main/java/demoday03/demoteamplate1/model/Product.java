package demoday03.demoteamplate1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private String description;
    private String thumbnail;
    private int price;
    private double rating;
    private int priceDiscount;
}
