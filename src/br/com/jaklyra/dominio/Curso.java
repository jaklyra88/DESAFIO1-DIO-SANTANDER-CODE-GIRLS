package br.com.jaklyra.dominio;

public class Curso {

  //ENCAPSULAMOS OS ATRIBUTOS - PUBLIC - PRIVATE - PROTECTED
  //PODEMOS TER ACESSO AOS ATRIBUTOS PELOS METODOS SETTER AND GETTER
  private String titulo;
  private String descricao;
  private int cargaHoraria;

  public Curso(){

  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
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
            "titulo='" + titulo + '\'' +
            ", descricao='" + descricao + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}
