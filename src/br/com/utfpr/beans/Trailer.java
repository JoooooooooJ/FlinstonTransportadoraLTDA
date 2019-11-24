package br.com.utfpr.beans;

public class Trailer {
    
    private long id;
    private String brand;
    private String model;
    private int year;
    private String plate;
    private long capKG;
    private long chassi;
    private String type;

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

    public long getCapKG() {
        return capKG;
    }

    public void setCapKG(long capKG) {
        this.capKG = capKG;
    }
    public long getChassi() {
        return chassi;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
