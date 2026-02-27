package br.com.atividades_manipulando_data_hora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VerificandoDataEvento {
    public static void main(String[] args) {

        LocalDate dataDoEvento = LocalDate.of(2026,3,10);
        LocalDate atualData = LocalDate.of(2026, 3, 15);

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEventoFormatada = dataDoEvento.format(formatoData);
        String dataAtualFormatada = atualData.format(formatoData);

       if (dataDoEvento.isBefore(atualData)){
           System.out.println("Data evento: " + dataEventoFormatada);
           System.out.println("Data Atual: " + dataAtualFormatada);
           System.out.println("Evento já aconteceu");
       } else {
           System.out.println("Data evento: " + dataEventoFormatada);
           System.out.println("Data Atual: " + dataAtualFormatada);
           System.out.println("Evento ainda não aconteceu!");


       }


    }
}
