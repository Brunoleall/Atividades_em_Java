package br.com.atividades_manipulando_data_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculandoDataEntrega {
    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.of(2026,03,15);
        int prazoEmDias = 15;

        LocalDate dataEntrega = dataInicio.plusDays(prazoEmDias);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada =  dataEntrega.format(formatoData);

        System.out.println("Data de entrega: " + dataFormatada);

    }
}
