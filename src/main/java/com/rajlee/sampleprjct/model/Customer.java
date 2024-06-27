package com.rajlee.sampleprjct.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    private int customerId;
    private String customerName;
    private String customerAddress;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_prod_id")

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_customer_id",referencedColumnName = "customer_id")
    private List<Product> products;
}
