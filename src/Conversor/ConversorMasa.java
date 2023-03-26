package Conversor;

import Data.Masa;
import Data.Unit;

public class ConversorMasa implements Conversor{

	@Override
	public double Convertir(Unit pUnidadInicial, Unit pUnidadFinal, double pDigito) {
		
		Masa vUnidadInicial = ((Masa)pUnidadInicial);
		Masa vUnidadFinal = ((Masa)pUnidadFinal);
		double DifUnidades;
		double ResultConversion = 0;
		
		if (!(vUnidadInicial == vUnidadFinal)) {
			DifUnidades = vUnidadInicial.compareTo(vUnidadFinal);
			ResultConversion = pDigito * Math.pow(10, (DifUnidades));
		}

		return ResultConversion;
	}

}
