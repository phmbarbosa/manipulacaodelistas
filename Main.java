import java.util.Scanner;

/**
 * Esta classe representa o programa principal.
 * @author Gilberto Scheiffer, Alvaro Ribeiro e Pedro Barbosa.
 */
class Main {
  public static void main(String[] args) {
    TestRunner tr = new TestRunner();
    int[] minhaLista = {7, 3, 12, 1, 14, 10, 11, 5, 15, 6, 2, 4, 8, 9, 13};
    int valor = -1, posicao = -1;
    String algoritimo;
    ListaManipulator manipulator = new ListaManipulator(minhaLista);
    Utilitarios utilitarios = new Utilitarios();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Lista Original:");
    utilitarios.imprimirLista(minhaLista);

    System.out.println("Qual algoritimo de ordenação deseja usar?(B-Bubble, S-Selection e I-Insertion)");
    algoritimo = scanner.nextLine();
    switch(algoritimo){
      case "B":
      case "b":
        manipulator.bubbleSort();
        break;
      case "S":
      case "s":
        manipulator.selectionSort();
        break;
      case "I":
      case "i":
        manipulator.insertionSort();
        break;
      default:
        System.out.println("Algoritimo não encontrado!");
        utilitarios.encerrarPrograma();
    }

    System.out.println("Lista Ordenada:");
    utilitarios.imprimirLista(minhaLista);

    System.out.println("Qual Valor quer buscar na lista?");
    valor = scanner.nextInt();
    
    System.out.println("Posição do valor buscado:");
    System.out.println(manipulator.busca(valor));
    
    posicao = manipulator.busca(valor);
    System.out.println("Valor da Posição achada:");
    System.out.println(minhaLista[posicao]);
    
    tr.main();
  }
}