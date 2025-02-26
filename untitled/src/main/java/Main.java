import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main { // Inicio

    public static void main(String[] args) { // inicio main

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);
        // =========================================
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);
        // =========================================
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        // =========================================



//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer.");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Incritos Raphael: + " + devJoao.getConteudosIscritos());


        devJoao.progredir();
        System.out.printf("\n-");

        System.out.println("Conteúdos Incritos Raphael: + " + devJoao.getConteudosIscritos());
        System.out.println("Conteúdos Concluídos Raphael: + " + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp() );


        System.out.printf("\n------------");


        Dev devRaphael = new Dev();
        devRaphael.inscreverBootcamp(bootcamp);
        devRaphael.setNome("Raphael");

        System.out.println("\nConteúdos Incritos Joao: + " + devRaphael.getConteudosIscritos());


        devRaphael.progredir();
        System.out.printf("\n-");
        System.out.println("Conteúdos Incritos Joao: + " + devRaphael.getConteudosIscritos());
        System.out.println("Conteúdos Concluídos Joao: + " + devRaphael.getConteudosConcluidos());
        System.out.println("XP:" + devRaphael.calcularTotalXp() );



    } // fim main
} // Fim class
