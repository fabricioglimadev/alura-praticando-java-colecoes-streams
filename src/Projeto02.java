import java.util.List;
import java.util.stream.Collectors;

public class Projeto02 {

  public static void main(String[] args) {

    List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda");

    List<String> funcionariosLetraA = funcionarios.stream()
            .filter(f -> f.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(funcionarios);
    System.out.println(funcionariosLetraA);

  }

}
