package br.com.utfpr.beans;

import java.util.Calendar;

public class Freight {
    
    private Long id;
    private String service;
    private Truck truck;
    private Trailer trailer;
    private Origin origin;
    private Destination destination;
    private Product Cargo;
    private Driver driver;
    private Calendar exitDate;
    private Double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }  
    
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Product getCargo() {
        return Cargo;
    }

    public void setCargo(Product Cargo) {
        this.Cargo = Cargo;
    }
    
    

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Calendar getExitDate() {
        return exitDate;
    }

    public void setExitDate(Calendar exitDate) {
        this.exitDate = exitDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
    
}
