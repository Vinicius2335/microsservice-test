package com.viniciusvieira.inventoryservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tb_inventory")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Inventory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventory")
    @Id
    private Long id;
    private String skuCode;
    private Integer quantity;
}
