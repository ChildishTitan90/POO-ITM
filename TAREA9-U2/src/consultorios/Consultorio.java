package consultorios;

public class Consultorio {
    public String id;
    public int piso;
    public int numeroConsultorio;

    public Consultorio(String id, int piso, int numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String mostrarDatos(){
        String datos = String.format("ID: %s, PISO: %s, NO. CONSULTORIO: %s", this.id, this.piso, this.numeroConsultorio);
        return datos;
    }
}