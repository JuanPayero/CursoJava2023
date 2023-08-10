public class Componente {
	private String nombre;
	private float valor;
	private String unidad;
	private int frecuencia;
	//construcctores
	
	//accessors
	public void setNombre(String pNom){
		nombre = pNom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setUnidad(String pNom){
		unidad = pNom;
	}
	public String getUnidad(){
		return unidad;
	}
	public void setValor(float pNom){
		nombre = pNom;
	}
	public float getValor(){
		return valor;
	}
	public void setFrecuencia(int pNom){
		frecuencia = pNom;
	}
	public int getFrecuencia(){
		return frecuencia;
	}
	
	
	//negocio
	
}