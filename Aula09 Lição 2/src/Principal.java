
import java.util.Scanner;

public class Principal {
    static Scanner leitor = new Scanner(System.in); 

    public static void main(String[] args) {
        Heroi h1 = new Heroi();
        int op;

        do { 
            System.out.println("----MENU----");
            System.out.println("1) Cadastrar Herói");
            System.out.println("2) Exibir dados do Herói");
            System.out.println("3) Atacar!");
            System.out.println("0) Sair");
            System.out.println("Informe uma opção:");
            op = leitor.nextInt();
            leitor.nextLine();

            switch(op){

                case 1:
                    System.out.println("Nome do herói: ");
                    h1.setNomeHeroi(leitor.nextLine());
                    System.out.println("Raça: ");
                    h1.setRaca(leitor.nextLine());
                    System.out.println("Golpe Especial: ");
                    h1.setGolpeespecial(leitor.nextLine());
                break;

                case 2:
                    if(h1.getNomeHeroi() == null){
                        System.out.println("\nCadastre um herói antes de exibir seus dados");
                    }else{
                        System.out.println(h1.toString());
                    }
                break;

                case 3:
                if(h1.getNomeHeroi() == null){
                    System.out.println("\nCadastre um herói antes de exibir seus dados");
                }else{
                    h1.atacar();
                }
                break;

                case 0:
                    System.out.println("\nO programa foi finalizado...");
                break;

                default:
                    System.out.println("\nOpção inválida, digite novamente");
                break;
        } 
        }while (op != 0);
    }
}
