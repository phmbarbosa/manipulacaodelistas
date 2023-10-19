/**
 * A classe ListaManipulator fornece métodos para manipular e ordenar uma lista de inteiros.
 * Atualmente, ela suporta os algoritmos de ordenação Bubble Sort e Selection Sort.
 * Além disso, inclui um método de busca que pode ser implementado.
 * @author Gilberto Scheiffer, Alvaro Ribeiro e Pedro Barbosa.
 * @version 1.0
 */
public class ListaManipulator {
  // Atributos privados
  private int[] lista;
  private int tamanho;
  Utilitarios utilitarios = new Utilitarios();
  
  /**
   * Construtor para criar uma instância de ListaManipulator com uma lista de inteiros.
   * Além disso cria insere o tamanho da lista na variavel para as funções usarem.
   * @param lista A lista de inteiros a ser manipulada.
   */
  public ListaManipulator(int[] lista) {
    this.lista = lista;
    this.tamanho = lista.length;
  }
  
  /**
   * Ordena a lista de inteiros usando o algoritmo Bubble Sort.
   * O Bubble Sort ordena comparando o elemento atual com o elemento sucessor, se esse elemento for maior, então eles trocaram de posição. Enquanto houver trocas o código vai ficar rodando dentro do while, no momento em que não houver trocas quer dizer que a lista está ordenada.
   */
  public int[] bubbleSort(){
    boolean trocou = true;
    while(trocou){
      trocou = false;
      for(int i = 0; i< tamanho-1; i++){
        if(lista[i] > lista[i+1]){
          utilitarios.trocaPosicao(lista, i+1, i);
          trocou = true;
        }
      }
    }
    return lista;
  }

  /**
   * Ordena a lista de inteiros usando o algoritmo Selection Sort.
   * O Selection Sort ordena trocando a posição do maior elemento com o último, em seguida o tamanho da lista é cortado temporariamente em 1 posição, para fazer com que o valor da última posição não seja considerado, esse loop rodará até o tamanho ser igual a 0.
   */
  public int[] selectionSort(){
    int maior = -1, posicao = -1, tam = tamanho;
    while(tam > 0){
      maior = -1;
      for(int i = 0; i < tam; i++){
        if(lista[i] > maior){
          maior = lista[i];
          posicao = i;
        }
      }
      utilitarios.trocaPosicao(lista, tam-1, posicao);
      tam--;
    }
    return lista;
  }

  /**
   * Ordena a lista de inteiros usando o algoritmo Insertion Sort.
   * O Insertion Sort consiste em percorrer a lista a ser ordenada e, para cada elemento, insere-o na posição correta dentro da parte já ordenada da lista.
   */
  public int[] insertionSort(){
    for (int i = 1; i < tamanho; i++){
      int chave = lista[i], j = i - 1;
      // move os elementos maiores que a chave para a direita
      while (j >= 0 && lista[j] > chave) {
        lista[j + 1] = lista[j];
        j--;
      }
      // bota a chave na posição certa
      lista[j + 1] = chave;
    }
    return lista;
  }

  /**
   * Realiza uma busca binária na lista de inteiros para encontrar um valor específico.
   * A Busca binária consiste em dividir repetidamente o array pela metade e verificar se o elemento desejado está na metade superior ou inferior.
   * @param valor O valor a ser procurado na lista.
   */
  public int busca(int valor){
    int posicao = -1, inicio = 0, fim = tamanho - 1;
    while (inicio <= fim) {
      int meio = (inicio + fim) / 2;
      
      if (valor == lista[meio]) {
        posicao = meio;
        return posicao;
      } else if (valor < lista[meio]) {
        fim = meio - 1;
      } else {
        inicio = meio + 1;
      }
    }
    if(posicao == -1){
      System.out.println("O valor não esta dentro da lista!!");
      utilitarios.encerrarPrograma();
    }
    return posicao;
  }
}