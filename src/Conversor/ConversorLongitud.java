package Conversor;

import Data.Longitud;

public class ConversorLongitud implements Conversor{

	@Override
	public double Convertir(int pUnidadInicial, int pUnidadFinal, double pDigito) {
		Longitud vUnidadInicial = Longitud.values()[pUnidadInicial];
		Longitud vUnidadFinal = Longitud.values()[pUnidadFinal];
		double difUnidades;
		double resultConversion = 0;
		
		if (!(vUnidadInicial == vUnidadFinal)) {
			difUnidades = vUnidadInicial.compareTo(vUnidadFinal);
			resultConversion = pDigito * Math.pow(10, (difUnidades));
		}
		//System.out.println((int)resultConversion+ " " + Longitud.values()[pUnidadFinal].name() + "s");
		return resultConversion;
	}
	
}
