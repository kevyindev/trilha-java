package educ.kevin.segundasemana;

public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  // Ligar-Desligar Tv
  public void ligarTv(){
    ligada = true;
    System.out.println("Ligando a Tv..." + ligada);
  }
  public void desligarTv(){
    ligada = false;
    System.out.println("Desligando a Tv... " + ligada);
  }

  // Passar-Voltar-escolher canal
  public void escolherCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Trocando para o canal: " + canal);
  }

  // Aumentar-Diminuir volume
  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }
  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

}
