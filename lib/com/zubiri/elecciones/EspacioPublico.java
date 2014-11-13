package com.zubiri.elecciones;

public class EspacioPublico {

		// Declaracion de variables
		private int capacidad;
		private String tipo, pueblo, direccion;
		private boolean zonawifi;

		// Set y get de capacidad
		public void setCapacidad (int capacidad_intro)
 		{
			capacidad = capacidad_intro;
 		}
		
		public int getCapacidad()
 		{
			return capacidad;
 		}


 		// Set y get de tipo
		public void setTipo (String tipo_intro)
 		{
			tipo = tipo_intro;
 		}
		
		public String getTipo()
 		{
			return tipo;
 		}


 		// Set y get de pueblo
		public void setPueblo (String pueblo_intro)
 		{
			pueblo = pueblo_intro;
 		}
		
		public String getPueblo()
 		{
			return pueblo;
 		}


 		// Set y get de direccion
		public void setDireccion (String direccion_intro)
 		{
			direccion = direccion_intro;
 		}
		
		public String getDireccion()
 		{
			return direccion;
 		}


 		// Set y get de zonawifi
		public void setZonawifi (boolean zonawifi_intro)
 		{
			zonawifi = zonawifi_intro;
 		}
		
		public boolean getZonawifi()
 		{
			return zonawifi;
 		}
}