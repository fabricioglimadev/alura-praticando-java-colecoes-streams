import java.util.ArrayList;
import java.util.List;

public class AcrescimoSalario {

  public static void main(String[] args) {

    List<Funcionario> funcionarios = new ArrayList<>();
    funcionarios.add(new Funcionario("Fulano", 1600.0));
    funcionarios.add(new Funcionario("Beltrano", 2000.0));
    funcionarios.add(new Funcionario("Ciclano", 3000.0));

    funcionarios.forEach(f -> {
      System.out.println(f);
    });

    System.out.println("-------------------------------------");

    funcionarios.stream().forEach(f -> {
      System.out.println(f);
    });

    System.out.println("-------------------------------------");

    funcionarios.stream().forEach(f -> {
      f.acrescimo(5.0);
    });
    funcionarios.forEach(f -> f.acrescimo(5.0));

    funcionarios.forEach(f -> {
      System.out.println(f);
    });

    System.out.println("-------------------------------------");

    List<Funcionario> list = funcionarios.stream()
            .map(f -> {
              f.acrescimo(5.0);
              return f;
            })
            .toList();

    list.forEach(f -> System.out.println(f));

  }
}

class Funcionario {
  private String nome;
  private double salario;

  public Funcionario(String nome, double salaario) {
    this.nome = nome;
    this.salario = salaario;
  }


  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }




  @Override
  public String toString() {
    return "Funcioario{" +
            "nome='" + nome + '\'' +
            ", salaario=" + salario +
            '}';
  }

  public void acrescimo(double porcento){
    this.salario = this.salario *(1 + porcento/100);
  }


  public void setSalario(double salario) {
    this.salario = salario;
  }
}