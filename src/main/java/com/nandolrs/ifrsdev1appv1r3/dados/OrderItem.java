package com.nandolrs.ifrsdev1appv1r3.dados;

import org.hibernate.criterion.Order;

import javax.persistence.*;


@Entity // This tells Hibernate to make a table out of this class
public class OrderItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;

    Integer quantity;
    Double price;

    @OneToOne
    Product product;

    @ManyToOne
    Orderr order;

    // id

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer valor)
    {
        this.id=valor;
    }

    // quantity

    public void setQuantity(Integer valor) {
        this.quantity = valor;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    // price

    public Double getPrice() {        return this.price;    }
    public void setPrice(Double valor) {
        this.price = valor;
    }

    // product

    public Product getProduct() {        return this.product;    }
    public void setProduct(Product valor) {
        this.product = valor;
    }


    // order

    public Orderr getOrder() {        return this.order;    }
    public void setOrder(Orderr valor) {
        this.order = valor;
    }

    // subTotal

    public Double SubTotal()
    {
        return quantity*price;
    }

}
