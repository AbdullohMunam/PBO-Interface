/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.interface_kendaraan;

/**
 *
 * @author A-11
 */
public class Mobil implements Kendaraan{

    private String merk;
    private String model;

    public Mobil(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }
    
    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + merk + " " + model);
    }
    
    
}
