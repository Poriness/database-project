package edu.agh.northwind.databaseproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Customers")
@EqualsAndHashCode(exclude = {"orders"})
@ToString(exclude = {"orders"})
public class CustomerEntity implements Serializable {

    @Id
    @Column(columnDefinition = "bpchar") //hibernate-validation has problem with `bpchar` type
    private String customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phone;
    private String fax;

    @OneToMany(mappedBy = "customer")
    private List<OrderEntity> orders;

}
