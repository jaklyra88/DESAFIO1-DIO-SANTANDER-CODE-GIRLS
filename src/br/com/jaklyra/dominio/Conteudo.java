package br.com.jaklyra.dominio;

//CRIAMOS ESTA CLASSE PARA QUE AS CLASSES FILHAS ACESSEM SEUS ATRIBUTOS E MÉTODOS
//EVITANDO A REPETIÇÃO DE CÓDIGO, JÁ QUE AMBAS POSSUEM AS INFORMAÇÕES CONTIDAS
//NA CLASSE MÃE - HERANÇA

//CLASSE ABSTRATA - NÃO CONSIGO INSTÂNCIAR UM CONTEUDO
public abstract class Conteudo {

    //CRIANDO UMA CONSTANTE - CONTEUDO SERA CRIADO COM XP PADRÃO
    //final - SINALIZANDO UMA CONSTANTE
    //static - PARA PODER ACESSAR O XP PADRÃO FORA DA CLASSE CONTEUDO

    protected static final double XP_PADRAO = 10d;

    //INTUIDO DE CLAR A CLASSE XP É PARA PODER INICIAR OS ATRIBUTOS TITULO, DESCRICAO E CRIAR UM
    //MÉTODO DE CALCULAR XP PARA QUE AS CLASSES FILHAS UTILIZEM AS CLASSES E MÉTODOS

    private String titulo;
    private String descricao;

   //MÉTODO ABSTRATO - SIGNIFICA QUE AS CLASSES FILHAS SERÃO ABRIGADAS A IMPLEMENTAR UMA LÓGICA
    //DESTE MÉTODO CRIADO

    public abstract double calcularXp();

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
}
