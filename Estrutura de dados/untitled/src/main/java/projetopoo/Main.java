package projetopoo;

import projetopoo.dominio.conteudo.Conteudo;
import projetopoo.dominio.conteudo.Curso;
import projetopoo.dominio.conteudo.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("lorem lorem lorem");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("lorem lorem lorem");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("ipsum lorem");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("lorem lorem");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev laisson = new Dev();
        laisson.setNome("Laisson");
        laisson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + laisson.getConteudosInscritos());
        laisson.progredir();
        System.out.println("Conteudos inscritos " + laisson.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + laisson.getConteudosInscritos());


        System.out.println("------------------------------");
        Dev sicrano = new Dev();
        sicrano.setNome("Sicrano");
        sicrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + sicrano.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + sicrano.getConteudosInscritos());
        sicrano.progredir();
        System.out.println("Conteudos inscritos " + sicrano.getConteudosInscritos());
        System.out.println("Conteudos concluidos " + sicrano.getConteudosInscritos());




    }
}
