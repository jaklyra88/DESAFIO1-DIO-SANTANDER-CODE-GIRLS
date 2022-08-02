import br.com.jaklyra.dominio.Conteudo;
import br.com.jaklyra.dominio.Curso;
import br.com.jaklyra.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        //NEW - PALAVRA RESENVADA PARA INSTANCIAR O OBJETO

        //INSTÂNCIANDO A CLASSE CURSO
        Curso curso = new Curso();

        curso.setTitulo("Curso JAVA");
        curso.setDescricao("Descrição Curso JAVA");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();

        curso.setTitulo("Curso JS");
        curso.setDescricao("Descrição Curso JS");
        curso.setCargaHoraria(4);


        //POLIMORFISMO
        //CRIAR UM CURSO A PARTIR DA CLASSE CONTEÚDO
        //INTANCIANDO UMA CLASSE CURSO A PARTIR DA CLASSE CONTEÚDO
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        //INTÂNCIANDO A CLASSE MENTORIA
        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);


    }
}
