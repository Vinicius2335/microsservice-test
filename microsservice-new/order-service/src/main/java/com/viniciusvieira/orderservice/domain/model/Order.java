package com.viniciusvieira.orderservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "tb_orders")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    @Id
    private Long id;
    private String orderNumber;

    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderLineItens> orderLineItensList;
}
