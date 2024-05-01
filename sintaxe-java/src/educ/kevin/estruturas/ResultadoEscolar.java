package educ.kevin.estruturas;

public class ResultadoEscolar {
  
  public static void main(String[] args) {

    // Nome do Aluno
    String nomeDoAluno = "Kevyn Rodrigues";
    System.out.println("Aluno: " + nomeDoAluno);

    // Notas dos 4 bimestres do Aluno
    double notaPrimeiroBimestre = 7;
    System.out.println("Nota no primeiro bimestre: " + notaPrimeiroBimestre);
    double notaSegundoBimestre = 8.7;
    System.out.println("Nota no segundo bimestre: " + notaSegundoBimestre);
    double notaTerceiroBimestre = 3;
    System.out.println("Nota no terceiro bimestre: " + notaTerceiroBimestre);
    double notaQuartoBimestre = 7.5;
    System.out.println("Nota no quarto bimestre: " + notaQuartoBimestre);

    // Calcular a média
    double mediaEscolar = (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre + notaQuartoBimestre) / 4;
    System.out.println("A média do Aluno " + nomeDoAluno + " é: " + String.format("%.1f", mediaEscolar));

    // Condições para Aprovação, Recuperação ou Reprovação
    if (mediaEscolar >= 7) {
      System.out.println("Aluno APROVADO!");
    } 
    else if (mediaEscolar >= 5) {
      System.out.println("O Aluno está na RECUPERAÇÃO");
        // Supondo que a média mínima para ser aprovado na recuperação seja 7
        double notaRecuperacao = 9; // Nota da prova de recuperação
        System.out.println("A nota do aluno na recuperação foi: " + notaRecuperacao);
        double novaMedia = (mediaEscolar + notaRecuperacao) / 2; // Calculo para a média da recuperação
        if (novaMedia >= 7) {
          System.out.println("Aluno APROVADO na RECUPERAÇÃO! Sua Média Final foi: " + String.format("%.1f", novaMedia));
        } 
        else {
          System.out.println("Aluno REPROVADO na RECUPERAÇÃO! Sua Média Final foi: " + String.format("%.1f", novaMedia));
      }
    }
    else {
      System.out.println("Aluno REPROVADO!");
    }
  }
}
