
public class Programa {

	public static void main(String[] args) {
		Conta c1  = new Conta("123", 50);
		Conta c2  = new Conta("456", 200);
		Conta c3  = new Conta("123", 50);
		Conta c4 = null;
		
		if (c1 == c2) {
			System.out.println("c1 e c2 sao iguais!!");
		}
		
		if ( c1.equals(c4) ) {
			System.out.println("c1 e c4 sao iguais!!");
		}

		if (c2 == c3) {
			System.out.println("c2 e c3 sao iguais!!");
		}

		System.out.println("Fim do programa!!");
		
		System.out.println("Conta c2: " + c2);
		System.out.println("Conta c3: " + c3);
		
//		boolean tranferiu = c1.transferir(60, c2);
//		
//		System.out.println("Saldo de c1: " + c1.getSaldo());
//		System.out.println("Saldo de c2: " + c2.getSaldo());
//		System.out.println("Transferencia efetuada: " + tranferiu);
	}

}
