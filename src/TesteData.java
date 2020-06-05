import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		for(int i = 0; i <= 11; i++) {
			c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println("teste " + formatador.format(c.getTime()));
			c.add(Calendar.MONTH, 1);
		}
		
	}
}
