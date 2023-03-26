package Conversor;

import Data.Longitud;
import Data.Unit;

public class ConversorLongitud implements Conversor{

	@Override
	public double Convertir(Unit pUnidadInicial, Unit pUnidadFinal, double pDigito) {
		
		Longitud vUnidadInicial = ((Longitud)pUnidadInicial);
		Longitud vUnidadFinal = ((Longitud)pUnidadFinal);
		double DifUnidades;
		double ResultConversion = 0;
		
		if (!(vUnidadInicial == vUnidadFinal)) {
			DifUnidades = vUnidadInicial.compareTo(vUnidadFinal);
			ResultConversion = pDigito * Math.pow(10, (DifUnidades));
		}
		return ResultConversion;
	}
	
}
