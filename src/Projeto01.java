import java.util.*;

public class Projeto01 {

  public static void main(String[] args) {
    list();
    set();
    map();
  }

  public static void list() {
    System.out.println("List");
    List<String> funcionarios = new ArrayList<>();
    funcionarios.add("João");
    funcionarios.add("Maria");
    funcionarios.add("João");

    System.out.println(funcionarios);
    System.out.println(funcionarios.getFirst());
    System.out.println(funcionarios.getLast());
    System.out.println(funcionarios.get(1));

  }

  public static void set() {
    System.out.println("Set");
    Set<String> produtos = new HashSet<>();
    produtos.add("Água");
    produtos.add("Coca-Cola");
    produtos.add("Água");

    System.out.println(produtos);

  }

  public static void map() {
    System.out.println("Map");
    Map<Integer,String> clientes = new HashMap<>();
    clientes.put(1, "Maria");
    clientes.put(2, "Marcos");
    clientes.put(3, "Ana");

    System.out.println(clientes);
    System.out.println(clientes.get(1));

  }

}
