package com.zubiri.elecciones;

public class Habitante {

		// Declaracion de variables
		private int edad;
		private String nombre, direccion, telefono, dni;

		// Set y get de nombre
		public void setNombre (String nombre_intro)
 		{
			nombre = nombre_intro;
 		}
		
		public String getNombre()
 		{
			return nombre;
 		}


 		// Set y get de edad
		public void setEdad (int edad_intro)
 		{
			edad = edad_intro;
 		}
		
		public int getEdad()
 		{
			return edad;
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


 		// Set y get de telefono
		public void setTelefono (String telefono_intro)
 		{
			telefono = telefono_intro;
 		}
		
		public String getTelefono()
 		{
			return telefono;
 		}


 		// Set y get de dni
		public void setDni (String dni_intro)
 		{
			dni = dni_intro;
 		}
		
		public String getDni()
 		{
			return dni;
 		}
}