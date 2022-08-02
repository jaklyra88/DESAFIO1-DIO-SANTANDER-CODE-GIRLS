package br.com.jaklyra.dominio;

import java.time.LocalDate;

//A CLASSE MENTORIA EXTENDE DA CLASSE CONTEUDO - MENTORIA É FILHA DE CONTEÚDO
//TUDO QUE EU TENHO EM CONTEUDO EU TENHO EM MENTORIA
//PORÉM NEM TUDO QUE TENHO EM MENTORIA TEREMOS EM CONTEUDO
public class Mentoria extends Conteudo{

    //ENCAPSULANDO OS ATRIBUTOS
    //PARA TER ACESSO AOS ATRIBUTOS UTILIAMOS OS METODOS SETTER AND GETTER
    private LocalDate data;

    public Mentoria() {
    }

    //MÉTODO CALCULAR XP
    @Override
    public double calcularXp() {
        //QUANDO FOR CRIADO UM MÉTODO MENTORIA E CHAMAR O MÉTODO CALCULARXP
        //O XP REFERENTE A MENTORIA, SERÁ O XP PADRÃO + 20
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' + //CHAMANDO O ATRIBUTO TITULO DA CLASSE CONTEUDO
                ", descricao='" + getDescricao() + '\'' +//CHAMANDO O ATRIBUTO DESCCRICAO DA CLASSE DESCRIÇÃO
                ", data=" + data +
                '}';
    }


}

