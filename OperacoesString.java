/* @Autora: Thais Gabriele Cardoso do Nascimento 
 * @Data: 20/10/2016 
 * Description:  le uma string digitada pelo usuário. Em seguida, imprime as seguintes informações sobre a s
 * tring, necessariamente na ordem indicada nos cometários abaixo*/
import java.util.Scanner;

public class OperacoesString {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String nome;
		char primChar, ultChar;
		int cont = 0, Size;

		//Usuario digita o nome
		nome = scan.nextLine();
		
		//Quantidade de caracteres da string
		Size = nome.length(); 

		System.out.println(Size);
		
		//Primeiro caractere da string
		primChar = nome.charAt(0);
		System.out.println(primChar);
		
		//Último caractere da string
		ultChar = nome.charAt(Size-1);
		System.out.println(ultChar);
		
		//Conversão da string em caracteres maiúsculos
		String Upper = nome.toUpperCase();
		System.out.println(Upper);
		
		//Conversão da string em caracteres minúsculos
		String Lower = nome.toLowerCase();
		System.out.println(Lower);
		
		//Substituição de todas as letras "a" por "e"
		String nomeAlterado = nome.replace('a', 'e');
		System.out.println(nomeAlterado);
		
		 //Impressão dos caracteres com índices pares
		for (int j = 0; j < Size; j++){
			if (j % 2 == 0){
				System.out.print(nome.charAt(j));
			}
		}
		System.out.println();
		 //Quantidade de vogais na string
		for (int i = 0; i < Size; i++){
			if ((nome.charAt(i) == 'a') || (nome.charAt(i) == 'e') || (nome.charAt(i) == 'i') ||
					(nome.charAt(i) == 'o') || (nome.charAt(i) == 'u') || (nome.charAt(i) == 'A') || 
					(nome.charAt(i) == 'E') || (nome.charAt(i) == 'I') ||
					(nome.charAt(i) == 'O') || (nome.charAt(i) == 'U') )
				    cont++;
		}
		System.out.println(cont);
		scan.close();
	}
}	

