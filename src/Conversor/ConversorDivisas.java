package Conversor;

import Data.*;
import java.io.IOException;
import java.util.Properties;

public class ConversorDivisas implements Conversor{
	
	private double HallarValorConversion(Unit pUnidadInicial, Unit pUnidadFinal) {
		
		String UnidadInicial = ((Divisa)pUnidadInicial).name();
		String UnidadFinal = ((Divisa)pUnidadFinal).name();
		String ValorConversion = new StringBuilder(UnidadInicial).append("_").append(UnidadFinal).toString();
		
		Properties properties = new Properties();
		try {
			properties.load(ConversorDivisas.class.getResourceAsStream("/Data/Valores.properties"));
		} catch (IOException e) { e.printStackTrace();}
		
		return Double.parseDouble(properties.getProperty(ValorConversion));
	}

	@Override
	public double Convertir(Unit pUnidadInicial, Unit pUnidadFinal, double pDigito) {
		
		double ValorConversion = HallarValorConversion(pUnidadInicial, pUnidadFinal);
		return pDigito * ValorConversion;
	}
}
