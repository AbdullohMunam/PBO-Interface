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
class MobilBaru extends Mobil{
    private String garansi;

    public MobilBaru(String garansi, String merk, String model) {
        super(merk, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    @Override
    public void info() {
        System.out.println("Mobil Baru: " + getMerk() + " " + getModel() + "(Garansi: " + garansi + ")");
    }
    
    
}
