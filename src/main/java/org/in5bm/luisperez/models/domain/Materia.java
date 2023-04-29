
package org.in5bm.luisperez.models.domain;

/**
 *
 * @author Luis Carlos Pérez
 * @date 26/09/2022
 * @time 11:43:33
 * 
 *Código técnico: IN5BM
 *
 */

/*import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleObjectProperty;*/
import java.time.LocalTime;
import java.time.Year;


public class Materia {
    
    // Atributos
    private int idMateria;
    private String nombreMateria;
    private Year cicloEscolar;
    private LocalTime horarioInicio;
    private LocalTime horarioFinal;
    private String catedratico;
    private String salon;
    private int cupoMaximo;
    private int cupoMinimo;
    private int nota;
    
    // Constructores
    public Materia() {
    }
    
    public Materia(int idMateria) {
        this.idMateria = idMateria;
    }
    
    public Materia(String nombreMateria, Year cicloEscolar, LocalTime horarioInicio, LocalTime horarioFinal, 
            String catedratico, String salon, int cupoMaximo, int cupoMinimo, int nota) {
        this.nombreMateria = nombreMateria;
        this.cicloEscolar = cicloEscolar;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
        this.catedratico = catedratico;
        this.salon = salon;
        this.cupoMaximo = cupoMaximo;
        this.cupoMinimo = cupoMinimo;
        this.nota = nota;
    }
    
    public Materia(int idMateria, String nombreMateria, Year cicloEscolar, LocalTime horarioInicio, LocalTime horarioFinal, 
            String catedratico, String salon, int cupoMaximo, int cupoMinimo, int nota) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.cicloEscolar = cicloEscolar;
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
        this.catedratico = catedratico;
        this.salon = salon;
        this.cupoMaximo = cupoMaximo;
        this.cupoMinimo = cupoMinimo;
        this.nota = nota;
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Year getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(Year cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFinal() {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalTime horarioFinal) {
        this.horarioFinal = horarioFinal;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public void setCupoMinimo(int cupoMinimo) {
        this.cupoMinimo = cupoMinimo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombreMateria=" + 
                nombreMateria + ", cicloEscolar=" + cicloEscolar + ", horarioInicio=" + 
                horarioInicio + ", horarioFinal=" + horarioFinal + ", catedratico=" + catedratico + 
                ", salon=" + salon + ", cupoMaximo=" + cupoMaximo + ", cupoMinimo=" + cupoMinimo + 
                ", nota=" + nota + '}';
    }
    
    /*
    private IntegerProperty idMateria;
    private StringProperty nombreMateria;
    private ObjectProperty<Year> cicloEscolar;
    private ObjectProperty<LocalTime> horarioInicio;
    private ObjectProperty<LocalTime> horarioFinal;
    private StringProperty catedratico;
    private StringProperty salon;
    private IntegerProperty cupoMaximo;
    private IntegerProperty cupoMinimo;
    private IntegerProperty nota;
    
    // Constructores
    public Materia() {
    }
    
    public Materia(int idMateria) {
        this.idMateria = new SimpleIntegerProperty(idMateria);
    }
    
    public Materia(String nombreMateria, Year cicloEscolar, LocalTime horarioInicio, 
            LocalTime horarioFinal, String catedratico, String salon, int cupoMaximo, 
            int cupoMinimo, int nota) {
        this.nombreMateria = new SimpleStringProperty(nombreMateria);
        this.cicloEscolar = new SimpleObjectProperty<>(cicloEscolar);
        this.horarioInicio = new SimpleObjectProperty<>(horarioInicio);
        this.horarioFinal = new SimpleObjectProperty<>(horarioFinal);
        this.catedratico = new SimpleStringProperty(catedratico);
        this.salon = new SimpleStringProperty(salon);
        this.cupoMaximo = new SimpleIntegerProperty(cupoMaximo);
        this.cupoMinimo = new SimpleIntegerProperty(cupoMinimo);
        this.nota = new SimpleIntegerProperty(nota);
    }
    
    public Materia(int idMateria, String nombreMateria, Year cicloEscolar, 
            LocalTime horarioInicio, LocalTime horarioFinal, String catedratico, 
            String salon, int cupoMaximo, int cupoMinimo, int nota) {
        this.idMateria = new SimpleIntegerProperty(idMateria);
        this.nombreMateria = new SimpleStringProperty(nombreMateria);
        this.cicloEscolar = new SimpleObjectProperty<>(cicloEscolar);
        this.horarioInicio = new SimpleObjectProperty<>(horarioInicio);
        this.horarioFinal = new SimpleObjectProperty<>(horarioFinal);
        this.catedratico = new SimpleStringProperty(catedratico);
        this.salon = new SimpleStringProperty(salon);
        this.cupoMaximo = new SimpleIntegerProperty(cupoMaximo);
        this.cupoMinimo = new SimpleIntegerProperty(cupoMinimo);
        this.nota = new SimpleIntegerProperty(nota);
    }
    
    // Metodos Getter y Setter
    public IntegerProperty idMateria() {
        return idMateria;
    }

    public int getIdMateria() {
        return idMateria.get();
    }

    public void setIdMateria(int idMateria) {
        this.idMateria.set(idMateria);
    }
    
    */

}
