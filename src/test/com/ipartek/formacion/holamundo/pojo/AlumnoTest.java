package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
		Alumno a = new Alumno();
		assertTrue("No coincide el nombre", Alumno.NOMBRE_ANONIMO.equals(a.getNombre()));
		assertTrue("No coinciden apelllidos", "".equals(a.getApellidos()));
		assertTrue("No coincide el becado", a.isBecado()==true);
		assertTrue("No coincide la edad", "0".equals(a.getEdad()));
		assertTrue("No coincide el sexo", a.getSexo()==Alumno.SEXO_INDEFINIDO);
	}

	@Ignore
	public void testAlumnoString() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}
