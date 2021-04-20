
/***************************************
 * @author Javier Mombiela 20067
 * 
 * Clase Pacientes, clase que contiene
 * la ficha del paciente para saber cual
 * paciente debe de ser atendido primero
 * dependiendo de la emergencia.
 ***************************************/
public class Pacientes implements Comparable<Pacientes> {

    private String nombre, sintoma, codigoEmergencia;
	
	public Pacientes() {
		
		nombre = "";
		sintoma = "";
		codigoEmergencia = "";
	}

	/**
	 * @param nombre = nombre del paciente
	 * @param sintoma = sintoma del paciente
	 * @param codigoEmergencia = prioridad
	 */
	public Pacientes(String nombre, String sintoma, String codigoEmergencia) {
		super();
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigoEmergencia = codigoEmergencia;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre de nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return sintoma
	 */
	public String getSintoma() {
		return sintoma;
	}

	/**
     * @param sintoma
	 * sintoma de sintoma to set
	 */
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	/**
	 * @return el codigoEmergencia
	 */
	public String getcodigoEmergencia() {
		return codigoEmergencia;
	}

	/**
	 * @param codigoEmergencia de codigoEmergencia to set
	 */
	public void setcodigoEmergencia(String codigoEmergencia) {
		this.codigoEmergencia = codigoEmergencia;
	}


    /**
     * 
     * @return codigoEmergencia
     * 
     */
	public String getPrioridadPaciente() {
		
		
		return this.getcodigoEmergencia();
	}
	

    @Override
    /**
     * @param o tipo paciente
     * @return resultado
     */
    public int compareTo(Pacientes o) {
        int result = this.getcodigoEmergencia().compareTo(o.getcodigoEmergencia());
		
		return result;
    }

    
}