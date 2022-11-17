
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*boolean fimDeSemana = true;
		boolean fazendoSol = true;
		boolean vamosAPraia = fimDeSemana && fazendoSol;
		System.out.println(vamosAPraia);
		
		String mensagem = fimDeSemana ? "E fim de semana" : "Nao e fim de semana";
		System.out.println(mensagem);
		*/
		
		int nota = 10;
		String grad;
		
		if (nota >= 80) {
			grad = "A";
		}else if (nota < 80 && nota >= 70) {
			grad = "B";
		}else if (nota < 70 && nota >= 60) {
			grad = "C";
		}else if (nota < 60 && nota >= 0) {
			grad = "D";
		}else {
			grad = "";
		}
		
		switch (grad) {
			case "A":
			case "B":
				System.out.println("Aluno Aprovado!");
				break;
			case "C":
			case "D":
				System.out.println("Aluno nao Aprovado!");
				break;
			default:
				System.out.println("Graduacao Invalida!");
		}
	}
}
