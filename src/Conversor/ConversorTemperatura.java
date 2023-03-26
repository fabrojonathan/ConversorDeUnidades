package Conversor;

import Data.Temperatura;
import Data.Unit;

public class ConversorTemperatura{

	public double Convertir(Unit pUnidadInicial, Unit pUnidadFinal, double pDigito) {
		
		Temperatura TempBase = ((Temperatura)pUnidadInicial);
		Temperatura TempFinal = ((Temperatura)pUnidadFinal);
		Double Resultado = 0.0;
		
		if(!(TempBase == TempFinal)) {
			Resultado = TempBase.convertir(pDigito, TempFinal);
		}
		
		return Resultado;
	}

}
