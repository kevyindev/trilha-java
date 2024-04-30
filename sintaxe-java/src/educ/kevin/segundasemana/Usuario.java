package educ.kevin.segundasemana;

public class Usuario {
  public static void main(String[] args) {
    
    SmartTv smartTv = new SmartTv();

    // Status Inicial da tv
    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);


    // Novo Status Tv
    smartTv.ligarTv();
    System.out.println("Tv ligada? " + smartTv.ligada);
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual: " + smartTv.volume);
    smartTv.escolherCanal(55);
    System.out.println("Canal atual: " + smartTv.canal);

    // Desligando Tv
    smartTv.desligarTv();
    System.out.println("Tv ligada? " + smartTv.ligada);



  }
}
