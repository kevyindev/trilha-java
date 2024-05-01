package educ.kevin.estruturas;

public class SistemaDeMedidas {

  public static void main(String[] args) {
    String sigla = "P";
    System.out.println("Tamanho selecionado: " + sigla);

    // switch (sigla) {
    //   case "P":{
    //     System.out.println("PEQUENO");
    //     break;
    //   }
    //   case "M": {
    //     System.out.println("MÉDIO");
    //     break;
    //   }
    //   case "G": {
    //     System.out.println("GRANDE");
    //     break;
    //   }
    //   case "GG": {
    //     System.out.println("EXTRA GRANDE");
    //     break;
    //   }
    //   default:
    //     System.out.println("INDISPONÍVEL NO ESTOQUE");
    // }

    if (sigla == "P") {
      System.out.println("PEQUENO");
      }
    else if (sigla == "M") {
      System.out.println("MÉDIO");
      }
    else if (sigla == "G") {
      System.out.println("GRANDE");
      }
    else if (sigla == "GG") {
      System.out.println("EXTRA GRANDE");
      }
    else {
      System.out.println("INDISPONÍVEL NO ESTOQUE");
      }

  }
}
