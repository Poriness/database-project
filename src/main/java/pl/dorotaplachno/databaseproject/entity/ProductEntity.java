package pl.dorotaplachno.databaseproject.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Table(name = "Products")
public class ProductEntity {
    @Id
    private short productId;
    @NotNull
    private String productName;
    private String quantityPerUnit;
    private Float unitPrice;
    private short unitsInStock;
    private short unitsOnOrder;
    private short reorderLevel;
    private Integer discontinued;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private SupplierEntity supplier;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
