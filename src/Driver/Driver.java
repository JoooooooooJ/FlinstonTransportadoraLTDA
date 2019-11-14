package Driver;

import java.util.Calendar;
import util.Address;

public class Driver {
    
    private long id;
    private String name;
    private String phone;
    private long RG;
    private long CPF;
    private String email;
    private long CNHnum;
    private char CNHtype;
    private Calendar expiration;
    private boolean status;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCNHnum() {
        return CNHnum;
    }

    public void setCNHnum(long CNHnum) {
        this.CNHnum = CNHnum;
    }

    public char getCNHtype() {
        return CNHtype;
    }

    public void setCNHtype(char CNHtype) {
        this.CNHtype = CNHtype;
    }

    public Calendar getExpiration() {
        return expiration;
    }

    public void setExpiration(Calendar expiration) {
        this.expiration = expiration;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }    
    
    
            
    
}
