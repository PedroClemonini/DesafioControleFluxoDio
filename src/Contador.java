import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Lembre-se o primeiro número deve ser menor que o segundo!");

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int um, int dois) throws ParametrosInvalidosException{

        if(um>dois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = dois-um;
            for(int i = 0;i<=contagem;i++){
                System.out.println("Imprimindo número "+(i+1)+": "+ (um+i));
            }
        }

    }
}