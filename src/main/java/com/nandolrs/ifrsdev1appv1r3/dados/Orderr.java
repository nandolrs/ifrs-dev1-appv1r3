package com.nandolrs.ifrsdev1appv1r3.dados;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Orderr {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer id;

    Date moment;
    Integer orderStatus;


    @OneToMany (cascade =  CascadeType.ALL)
    @OrderColumn
    List<OrderItem> items;

    // id

    public Integer getId()
    {
        return this.id;
    }
    public void setId(Integer valor)
    {
        this.id=valor;
    }

    // moment

    public Date getMoment()
    {
        return moment;
    }
    public void setMoment(Date valor)
    {
        moment=valor;
    }

    // orderStatus

    public Integer getOrderStatus()    {        return orderStatus;    }
    public void setOrderStatus(Integer valor)    {        orderStatus=valor;    }

    // items

    public List<OrderItem> getItems() {        return items;    }
    public void setItems(List<OrderItem> items) {        this.items = items;    }

}
