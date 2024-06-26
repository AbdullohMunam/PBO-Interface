/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.interface_database;

import java.util.ArrayList;

/**
 *
 * @author A-11
 */
public class MemoryStorageArray implements DataStorege {

    private ArrayList<String> data;

    public MemoryStorageArray() {
        this.data = new ArrayList<>();
    }

    @Override
    public void writeData(String data) {
        this.data.add(data);
    }

    @Override
    public String readData() {
        StringBuilder sb = new StringBuilder();
        for (String item : this.data) {
            sb.append(item);
        }
        return sb.toString();
    }

}
