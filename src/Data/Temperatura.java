package Data;

public enum Temperatura{
	Celsius{
		public double convertir(double pTemperatura, Temperatura pFinal) {
			switch(pFinal) {
			
			case Kelvin:
				return pTemperatura + 273.15;
				
			case Fahrenheit:
				return ((pTemperatura * 1.8) + 32);
				
			case Rankine:
				return (pTemperatura * 1.8) + 491.67;
				
			default:
				return 0;
			}
		}
	},
	Kelvin{
		public double convertir(double pTemperatura, Temperatura pFinal) {
			switch(pFinal) {

			case Celsius:
				return pTemperatura - 273.15;
				
			case Fahrenheit:
				return (1.8 * (pTemperatura - 273.15) + 32);
				
			case Rankine:
				return pTemperatura * 1.8;
			
			default:
				return 0;
			}
		}
	},
	Fahrenheit{
		public double convertir(double pTemperatura, Temperatura pFinal) {
			switch(pFinal) {
			
			case Celsius:
				return (pTemperatura - 32) / 1.8;
				
			case Kelvin:
				return ((pTemperatura - 32)/1.8) + 273.15;
				
			case Rankine:
				return pTemperatura * 1.8;
				
			default:
				return 0;
			
			}
		}
	},
	Rankine{
		public double convertir(double pTemperatura, Temperatura pFinal) {
			switch(pFinal) {
			
			case Celsius:
				return (pTemperatura - 491.67) * 5.0/9.0;
				
			case Kelvin:
				return ((pTemperatura - 491.67) / 1.8) + 273.15;
				
			case Fahrenheit:
				return pTemperatura - 459.67;
				
			default:
				return 0;
			
			}
		}
	};
	
	public abstract double convertir(double pTemperatura, Temperatura pFinal);
}
