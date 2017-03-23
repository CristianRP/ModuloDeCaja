/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.modulodecaja.handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cramirez
 */
public class HandlerCliente {
    
    private HandlerCliente() {
    }
    
    public static HandlerCliente getInstance() {
        return ReadFileUtilHolder.INSTANCE;
    }
    
    private static class ReadFileUtilHolder {

        private static final HandlerCliente INSTANCE = new HandlerCliente();
    }
    
    public void makeFileClient() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("clientes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(HandlerCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }   
    }
}
