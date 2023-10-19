import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * A classe Testes fornece métodos para testar os métodos das outras classes.
 * @author Gilberto Scheiffer, Alvaro Ribeiro e Pedro Barbosa.
 * @version 1.0
 */
public class Testes{
  
  /**
   * Testa o método bubbleSort() da classe ListaManipulator.
   */
  @Test
  public void testeBubbleSort(){
    int[] listaTeste ={5, 2, 9, 1, 4, 6};
    ListaManipulator manipulator = new ListaManipulator(listaTeste);
    int[] resp = manipulator.bubbleSort();
    assertArrayEquals(resp,new int[]{1, 2, 4, 5, 6, 9});
  }
  
  /**
   * Testa o método selectionSort() da classe ListaManipulator.
   */
  @Test
  public void testeSelectionSort(){
    int[] listaTeste ={5, 2, 9, 1, 4, 6};
    ListaManipulator manipulator = new ListaManipulator(listaTeste);
    int[] resp = manipulator.selectionSort();
    assertArrayEquals(resp,new int[]{1, 2, 4, 5, 6, 9});
  }
  
  /**
   * Testa o método insertionSort() da classe ListaManipulator.
   */
  @Test
  public void testeInsertionSort(){
    int[] listaTeste ={5, 2, 9, 1, 4, 6};
    ListaManipulator manipulator = new ListaManipulator(listaTeste);
    int[] resp = manipulator.insertionSort();
    assertArrayEquals(resp,new int[]{1, 2, 4, 5, 6, 9});
  }

  /**
   * Testa o método busca() da classe ListaManipulator.
   */
  @Test
  public void testeBusca(){
    int[] listaTeste ={5, 2, 9, 1, 4, 6};
    ListaManipulator manipulator = new ListaManipulator(listaTeste);
    manipulator.bubbleSort();
    int resp = manipulator.busca(4);
    assertEquals(resp,2);
  }
}