package com.zubiri.elecciones;

public class Partido {

		// Declaracion de variables
		private int miembros;
		private String nombre, ideologia, candidato;
		private boolean mandato;

		// Set y get de cantidadmiembros
		public void setMiembros (int miembros_intro)
 		{
			miembros = miembros_intro;
 		}
		
		public int getMiembros()
 		{
			return miembros;
 		}


 		// Set y get de nombre
		public void setNombre (String nombre_intro)
 		{
			nombre = nombre_intro;
 		}
		
		public String getNombre()
 		{
			return nombre;
 		}


 		// Set y get de ideologia
		public void setIdeologia (String ideologia_intro)
 		{
			ideologia = ideologia_intro;
 		}
		
		public String getIdeologia()
 		{
			return ideologia;
 		}


 		// Set y get de candidato
		public void setCandidato (String candidato_intro)
 		{
			candidato = candidato_intro;
 		}
		
		public String getCandidato()
 		{
			return candidato;
 		}


 		// Set y get de mandato
		public void setMandato (boolean mandato_intro)
 		{
			mandato = mandato_intro;
 		}
		
		public boolean getMandato()
 		{
			return mandato;
 		}
}