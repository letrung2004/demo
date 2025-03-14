package com.lqt.pojo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private com.lqt.pojo.SaleOrder order;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private com.lqt.pojo.Product product;

    @ColumnDefault("0")
    @Column(name = "unit_price", precision = 10)
    private BigDecimal unitPrice;

    @ColumnDefault("0")
    @Column(name = "quantity")
    private Integer quantity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.lqt.pojo.SaleOrder getOrder() {
        return order;
    }

    public void setOrder(com.lqt.pojo.SaleOrder order) {
        this.order = order;
    }

    public com.lqt.pojo.Product getProduct() {
        return product;
    }

    public void setProduct(com.lqt.pojo.Product product) {
        this.product = product;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}