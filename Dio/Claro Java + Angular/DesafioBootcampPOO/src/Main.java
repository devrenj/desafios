import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando Curso de Java
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        // Criando Curso de Javascript
        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        // Criando Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // Criando um Bootcamp e adicionando Cursos e Mentoria
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Interagindo com a instância
        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Roberto: " + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("Conteúdos concluídos Roberto: " + devRoberto.getConteudosConcluidos());
        System.out.println("UPDATE Conteúdos inscritos Roberto: " + devRoberto.getConteudosInscritos());
        System.out.println("XP: " + devRoberto.calcularTotalXp());
        System.out.println("---------------------");

        // Interagindo com a instância
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("UPDATE Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println("---------------------");

//        Verificando instâncias
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);
    }
}
