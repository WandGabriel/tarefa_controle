import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** ------ Cálculo de Média ------***");

        Integer quantidadeDeNotas = 4;
        Float primeiraNota = 0f;
        Float segundaNota = 0f;
        Float terceiraNota = 0f;
        Float quartaNota = 0f;
        Float somaDasNotas = 0f;

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        primeiraNota = entradaDeDados.nextFloat();
        System.out.print("Digite a segunda nota: ");
        segundaNota = entradaDeDados.nextFloat();
        System.out.print("Digite a terceira nota: ");
        terceiraNota =  entradaDeDados.nextFloat();
        System.out.print("Digite a quarta nota: ");
        quartaNota = entradaDeDados.nextFloat();

        somaDasNotas = calcularMedia(primeiraNota, segundaNota, terceiraNota, quartaNota, quantidadeDeNotas);
        exibirStatusDeaprovacao(somaDasNotas);

    }

    public static Float calcularMedia(Float primeiraNota, Float segundaNota, Float terceiraNota, Float quartaNota, Integer quantidadeDeNotas) {
        float somaDasNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota) / quantidadeDeNotas;
        return somaDasNotas;

    }

    public static void exibirStatusDeaprovacao(Float somaDasNotas) {
        if (somaDasNotas >= 7) {
            System.out.println("*** ---- Status do Aluno ---- ***");
            System.out.println("Nota: " + somaDasNotas);
            System.out.println("Aluno aprovado");
        } else if (somaDasNotas >= 5 || somaDasNotas < 7) {
            System.out.println("*** ---- Status do Aluno ---- ***");
            System.out.println("Nota: " + somaDasNotas);
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("*** ---- Status do Aluno ---- ***");
            System.out.println("Nota: " + somaDasNotas);
            System.out.println("Aluno reprovado");
        }
    }
}