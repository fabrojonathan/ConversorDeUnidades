package Conversor;

import Data.Temperatura;

public class ConversorTemperatura{

	public double Convertir(int pUnidadInicial, int pUnidadFinal, double pDigito) {
		
		Temperatura tempBase = Temperatura.values()[pUnidadInicial];
		Temperatura tempFinal = Temperatura.values()[pUnidadFinal];
		Double resultado = 0.0;
		
		if(!(tempBase == tempFinal)) {
			resultado = tempBase.convertir(pDigito, tempFinal);
		}
		
		return resultado;
	}

}
