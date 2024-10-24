package com.indexia.fullPlateria.utils;

import com.indexia.fullPlateria.model.entity.Roles;

import java.util.Date;

public class UsuariosRequest {
    private String nameUser;
    private String ubicasion;
    private String phone;
    private String correo;
    private String constrasena;
    private Date dateRegister;
    private Roles rolFk;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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

    public String getConstrasena() {
        return constrasena;
    }

    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Roles getRolFk() {
        return rolFk;
    }

    public void setRolFk(Roles rolFk) {
        this.rolFk = rolFk;
    }
}
