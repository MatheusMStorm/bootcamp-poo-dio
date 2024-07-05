package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }   

    @Override
    public String toString() {
        return "Curso: " + titulo + "\n" + 
               "Descrição: " + descricao + "\n" +
               "Carga horária: " + cargaHoraria + "h(s)";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 40d;
    }
}
