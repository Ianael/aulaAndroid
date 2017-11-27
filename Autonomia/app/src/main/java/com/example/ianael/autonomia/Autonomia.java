package com.example.ianael.autonomia;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ianael on 26/11/2017.
 */

public class Autonomia {
    private String data;
    private double km;
    private double l;
    private String posto;

    public static ArrayList<Autonomia> info = new ArrayList<>();

    public Autonomia(String data, double km, double l, String posto){
        this.data = data;
        this.km = km;
        this.l = l;
        this.posto = posto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double kilometragem) {
        this.km = kilometragem;
    }

    public double getL() {
        return l;
    }

    public void setL(double litros) {
        this.l = litros;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }
}
