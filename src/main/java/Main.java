import java.time.LocalDate;
import br.com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        // Criação do bootcamp
        Bootcamp bootcampBackEndComJava = new Bootcamp("Back-End com Java", "Aprenda back-end com Java");

        // Adicionando os cursos e mentorias
        Conteudo logicaComJava = new Curso("Conhecendo a lógica de programação com Java", "Conheça a lógica de programação com Java", 36);
        Conteudo pooComJava = new Curso("POO com Java", "Entenda o paradigma da programação orientada a objetos com Java", 14);
        Conteudo collectionsApi = new Mentoria("Collections API com Camila Cavalcante", "Conheça o Collections API", LocalDate.of(2024, 7, 8));

        bootcampBackEndComJava.getConteudos().add(collectionsApi);
        bootcampBackEndComJava.getConteudos().add(pooComJava);
        bootcampBackEndComJava.getConteudos().add(logicaComJava);

        // Criando os devs que vão se inscrever no bootcamp
        Dev dev1 = new Dev("Matheus");
        Dev dev2 = new Dev("Paulo");

        dev1.inscrever(bootcampBackEndComJava);
        dev2.inscrever(bootcampBackEndComJava);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());

        System.out.println("-------------------------------------");

        // Matheus concluiu o primeiro curso
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP de Matheus: " + dev1.calcularTotalXp());

        System.out.println("-------------------------------------");

        // Paulo concluiu dois cursos
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP de Paulo: " + dev2.calcularTotalXp());
    }
}
