import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.DecimalFormat; 

public class TesteModulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("valor: ");
		Double valor = scanner.nextDouble();
		if (valor == 0) {
			System.err.println("Digite um valor válido.");
			System.exit(1);
		}
		
		System.out.print("parcelas: ");
		Integer parcela = scanner.nextInt();
		if (parcela == 0) {
			System.err.println("Digite um valor válido.");
			System.exit(1);
		}
		
		
		
		Double resultado = valor/ parcela;
		Double resto = valor % parcela;
		Double[] parcelas = new Double[13];
		Calendar c = new GregorianCalendar();
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		
		for(int i = 0; i < parcelas.length; i++) {
			if(i < (parcela - 1)) {
				c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
				System.out.println(i+1 + "ª Parcela de R$" + df.format(resultado) + " para o dia: " + formatador.format(c.getTime()));
				c.add(Calendar.MONTH, 1);
			} else if (i < parcela) {
				System.out.println(i+1 + "ª Parcela de R$" + df.format(resultado + resto) + " para o dia: " + formatador.format(c.getTime()));
			} else {
				break;
			}
									
		}
		
		scanner.close();
	}
}


