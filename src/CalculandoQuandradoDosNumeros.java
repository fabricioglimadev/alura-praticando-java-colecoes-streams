import java.util.List;
import java.util.stream.Collectors;

public class CalculandoQuandradoDosNumeros {

  public static void main(String[] args) {

    List<Integer> numeros = List.of(2, 3, 5, 7, 11);

    List<Integer> quadrados = numeros.stream()
            .map(numero -> numero * numero)
            .collect(Collectors.toList());

    System.out.println("Quadrado dos números: " + quadrados);



  }


}
