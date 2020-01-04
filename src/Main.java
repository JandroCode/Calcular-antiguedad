import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calcularAntiguedad(1, 1, 1977));
		
	}
	
	public static int calcularAntiguedad(int dia, int mes, int agno) {
		
		Calendar inicio = Calendar.getInstance();
		inicio.set(agno, mes-1, dia);
		
		Calendar actual = Calendar.getInstance();
		
		int diferencia = actual.get(Calendar.YEAR) - inicio.get(Calendar.YEAR);
		
		if(inicio.get(Calendar.DAY_OF_YEAR)>actual.get(Calendar.DAY_OF_YEAR)) {
			diferencia--;
		}
		
		return diferencia;
	}

}
