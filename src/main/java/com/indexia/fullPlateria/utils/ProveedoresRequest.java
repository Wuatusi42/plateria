package com.indexia.fullPlateria.utils;

import java.util.Date;

public class ProveedoresRequest {
    private String name;
    private String ubicasion;
    private String phone;
    private String correo;
    private Date dateRegister;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUbicasion() {
        return ubicasion;
    }

    public void setUbicasion(String ubicasion) {
        this.ubicasion = ubicasion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }
}
