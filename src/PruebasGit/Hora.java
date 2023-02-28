package PruebasGit;

import java.time.LocalDateTime;

public class Hora {
	
	public String calcularHora () {
		
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		
		String horaActual = "Hora actual : " + hours  + ":"+ minutes +":"+seconds;
		
		return horaActual;
	}

}
