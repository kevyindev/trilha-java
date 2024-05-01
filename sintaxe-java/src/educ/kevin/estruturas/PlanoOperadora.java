package educ.kevin.estruturas;

public class PlanoOperadora {

  public static void main(String[] args) {
    String plano = "T"; // T / M / B
    System.out.println("Plano Selecionado: " + plano);

    switch (plano) {
      case "T": {
        System.out.println("5GB de YouTube liberados!");
      }
      case "M": {
        System.out.println("WhatsApp e Instagram Ilimitados!");
      }
      case "B": {
        System.out.println("100 Minutos de Ligação para todo o Brasil!");
        break;
      }
      default: {
        System.out.println("Plano selecionado é inválido");
      }
    }

    // if (plano == "B") {
    //   System.out.println("100 minutos de ligação");
    // }
    // else if (plano == "M") {
    //   System.out.println("100 minutos de ligação");
    //   System.out.println("Whatsapp e Instagram ilimitados");
    // }
    // else if (plano == "T") {
    //   System.out.println("100 minutos de ligação");
    //   System.out.println("Whatsapp e Instagram ilimitados");
    //   System.out.println("5gb Youtube liberados");
    // }
    // else {
    //   System.out.println("Plano selecionado é inválido");
    // }
  }

}
