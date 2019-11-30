package br.com.utfpr.beans;

public class Truck {
    
    private long id;
    private String brand;
    private String model;
    private int year;
    private String plate;
    private String chassi;
    private double gasTank;
    private int KML;
    private Driver driver;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getGasTank() {
        return gasTank;
    }

    public void setGasTank(double gasTank) {
        this.gasTank = gasTank;
    }

    public int getKML() {
        return KML;
    }

    public void setKML(int KML) {
        this.KML = KML;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return id + "-" + brand + "-" + model;
    }
    
    
    
    
}
