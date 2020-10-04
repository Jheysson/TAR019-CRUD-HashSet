package pe.unjfsc.daw.spring5.entity;

public class CENatalidad {
	private int CUIA;
	private String fechNacimiento;
	private double peso;
	private double talla;
	private String genotipo;
	private String sexo;
	private int madre;
	private int padre;
	private int Estado;
	
	public CENatalidad() {
		
	}
	public CENatalidad(int CUIA, String fechNacimiento,double peso,double talla,String genotipo,String sexo,int madre,int padre,int Estado) {
		super();
		this.CUIA = CUIA;
		this.fechNacimiento = fechNacimiento;
		this.peso = peso;
		this.talla = talla;
		this.genotipo = genotipo;
		this.sexo = sexo;
		this.madre = madre;
		this.padre = padre;
		this.Estado = Estado;
	}
	public int getCUIA() {
		return CUIA;
	}
	public void setCUIA(int cUIA) {
		CUIA = cUIA;
	}
	public String getFechNacimiento() {
		return fechNacimiento;
	}
	public void setFechNacimiento(String fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getTalla() {
		return talla;
	}
	public void setTalla(double talla) {
		this.talla = talla;
	}
	public String getGenotipo() {
		return genotipo;
	}
	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getMadre() {
		return madre;
	}
	public void setMadre(int madre) {
		this.madre = madre;
	}
	public int getPadre() {
		return padre;
	}
	public void setPadre(int padre) {
		this.padre = padre;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CENatalidad [CUIA=");
		builder.append(CUIA);
		builder.append(", fechNacimiento=");
		builder.append(fechNacimiento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", genotipo=");
		builder.append(genotipo);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", madre=");
		builder.append(madre);
		builder.append(", padre=");
		builder.append(padre);
		builder.append(", Estado=");
		builder.append(Estado);
		builder.append("]");
		return builder.toString();
	}
}
