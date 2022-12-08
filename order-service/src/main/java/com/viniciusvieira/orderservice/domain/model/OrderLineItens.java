package com.viniciusvieira.orderservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "tb_order_line_itens")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class OrderLineItens {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_line_itens")
    @Id
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
