import java.time.LocalTime;
import java.util.Scanner;

public class q4 {
        public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
       
        int hora = horaAtual.getHour();
        System.out.println(hora);

        if (hora >= 6 && hora < 12) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde, " + nome + "!");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Boa noite, " + nome + "!");
        } else {
            System.out.println("Vai dormir, " + nome + "!");
        }

        scanner.close();
    }
}
