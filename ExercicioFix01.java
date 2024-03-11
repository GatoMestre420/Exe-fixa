import java.util.Scanner;

public class ExercicioFix01 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = leitor.nextLine();
        System.out.println("Infomre o número da matricula: ");
        int mat = leitor.nextInt();
        System.out.println("Informe a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.println("Informe a segunda nota: ");
        float nota2 = leitor.nextFloat();

        float notafinal = (nota1 + nota2)/2;

        System.out.println("\n\n\n");

        if(notafinal > 6){
            System.out.println("Matricula: " + mat);
            System.out.println("Nome: " + nome);
            System.out.println("Aprovado: (X) SIM ( ) NÃO");
            System.out.println("Nota Final: " + notafinal);
        }else{
            System.out.println("Matricula: " + mat);
            System.out.println("Nome: " + nome);
            System.out.println("Aprovado: ( ) SIM (X)  NÃO");
            System.out.println("Nota Final: " + notafinal);

        }
        


    }

}
