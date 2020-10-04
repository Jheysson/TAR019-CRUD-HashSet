package pe.unjfsc.daw.spring5.model;

public class CDNatalidad {
	private int[] CUIA;
	private String[] fechNacimiento;
	private double[] peso;
	private double[] talla;
	private String[] genotipo;
	private String[] sexo;
	private int[] madre;
	private int[] padre;
	private int[] estado;	
	
	public CDNatalidad() {
		int size = 5;
		
		//Inyección de datos CUIA
		CUIA = new int[size];
		for (int i = 0; i < size; i++) {
			CUIA[i] = 2000 + i + 1;
		}
		
		//Inyección de datos fechNacimiento
		fechNacimiento = new String[size];
		for (int i = 0; i < size; i++) {
			String fecha = "/09/2020";
			int conta = i+1;
			fechNacimiento[i] =String.valueOf(conta) +fecha;
		}
		
		//Inyección de datos peso
				peso = new double[size];
				peso[0] = 250;
				peso[1] = 300;
				peso[2] = 320;
				peso[3] = 230;
				peso[4] = 440;
				
		//Inyección de datos talla
				
				talla = new double[size];
				talla[0] = 1.5;
				talla[1] = 1.4;
				talla[2] = 1.39;
				talla[3] = 1.6;
				talla[4] = 1.61;	
		//Inyeccion de datos genotipo
				
				genotipo = new String[size];
				genotipo[0]="Hereford";
				genotipo[1]="Charolais";
				genotipo[2]="Limousin";
				genotipo[3]="Brahman";
				genotipo[4]="Gyrolando";
				
		//Inyección de datos sexo
		sexo = new String[size];
		for(int i=0; i<size ; i++) {
			if(i%2 == 0) {
				sexo[i] = "Macho";
			}else {
				sexo[i] = "Hembra";
			}
		}
		//Inyección de datos Madre
		madre = new int[size];
		for (int i = 0; i < size; i++) {
			madre[i] = 2000 + i + 1;
		}
		
		//Inyección de datos Padre
			padre = new int[size];
			for (int i = 0; i < size; i++) {
				padre[i] = 2000 + i + 1;
			}		
		//Inyección de datos estado
			estado = new int[size];
			for (int i = 0; i < size; i++) {
				estado[i] = 1;
			}
			
	}
	public CDNatalidad(int[] cUIA, String[] fechNacimiento, double[] peso, double[] talla, String[] genotipo,
			String[] sexo, int[] madre, int[] padre, int[] estado) {
		super();
		CUIA = cUIA;
		this.fechNacimiento = fechNacimiento;
		this.peso = peso;
		this.talla = talla;
		this.genotipo = genotipo;
		this.sexo = sexo;
		this.madre = madre;
		this.padre = padre;
		this.estado = estado;
	}

	public int[] getCUIA() {
		return CUIA;
	}

	public void setCUIA(int[] cUIA) {
		CUIA = cUIA;
	}

	public String[] getFechNacimiento() {
		return fechNacimiento;
	}

	public void setFechNacimiento(String[] fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}

	public double[] getPeso() {
		return peso;
	}

	public void setPeso(double[] peso) {
		this.peso = peso;
	}

	public double[] getTalla() {
		return talla;
	}

	public void setTalla(double[] talla) {
		this.talla = talla;
	}

	public String[] getGenotipo() {
		return genotipo;
	}

	public void setGenotipo(String[] genotipo) {
		this.genotipo = genotipo;
	}

	public String[] getSexo() {
		return sexo;
	}

	public void setSexo(String[] sexo) {
		this.sexo = sexo;
	}

	public int[] getMadre() {
		return madre;
	}

	public void setMadre(int[] madre) {
		this.madre = madre;
	}

	public int[] getPadre() {
		return padre;
	}

	public void setPadre(int[] padre) {
		this.padre = padre;
	}

	public int[] getEstado() {
		return estado;
	}

	public void setEstado(int[] estado) {
		this.estado = estado;
	}
}
