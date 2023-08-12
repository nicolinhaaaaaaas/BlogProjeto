import java.sql.Date;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Menu {
	
	static ArrayList<Usuario> usuarios = new ArrayList<>();

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
			//System.out.print("Digite a data de hoje no formato (dd-MM-yyyy): ");
			//String data = scanner.next();
			System.out.print("Escolha o seu cargo (1)-Convidado ; (2)-Admin ");
			String cargo = scanner.next();
			
			CargoUsuario escolha = null;
			
			if(cargo.equals("2")) {
				escolha = CargoUsuario.ADMIN;
			}
			else if(cargo.equals("1")) {
				escolha = CargoUsuario.CONVIDADO;
			}
			
			/*SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
	        Date date = null;

	        try {
	            date = (Date) inputFormat.parse(data);
	            System.out.println("Data convertida: " + date);
	        } catch (ParseException e) {
	            System.out.println("Erro na conversão da data: " + e.getMessage());
	        } */
	        
	        int id = usuarios.size() +1;
	        
	        Usuario usuario = new Usuario(id, nome, email, senha,  escolha);
	        
	        usuarios.add(usuario);
	        
	        System.out.println(usuario);
	        
	        System.out.println(usuarios);
	        
	        
		}
		
		else {
			System.out.println("ok lol");
		}
		
		scanner.close();
	}
	
	static void loginUsuario() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu login: ");
		String login = scanner.next();
		System.out.print("Digite sua senha: ");
		String senha = scanner.next();
		
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
