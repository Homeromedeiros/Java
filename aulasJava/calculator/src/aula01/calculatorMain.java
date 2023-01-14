package aula01;

public class calculatorMain {

	public static void main(String[] args) {
		calculator c = new calculator();
		int res1 = c.add(30,10);
		System.out.println("Add = "+ res1);
		
		int res2 = c.sub(15, 8);
		System.out.println("Sub = "+ res2);
		
		int res3 = c.div(16, 8);
		System.out.println("Div = "+ res3);
		
		int res4 = c.mult(5, 8);
		System.out.println("Mult = "+ res4);
		
		int res5 = c.mod(17, 8);
		System.out.println("Mod = "+ res5);
	}
}
