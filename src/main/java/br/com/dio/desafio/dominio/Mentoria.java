package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private LocalDate data;
    
    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public String formatarData(LocalDate data) {
        DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatacao);
    }

    @Override
    public String toString() {
        return "Mentoria: " + titulo + "\n" +
               "Descrição: " + descricao + "\n" +
               "Data: " + formatarData(data);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
