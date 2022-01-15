package edu.agh.northwind.databaseproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Order_details")
public class OrderDetailsEntity implements Serializable {

    @Id //todo here theres compund pk
    private short orderId;
    private short productId;
    private double unitPrice;
    private short quantity;
    private double discount;

}
