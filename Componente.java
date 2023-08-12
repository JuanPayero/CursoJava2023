
public class Componente {

		private String nombre;
		private float valor;
		private String unidad;
		private int frecuencia;
		//constructores
		
		//accessors
		public void setNombre(String pNom){
			nombre = pNom;
		}
		public String getNombre(){
			return nombre;
		}
		public void setUnidad(String pUni){
			unidad = pUni;
		}
		public String getUnidad(){
			return unidad;
		}
		public void setValor(float pVal){
			valor = pVal;
		}
		public float getValor(){
			return valor;
		}
		public void setFrecuencia(int pFrec){
			frecuencia = pFrec;
		}
		public int getFrecuencia(){
			return frecuencia;
		}
		
		
		//negocio
		
	}
