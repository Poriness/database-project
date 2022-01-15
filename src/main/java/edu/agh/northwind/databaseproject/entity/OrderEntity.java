package edu.agh.northwind.databaseproject.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Orders")
public class OrderEntity implements Serializable {

    @Id
    private short orderId;
    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = "bpchar")
    private CustomerEntity customer;
    private short employeeId; //todo change for reference
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private short shipVia; //todo change for reference
    private double freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

}
