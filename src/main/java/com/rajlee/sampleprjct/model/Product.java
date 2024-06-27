package com.rajlee.sampleprjct.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="prod_id")
    private int prodId;
    private String prodName;
    private String prodDesc;
    private double prodPrice;
    private String imageUrl;
}
