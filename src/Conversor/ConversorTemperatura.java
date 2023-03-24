package Conversor;

import Data.Temperatura;

public class ConversorTemperatura{

	public double Convertir(Temperatura pUnidadInicial, Temperatura pUnidadFinal, double pDigito) {
		
		double Resultado;		
		
		Resultado = pUnidadInicial.convertir(pDigito, pUnidadFinal);
		
		return Resultado;
	}

}
