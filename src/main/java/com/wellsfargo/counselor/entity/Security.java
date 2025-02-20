package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.sql.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Date purchaseDate;
    @Column(nullable = false)
    private long purchasePrice;
    @Column(nullable = false)
    private long quantity;
    @ManyToOne
    private Portfolio portfolio;

    public Security() {
    }

    public Security(long securityId, String name, String category, Date purchaseDate, long purchasePrice, long quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public long getSecurityId() {
        return securityId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
