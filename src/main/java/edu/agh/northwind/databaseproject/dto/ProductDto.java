package edu.agh.northwind.databaseproject.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@ToString
public class ProductDto {
    private short productId;
    private String productName;
    private String quantityPerUnit;
    private Float unitPrice;
    private short unitsInStock;
    private short unitsOnOrder;
    private short reorderLevel;
    private Integer discontinued;
}
