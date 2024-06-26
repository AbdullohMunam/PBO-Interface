/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.interface_database;

/**
 *
 * @author A-11
 */

// Penggunaan dalam aplikasi
public class Main {

    public static void main(String[] args) {
        // Contoh penggunaan MemoryStorage
        DataStorege memoryStorage = new MemoryStorage();
        memoryStorage.writeData("Data stored in memory");
        System.out.println("Memory storage: " + memoryStorage.readData());
// Contoh penggunaan FileStorage
        DataStorege fileStorage = new FileStorage("data.txt");
        fileStorage.writeData("Data stored in file");
        System.out.println("File storage: " + fileStorage.readData());

        // Contoh penggunaan DatabaseStorage
        DataStorege databaseStorage = new DatabaseStorage("database.db");
        databaseStorage.writeData("Data stored in database");
        System.out.println("Database storage: " + databaseStorage.readData());
    }
}
