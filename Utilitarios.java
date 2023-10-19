/**
 * A classe Utilitarios fornece métodos uteis para o programa, visando evitar repetições de codigo.
 * @author Gilberto Scheiffer, Alvaro Ribeiro e Pedro Barbosa.
 * @version 1.0
 */
public class Utilitarios {
  /**
   * Imprime listas.
   */
  public void imprimirLista(int[] lista) {
    for (int num : lista) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
  
  /**
   * Encerra o programa.
   */
  public void encerrarPrograma(){
    System.exit(0);
  }
  
  /**
   * Troca os valores de posições em uma lista.
   */
  public void trocaPosicao(int[] lista,int posicao1, int posicao2){
    int aux = lista[posicao1];
    lista[posicao1] = lista[posicao2];
    lista[posicao2] = aux;
  }
}







// 908, 46, 977, 490, 322, 198, 1000, 239, 378, 621, 338, 291, 66, 103, 971, 574, 43, 135, 751, 333, 307, 32, 451, 20, 846, 415, 85, 123, 376, 161, 992, 277, 800, 88, 866, 217, 563, 182, 153, 128, 526, 710, 557, 520, 84, 828, 1, 953, 103, 540, 386, 356, 335, 195, 477, 997, 330, 774, 34, 434, 325, 823, 379, 673, 199, 399, 460, 517, 619, 723, 64, 40, 813, 415, 853, 209, 105, 148, 973, 548, 589, 967, 565, 281, 870, 392, 366, 264, 446, 709, 195, 53, 642, 396, 621, 575, 507, 873, 990, 692