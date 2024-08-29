import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(pessoa);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(pessoa);
            } else {
                System.out.println("Sexo inválido! Tente novamente.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (Pessoa p : masculino) {
            System.out.println(p.getNome());
        }

        System.out.println("\nGrupo Feminino:");
        for (Pessoa p : feminino) {
            System.out.println(p.getNome());
        }

        scanner.close();
    }
}
    

