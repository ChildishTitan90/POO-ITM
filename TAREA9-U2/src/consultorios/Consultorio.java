package consultorios;

public class Consultorio {
    public int id;
    public int priso;
    public int numeroConsultorio;

    public Consultorio(int id, int priso, int numeroConsultorio) {
        this.id = id;
        this.priso = priso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
        return id;
    }

    public int getPriso() {
        return priso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }
}