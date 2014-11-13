package com.zubiri.elecciones;

public class Ayuntamiento {

		// Declaracion de variables
		private int trabajadores;
		private String pueblo, direccion;

		// Set y get de trabajadores
		public void setTrabajadores (int trabajadores_intro)
 		{
			trabajadores = trabajadores_intro;
 		}
		
		public int getTrabajadores()
 		{
			return trabajadores;
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
}