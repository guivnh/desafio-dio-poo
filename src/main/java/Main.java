import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Descrição do Curso Javascript");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);

        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcampo Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println("-----");
        System.out.println("Conteúdos concluídos de Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("\n-----------------------------------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de João:" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-----");
        System.out.println("Conteúdos concluídos de João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }

}
