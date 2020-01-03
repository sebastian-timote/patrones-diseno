package com.mitocode;

import com.mitocode.strategy.AntivirusAvanzado;
import com.mitocode.strategy.Contexto;
import com.mitocode.strategy.AnalysisCloud;

public class App {
	
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AnalysisCloud());
		contexto.ejecutar();
	}

}
