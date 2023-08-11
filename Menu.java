import java.sql.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Menu {

	static void cadastrarUsuario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Deseja criar um novo usuario? (sim ou nao) ");
		String opcao = scanner.next();
		
		if(opcao.equals("sim")) {
			System.out.print("Digite seu nome de usuario: ");
			String nome = scanner.next();
			System.out.print("Digite seu email: ");
			String email = scanner.next();
			System.out.print("Digite sua senha: ");
			String senha = scanner.next();
			System.out.print("Digite a data de hoje no formato (dd-MM-yyyy): ");
			String data = scanner.next();
			System.out.print("Escolha o seu cargo (1)-Convidado ; (2)-Admin ");
			String cargo = scanner.next();
			if(cargo.equals("1")) {
				cargo = ("Convidado");
			}
			else if(cargo.equals("2")) {
				cargo = ("Admin");
			}
			
			SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
	        Date date = null;

	        try {
	            date = (Date) inputFormat.parse(data);
	            System.out.println("Data convertida: " + date);
	        } catch (ParseException e) {
	            System.out.println("Erro na conversão da data: " + e.getMessage());
	        }
	        
	        Usuario usuario = new Usuario()
		}
	}
	
	static void loginUsuario() {
		
	}
	
	static void verPosts() {
		
	}
	
	static void criarPost() {
		
	}
	
	static void comentarPost() {
		
	}
	
	static void verComentarios() {
		
	}
	
	static void apagarPost() {
		
	}
	
	static void apagarComentario() {
		
	}
}
