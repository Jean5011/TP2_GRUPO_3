package packageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.entidad.Email;

class EmailTest {
	
	@Test
	public void testValidarCorreo_conNumero_retornaTrue() {
		assertTrue(Email.validarCorreo("Pruebacorreo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_sinNumero_retornaFalse() {
		assertFalse(Email.validarCorreo("Pruebacorreo@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_conOchoDigitos_retornaTrue() {
		assertTrue(Email.validarCorreo("Pruebacorreo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_sinOchoDigitos_retornaFalse() {
		assertFalse(Email.validarCorreo("p@gmai"));

	}
	
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		assertTrue(Email.validarCorreo("Pruebacorreo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
		assertFalse(Email.validarCorreo("pruebacorreo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_conLetraMinuscula_retornaTrue() {
		assertTrue(Email.validarCorreo("PRUEBACORREO2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_sinLetraMinuscula_retornaFalse() {
		assertFalse(Email.validarCorreo("PRUEBACORREO2@GMAIL.COM"));
	}
	
	@Test
	public void testValidarCorreo_conAlfanumerico_retornaTrue() {
		assertTrue(Email.validarCorreo("Pruebacorreo2@gmail.com"));
	}
	
	@Test
	public void testValidarCorreo_sinAlfanumerico_retornaFalse() {
		assertFalse(Email.validarCorreo("@*/.[]"));
	}

}
