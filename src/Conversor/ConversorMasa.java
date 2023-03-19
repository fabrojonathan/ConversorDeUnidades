package Conversor;

import Data.Masa;

public class ConversorMasa implements Conversor{

	@Override
	public double Convertir(int pUnidadInicial, int pUnidadFinal, double pDigito) {
		Masa vUnidadInicial = Masa.values()[pUnidadInicial];
		Masa vUnidadFinal = Masa.values()[pUnidadFinal];
		double difUnidades;
		double resultConversion = 0;
		
		if (!(vUnidadInicial == vUnidadFinal)) {
			difUnidades = vUnidadInicial.compareTo(vUnidadFinal);
			resultConversion = pDigito * Math.pow(10, (difUnidades));
		}
		
		//System.out.println(resultConversion+ " " + Masa.values()[pUnidadFinal].name() + "s");

		return resultConversion;
	}

}
