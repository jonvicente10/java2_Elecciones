package com.zubiri.elecciones;

public class Inmueble {

		// Declaracion de variables
		private int area, plantas, año;
		private String direccion, dueño;

		// Set y get de area
		public void setArea (int area_intro)
 		{
			area = area_intro;
 		}
		
		public int getArea()
 		{
			return area;
 		}


 		// Set y get de plantas
		public void setPlantas (int plantas_intro)
 		{
			plantas = plantas_intro;
 		}
		
		public int getPlantas()
 		{
			return plantas;
 		}	


 		// Set y get de año
		public void setAño (int año_intro)
 		{
			año = año_intro;
 		}
		
		public int getAño()
 		{
			return año;
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


 		// Set y get de dueño
		public void setDueño (String dueño_intro)
 		{
			dueño = dueño_intro;
 		}
		
		public String getDueño()
 		{
			return dueño;
 		}
}