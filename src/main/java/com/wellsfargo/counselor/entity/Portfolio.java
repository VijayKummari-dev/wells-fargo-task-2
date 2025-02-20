package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;
    @Column(nullable = false)
    private Date creationDate;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "portfolio")
    private List<Security> securityList;
    public Portfolio() {
    }

    public Portfolio(long portfolioId, Date creationDate, Client client) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }



    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurityList() {
        return securityList;
    }

    public void setSecurityList(List<Security> securityList) {
        this.securityList = securityList;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "portfolioId=" + portfolioId +
                ", creationDate=" + creationDate +
                ", client=" + client +
                ", securityList=" + securityList +
                '}';
    }
}
