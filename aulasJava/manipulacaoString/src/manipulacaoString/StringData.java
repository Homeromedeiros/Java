package manipulacaoString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringData {
	public static void main(String[] args) {
		/*String nome = "Homero";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.length());
		
		String nome2 = "Jose";
		System.out.println(nome.equals(nome2));
		*/
		
		//ISO 8601
		
		String nome = "Homero";
		LocalDate hoje = LocalDate.now();
		Locale brasil = new Locale("pt", "BR");
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil));
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL,brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		if (agora.getHour()>=0 && agora.getHour()<12) {
			saudacao = "Bom Dia!";
		}else if (agora.getHour()>=12 && agora.getHour()<18){
			saudacao = "Boa Tarde";
		}else if (agora.getHour()>=18 && agora.getHour()<24) {
			saudacao = "Boa Noite";	
		}else {
			saudacao = "Olá";
		}
		System.out.printf("Ola, %s. Hoje é %s, %s.%n",nome, diaSemana, saudacao.toLowerCase());
	}
}
