package educ.kevin.estruturas;

import java.text.DecimalFormat;

public class CaixaEletronico {

  public static void main(String[] args) {
    // Definindo o saldo inicial da conta
    double saldo = 4500.0;
    // Criando um formato para imprimir valores reais
    DecimalFormat df = new DecimalFormat("$0.00");
    // Imprimindo o saldo atual da conta
    System.out.println("Seu saldo atual: " + df.format(saldo));

    // Definindo o valor solicitado para saque
    double valorSolicitado = 3000;

    // Verfificando se o saldo é suficiente para o saque
    if (valorSolicitado <= saldo) {
        // Realizando o saque e atualizando o saldo
        saldo -= valorSolicitado;
        System.out.println("Saque de " + df.format(valorSolicitado) + " realizado com sucesso!");
        System.out.println("O valor retirado da conta foi: " + df.format(-valorSolicitado));
        System.out.println("Saldo atual: " + df.format(saldo));
    }
    // Caso o saldo seja insuficiente para o saque, imprime o valor solicitado e o aviso de insuficiência
    else {
        System.out.println("Valor solicitado para saque: " + df.format(valorSolicitado));
        System.out.println("!Saldo insuficiente para saque!");
    }
}
}
