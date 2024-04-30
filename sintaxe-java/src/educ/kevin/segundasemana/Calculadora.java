package educ.kevin.segundasemana;

/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Kevyn Rodrigues
* @version 1.0
* @since   30/04/2024
*/
public class Calculadora {
  public int somar(int numeroUm, int numeroDois) {
      return  numeroUm + numeroDois;
  }

  public int subtrair(int numeroUm, int numeroDois) {
      return numeroUm - numeroDois;
  }

  public int multiplicar(int numeroUm, int numeroDois) {
      return numeroUm * numeroDois;
  }

  public double dividir(int numeroUm, int numeroDois) {
      if (numeroDois == 0) {
          throw new IllegalArgumentException("O divisor não pode ser zero!");
      }
      return (double) numeroUm / numeroDois;
  }

  public static void main(String[] args) {
      Calculadora calc = new Calculadora();

      // Testando o método somar
      System.out.println("Soma: " + calc.somar(5, 3));

      // Testando o método subtrair
      System.out.println("Subtração: " + calc.subtrair(5, 3));

      // Testando o método multiplicar
      System.out.println("Multiplicação: " + calc.multiplicar(5, 3));

      // Testando o método dividir
      System.out.println("Divisão: " + calc.dividir(5, 3));
  }
}
