package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev { // Inicio class Dev
    private String nome;
    private Set<Conteudo> conteudosIscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

   public void inscreverBootcamp(Bootcamp bootcamp){
       this.conteudosIscritos.addAll(bootcamp.getConteudos());
       bootcamp.getDevsIncritos().add(this); // adicionando o dev no bootcamp
   }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosIscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum Conteúdo"); // mensagem de erro
        }

    }

    public double calcularTotalXp(){ //calculando EXP
        return this.conteudosIscritos.
                stream().
                mapToDouble(Conteudo::calcularXp).
                sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIscritos() {
        return conteudosIscritos;
    }

    public void setConteudosIscritos(Set<Conteudo> conteudosIscritos) {
        this.conteudosIscritos = conteudosIscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIscritos, dev.conteudosIscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIscritos, conteudosConcluidos);
    }
} // Fim class Dev
