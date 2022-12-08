package com.viniciusvieira.product.service.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "tb_product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}
