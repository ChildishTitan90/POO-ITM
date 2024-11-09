public class Habitacion {
    public int id;
    public String tipoHabitacion;
    public double precioHabitacionPorNoche;
    public boolean disponible;

    public Habitacion(int id,String tipoHabitacion, double precioHabitacionPorNoche, boolean disponible) {
        this.id = id;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacionPorNoche = precioHabitacionPorNoche;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public double getPrecioHabitacionPorNoche() {
        return precioHabitacionPorNoche;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void setPrecioHabitacionPorNoche(double precioHabitacionPorNoche) {
        this.precioHabitacionPorNoche = precioHabitacionPorNoche;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String reservar(int noches){
        if (!disponible) {
            throw new NonAvailableRoomException("LA HABITACION " + id + " YA ESTÁ OCUPADA.");
        }
        if (noches < 1) {
            throw new InvalidNumberOfNigthsException("DEBES RESERVAR AL MANENOS UNA NOCHE.");
        }
        this.disponible = false;
        return String.format("RESERVA EXITOSA PARA %d NOCHES\nCOSTO TOTAL DE LA RESERVA: $%.2f", noches, (precioHabitacionPorNoche*noches));
    }

    public String liberar(){
        this.disponible = true;
       return String.format("LA HABITACIÓN %d HA SIDO LIBERADA Y ESTÁ DISPINIBLE NUEVAMENTE.", id);
    }


    public String mostrarDetalles(){
       return String.format("  ----------------  \nTIPO DE HABITACION: %s\nPRECIO POR NOCHE: %.2f\nDISPONIBILIDAD: %s", tipoHabitacion, precioHabitacionPorNoche, disponible ? "Disponible" : "Reservado" );
    }
}
