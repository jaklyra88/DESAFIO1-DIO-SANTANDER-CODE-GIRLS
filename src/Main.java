import br.com.jaklyra.dominio.*;

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

        //System.out.println(curso);
        //System.out.println(curso1);
        //System.out.println(mentoria);

        //CRIANDO UM BOOTCAMP
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        //CRIANDO DEVS
        Dev devJakelyne = new Dev();
        devJakelyne.setNome("Jakelyne");

        //MATRICULANDO NO BOOTCAMP
        devJakelyne.inscreverBootcamp(bootcamp);
        //VERIFICANSO OS BOOTCAMPS MATRICULADOS
        System.out.println("Conteúdos inscritos Jakelyne " + devJakelyne.getConteudosInscritos());

        //PROGREDINDO NO BOOTCAMP
        devJakelyne.progredir();
        devJakelyne.progredir();

        System.out.println("-");

        //VERIFICANDO OS CONTEUDOS CONCLUIDOS
        System.out.println("Conteúdos Concluídos Jakelyne " + devJakelyne.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Jakelyne " + devJakelyne.getConteudosInscritos());
        System.out.println("XP " + devJakelyne.calcularTotalXp());

        System.out.println("---------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Concluídos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("XP " + devCamila.calcularTotalXp());


    }
}
