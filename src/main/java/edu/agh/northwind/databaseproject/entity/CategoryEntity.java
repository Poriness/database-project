package edu.agh.northwind.databaseproject.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"products"})
@ToString(exclude = {"products"})
@Getter
@Table(name = "Categories")
public class CategoryEntity {
    @Id
    private short categoryId;
    @NotNull
    private String categoryName;
    private String Description;

    //Picture

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<ProductEntity> products;
}
