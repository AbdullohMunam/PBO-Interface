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
public class Main {
    public static void main(String[] args) {
        MobilBaru mobilBaru = new MobilBaru("5 Tahun", "Mazda", "RX7");
        MobilBekas mobilBekas = new MobilBekas(2014, 4000000, "Brio", "Honda");
        Dealer dealer = new Dealer("Info mobil", mobilBaru, mobilBekas);
        dealer.info();;
        
    }
}
