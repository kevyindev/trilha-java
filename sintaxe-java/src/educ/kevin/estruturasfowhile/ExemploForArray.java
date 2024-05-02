package educ.kevin.estruturasfowhile;

public class ExemploForArray {

  public static void main(String[] args) {
    String alunos[] = { "CICLOPE", "JUBILEU", "JEAN", "LOGAN", "MAGNETO", "NOTURNO" };

    for (String aluno : alunos){
      System.out.println("Nome do X-Men é " + aluno);
    }

    // for (int x = 0; x < alunos.length; x ++ ) {
    //   System.out.println("O X-Men no indice X = " + x + " é " + alunos[ x ]);
    // }
  }

}
