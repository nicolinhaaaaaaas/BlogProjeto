import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Escolhas();
			int opcao = scanner.nextInt();
			
			switch(opcao) {
			
			case 1:
				Menu.cadastrarUsuario();
			break;
			
			case 2:
				Menu.loginUsuario();
			break;
			
			case 0:
				System.out.println("Encerrando...");
				return;
				
			default:
				System.out.println("opcao invalida");
			break;
			}
		}
	}
	
	static void Escolhas() {
		System.out.println("Bem vindo ao blog Marinho");
		System.out.println("O que deseja fazer?");
		System.out.println("1- Cadastrar uma nova conta");
		System.out.println("2- Login em uma conta existente\n");
		System.out.println("0- Sair\n");
	}
	
	
	
	

}
