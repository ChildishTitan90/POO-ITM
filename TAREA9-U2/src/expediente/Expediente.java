package expediente;

import consultas.Consulta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Expediente {
    public String id;
  public Consulta consulta;
  public String observaciones;
  public LocalDateTime fechaExpediente;

    public Expediente(Consulta consulta, String observaciones) {
        this.id = this.generarId();
        this.consulta = consulta;
        this.observaciones = observaciones;
        this.fechaExpediente = LocalDateTime.now();
    }

    public String generarId(){
        //E-{año actual}--{mes actual}{1,10000}
        Random random = new Random();
        LocalDate fecha = LocalDate.now();
        int anoActual = fecha.getYear();
        int mesActual = fecha.getMonthValue();
        int numeroAleatorio = random.nextInt(1,100000);

        String id = String.format("E%d%d%d", anoActual, mesActual, numeroAleatorio);
        return id;
    }
}
