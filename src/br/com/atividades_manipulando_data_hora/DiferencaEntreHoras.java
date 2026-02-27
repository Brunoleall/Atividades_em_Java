package br.com.atividades_manipulando_data_hora;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaEntreHoras {
    public static void main(String[] args) {

        LocalTime horaInicio = LocalTime.of(14, 30,0);
        LocalTime horaFim = LocalTime.of(16,45,0);

        Duration duracao = Duration.between(horaInicio, horaFim);

        System.out.println("Diferença de tempo: " + duracao.toHours() + "Horas e " + duracao.toMinutes() + " minutos");


    }
}
