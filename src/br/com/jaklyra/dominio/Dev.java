package br.com.jaklyra.dominio;


import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;

    //UTILIZAMOS O LINKEDHASHSET POIS O DEV NÃO PODE SE INSCREVER MAIS DE UMA VEZ,
    //NESSA COLEÇÃO SÓ PODE CONTER ELEMENTOS ÚNICOS

    //HERANÇA - UTILIZANDO A CLASSE MÃE CONTEUDO

    //CONTEUDOS INSCRITOS - É UM GRUPO QUE POSSUI OS CONTEUDOS QUE O DEV PODE SE INSCREVER
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //POLIMORFISMO

    //CONTEUDOS CONCLUIDOS - GRUPODE CONTEUDOS QUE O DEV CONSEGUIU CONCLUIR
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //POLIMORFISMO

    //QUANDO CHAMAR O MÉTODO INSCREVER BOOTCAMP E PASSAR O BOOTCAMP, SERÁ EFETUADA A INSCRIÇÃO
    //TERÁ ACESSO AO CONTEUDO INSCRITO
    public void inscreverBootcamp(Bootcamp bootcamp){
        //PEGANDO O SET DE CONTEUDOS INSCRITOS E ADICIONANDO DENTRO DELE TODOS OS CONTEUDOS DO BOOTCAMP
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        //ADICIONANDO O DEV NO BOOTCAMP
        //PEGANDO O BOOTCAMP - PEGANDO O GETDEVS INCRITOS QUE CONTEM TODOS OS DEVS INSCRITOS
        //ADICIONANDO O DEV
        bootcamp.getDevsInscritos().add(this);
    }

    //A MEDIDA EM QUE PROGREDIMOS NO BOOTCAMP - TEREMOS CONTEUDOS CONCLUIDOS
    //O MÉTODO FINDFIRST RETORNA UM OPTIONAL - PARA RESOLVER A QUESTÃO DE RETORNOS NULOS
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();//PEGANDO O PRIMEIRO CONTEUDO

            //SE O CONTEUDO EXISTIR EM CONTEUDO
            if(conteudo.ifPresent()){
                //COLOCA O CONTEÚDO DENTRO DO SET DE CONTEUDOS CONCLUIDOS
                this.conteudosConcluidos.add(conteudo.get());
                //REMOVENDO DO SET DE CONTEUDOSINSCRITOS
                this.conteudosInscritos.remove(conteudo.get());
            }else{
                System.err.println("Você não está matriculado em nenhum conteúdo!");
            }
    }

    //AO CHAMAR - SABEREMOS QUANTO XP O DEV CONSEGUIU
    public double calcularTotalXp(){

        //PEGANDO O SET DE CONTEUDOS CONCLUIDOS
        //STREAMAPI PEGANDO CADA CONTEUDO DE DENTRO DO SET DE CONTEUDOS CONCLUIDOS
        //E PEGANDO O XP DE CADA CONTEUDO E SOMANDO
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //POIS ESTAMOS TRABALHANDO COM HASH
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
