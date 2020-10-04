package pe.unjfsc.daw.spring5.model;

public class CDPropietarioInseminacion {
	private int[] codigo;
	private double[] peso;
	private double[] talla;
	private String[] lugar;
	private double[] precio;
	private String[] fechcompra;
	private int[] estado;
	private String[] genotipo;
	private String[] obse;
	
	public CDPropietarioInseminacion() {
		
		int size = 5;
		
		//inyectar datos
		codigo= new int[size];
		codigo[0] = 120;
		codigo[1] = 220;
		codigo[2] = 320;
		codigo[3] = 420;
		codigo[4] = 520;
		
		//inyectar pesos
		peso = new double[size];
		peso[0] = 620.00;
		peso[1] = 600.00;
		peso[2] = 618.00;
		peso[3] = 578.00;
		peso[4] = 588.00;
		
		//inyectar tallas
		talla = new double[size];
		talla[0] = 1.61;
		talla[1] = 1.63;
		talla[2] = 1.54;
		talla[3] = 1.72;
		talla[4] = 1.68;
		
		//inyectar lugar 
		lugar = new String[size];
		lugar[0] = "Establo 1";
		lugar[1] = "Establo 2";
		lugar[2] = "Establo 3";
		lugar[3] = "Establo 4";
		lugar[4] = "Establo 5";
		
		//inyectar precios
		precio = new double[size];
		precio[0] = 20.00;
		precio[1] = 24.00;
		precio[2] = 18.00;
		precio[3] = 22.00;
		precio[4] = 25.00;
		
		
		//inyectar fechas
		fechcompra = new String[size];
		for(int i= 0; i < size; i++) {
			String fecha = "/09/2020";
			int contador = i+1;
			fechcompra[i] = String.valueOf(contador) +fecha;
		}
		
		//inyectar estado
		estado = new int[size];
		for(int i = 0; i < size; i++) {
			estado[i] = 1;
		}
		
		//inyectar genotipo
		genotipo = new String[size];
		genotipo[0] = "Hereford";
		genotipo[1] = "Charolais";
		genotipo[2] = "Brahman";
		genotipo[3] = "Lomousin";
		genotipo[4] = "Gyrolando";
		
		//inyectar observacion
		obse = new String[size];
		obse[0] = "N/O";
		obse[1] = "N/O";
		obse[2] = "N/O";
		obse[3] = "N/O";
		obse[4] = "N/O";
		
		
	}
	
	public CDPropietarioInseminacion(int[] Codigo, double[] peso, double[] talla, 
	String[] lugar, double[] precio, String[] fechcompra, int[] estado, String[] genotipo, 
	String[] obse) {
			
			super();
		codigo = Codigo;
		this.peso = peso;
		this.talla = talla;
		this.lugar = lugar;
		this.precio = precio;
		this.fechcompra = fechcompra;
		this.estado = estado;
		this.genotipo = genotipo;
		this.obse = obse;
	}
	

	public int[] getcodigo() {
		return codigo;
	}

	public void setcodigo(int[] Codigo) {
		codigo = Codigo;
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

	public String[] getLugar() {
		return lugar;
	}

	public void setLugar(String[] lugar) {
		this.lugar = lugar;
	}

	public double[] getPrecio() {
		return precio;
	}

	public void setPrecio(double[] precio) {
		this.precio = precio;
	}

	public String[] getFechcompra() {
		return fechcompra;
	}

	public void setFechcompra(String[] fechcompra) {
		this.fechcompra = fechcompra;
	}

	public int[] getEstado() {
		return estado;
	}

	public void setEstado(int[] estado) {
		this.estado = estado;
	}

	public String[] getGenotipo() {
		return genotipo;
	}

	public void setGenotipo(String[] genotipo) {
		this.genotipo = genotipo;
	}

	public String[] getObse() {
		return obse;
	}

	public void setObse(String[] obse) {
		this.obse = obse;
	}

}



