package br.com.atividades_manipulando_data_hora;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataEHoraAtual {
    public static void main(String[] args) {

        String tarefa = "Enviar relatório semanal!";
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        System.out.println("tarefa criada: " + tarefa);
        System.out.println("Data atual: " + dataAtual);
        System.out.println("Hora atual: " + horaAtual);



    }
}
