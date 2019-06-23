package fatorial;

public class Fatorial {

  public static int calcular(int valor) {
    int total = 1;
    for (int i = 2; i < valor + 1; i++) {
      total = total * i;
    }
    return total;
  }

}
