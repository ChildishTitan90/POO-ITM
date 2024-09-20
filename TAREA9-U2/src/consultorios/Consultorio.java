package consultorios;

import java.util.Random;

public class Consultorio {
    public int id;
    public int piso;
    public int numeroConsultorio;
    private Random rand = new Random();

    public Consultorio(int piso, int numeroConsultorio) {
        this.id = rand.nextInt(1, 100001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %d, PISO: %s, NO. CONSULTORIO: %s", this.id, this.piso, this.numeroConsultorio);
        return datos;
    }
}