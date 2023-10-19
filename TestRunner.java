import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * A classe TestRunner fornece suporte para a classe Testes funcionar devidamente.
 * @author Gilberto Scheiffer, Alvaro Ribeiro e Pedro Barbosa.
 * @version 1.0
 */
public class TestRunner {
 public static void main() {
   Result result = JUnitCore.runClasses(Testes.class);
   
   for (Failure failure : result.getFailures()) {
     System.out.println(failure.toString());
   }
   
   System.out.println(result.wasSuccessful());
 }
}