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
		assertTrue(Email.validarCorreo("usuario12345678@dominio.com"));
		assertTrue(Email.validarCorreo("a1b2c3d4e5@test.com"));
	}
	
	@Test
	public void testValidarCorreo_sinOchoDigitos_retornaFalse() {
		assertFalse(Email.validarCorreo("usuario123@dominio.com"));
        assertFalse(Email.validarCorreo("sin-digitos@test.com"));
        assertFalse(Email.validarCorreo("muchos123456789@test.com"));
	}
	
	@Test
	public void testValidarCorreo_conLetraMayuscula_retornaTrue() {
		
	}
	
	@Test
	public void testValidarCorreo_sinLetraMayuscula_retornaFalse() {
		
	}
	
	@Test
	public void testValidarCorreo_conLetraMinuscula_retornaTrue() {
		
	}
	
	@Test
	public void testValidarCorreo_sinLetraMinuscula_retornaFalse() {
		
	}
	
	@Test
	public void testValidarCorreo_conAlfanumerico_retornaTrue() {
		
	}
	
	@Test
	public void testValidarCorreo_sinAlfanumerico_retornaFalse() {
		
	}

}
