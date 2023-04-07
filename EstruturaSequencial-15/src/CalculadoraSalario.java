import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o valor por hora
        System.out.print("Digite o valor por hora: R$ ");
        double valorPorHora = scanner.nextDouble(); // Lê o valor por hora digitado pelo usuário

        // Solicitar ao usuário que insira o número de horas trabalhadas no mês
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble(); // Lê o número de horas trabalhadas digitado pelo usuário

        // Cálculos
        double salarioBruto = valorPorHora * horasTrabalhadas; // Calcula o salário bruto
        double ir = salarioBruto * 0.11; // Calcula o valor do Imposto de Renda (11%)
        double inss = salarioBruto * 0.08; // Calcula o valor do INSS (8%)
        double sindicato = salarioBruto * 0.05; // Calcula o valor do Sindicato (5%)
        double salarioLiquido = salarioBruto - ir - inss - sindicato; // Calcula o salário líquido

        // Exibir os resultados
        System.out.println("Salário Bruto : R$ " + salarioBruto);
        System.out.println("Imposto de Renda (11%) : R$ " + ir);
        System.out.println("INSS (8%) : R$ " + inss);
        System.out.println("Sindicato (5%) : R$ " + sindicato);
        System.out.println("Salário Líquido : R$ " + salarioLiquido);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
