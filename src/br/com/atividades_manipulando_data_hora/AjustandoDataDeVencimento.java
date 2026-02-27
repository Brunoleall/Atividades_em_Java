package br.com.atividades_manipulando_data_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AjustandoDataDeVencimento {
    public static void main(String[] args) {

        LocalDate dataDeVencimento = LocalDate.of(2026, 3,20);
        int numeroDeMesses = 1;

        LocalDate novaData = dataDeVencimento.plusMonths(numeroDeMesses);

        DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novaData.format(formatada);

        System.out.println("Nova data de vencimento: " + dataFormatada);

    }
}
