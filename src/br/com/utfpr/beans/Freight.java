package br.com.utfpr.beans;

import java.util.Calendar;

public class Freight {
    
    private Long id;
    private String service;
    private Truck truck;
    private Trailer trailer;
    private String origin;
    private String destination;
    private String Cargo;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
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
