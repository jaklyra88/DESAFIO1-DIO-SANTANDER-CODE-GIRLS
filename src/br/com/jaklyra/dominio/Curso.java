package br.com.jaklyra.dominio;

public class Curso extends Conteudo{

  //ENCAPSULAMOS OS ATRIBUTOS - PUBLIC - PRIVATE - PROTECTED
  //PODEMOS TER ACESSO AOS ATRIBUTOS PELOS METODOS SETTER AND GETTER
  private int cargaHoraria;


  public Curso(){

  }

  @Override
  public double calcularXp() {
    return XP_PADRAO * cargaHoraria; //AO CONCLUIR O CURSO MULTIPLICAREMOS O XP PADRÃO PELA CARGA HORÁRIA
  }

   public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "titulo='" + getTitulo()+ '\'' +
            ", descricao='" + getDescricao() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}
