package com.lqt.pojo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "prod_tag")
public class ProdTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private com.lqt.pojo.Product product;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tag_id", nullable = false)
    private com.lqt.pojo.Tag tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.lqt.pojo.Product getProduct() {
        return product;
    }

    public void setProduct(com.lqt.pojo.Product product) {
        this.product = product;
    }

    public com.lqt.pojo.Tag getTag() {
        return tag;
    }

    public void setTag(com.lqt.pojo.Tag tag) {
        this.tag = tag;
    }

}