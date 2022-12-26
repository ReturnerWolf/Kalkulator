package com.example.tugaskalkulator;

public class Operator {
    private String nama;

    public Operator(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }

    public String getNama() {
        return nama;
    }
}
