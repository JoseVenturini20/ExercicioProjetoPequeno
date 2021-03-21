import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String args[]) throws IOException {
        CatalogoVeiculos c = new CatalogoVeiculos();
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("\n\n### Sistema de busca de veiculos ###");
            System.out.println("\n                  ==============================");
            System.out.println("                  |     1 - Busca por placa       |");
            System.out.println("                  |     2 - Busca por Marca       |");
            System.out.println("                  |     3 - Busca por Ano         |");
            System.out.println("                  |     4 - Busca por Tipo        |");
            System.out.println("                  |     0 - Sair                  |");
            System.out.println("                  ================================\n");

            int opcao = Integer.parseInt(menu.nextLine());

            if (opcao == 0) {
                return;
            }

            switch (opcao) {
            case 1:
                System.out.println("Informe a placa");
                String placa = menu.nextLine();
                c.consultaPorPlaca(placa);
                break;
            case 2:
                System.out.println("Informe a marca");
                String marca = menu.nextLine();
                c.consultaPorMarca(marca);
                break;
            case 3:
                System.out.println("Informe a Ano");
                String Ano = menu.nextLine();
                c.consultaPorAno(Integer.parseInt(Ano));
                break;
            case 4:
                System.out.println("\n\n### Informe o tipo ###");
                System.out.println("\n                  ====================================");
                System.out.println("                  |     1 - Veiculo de Passageiro       |");
                System.out.println("                  |     2 - Veiculo de Passeio          |");
                System.out.println("                  |     3 - Veiculo Utilitario          |");
                System.out.println("                  =======================================\n");
                String tipo = menu.nextLine();
                if(tipo.equals("1")){
                    c.consultaPorTipo("VeiculoPassageiro");
                }
                else if(tipo.equals("2")){
                    c.consultaPorTipo("VeiculoPasseio");
                }
                else if(tipo.equals("3")){
                    c.consultaPorTipo("VeiculoUtilitario");
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
            }
            System.out.println("Insira uma digito para continuar as buscas");
            String continuar = menu.nextLine();
        }

    }
}
