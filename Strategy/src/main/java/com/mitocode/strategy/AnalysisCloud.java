/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.strategy;

/**
 *
 * @author MiCalisoft
 */
public class AnalysisCloud implements IEstrategia{
        @Override
    	public void analizar() {
		conectarse();
                buscarVirus();
                detener();
	}
        
        private void conectarse(){
            try {
            System.out.print("Conectandose a la red...");
            Thread.sleep(1000);
            } catch(InterruptedException e){
            e.printStackTrace();
            }
        }
        private void buscarVirus(){
            try {
            System.out.print("Aqui buscando virus en la red...");
             Thread.sleep(1000);
            } catch(InterruptedException e){
            e.printStackTrace();
            }
        }
        private void detener(){
            try {
            System.out.print("Se encontraron dos virus: El de la gripa y el VIH");
             Thread.sleep(1000);
            } catch(InterruptedException e){
            e.printStackTrace();
            }
        }
        

}
