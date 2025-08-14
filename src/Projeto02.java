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

    List<Double> valorVendas = List.of(500.0, 1800.0, 6200.0);
    List<Double> comissao = valorVendas.stream()
            .map(v -> v * 0.05)
            .collect(Collectors.toList());
    System.out.println(comissao);

    double totalVendas = valorVendas.stream()
            .reduce(0.0, Double::sum);
    System.out.println("Total vendas: " + totalVendas);

  }

}
