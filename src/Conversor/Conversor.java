package Conversor;

import Data.Unit;

public interface Conversor {
	
	abstract double Convertir(Unit pUnidadInicial,Unit pUnidadFinal,double pDigito);
	
}
