package criptography.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import cryptography.adapters.Cryptography;

/**
 * The JUnit Test Class that tests all  methods of Cryptography.class
 * @author Carlos Guilherme
 */
class CryptographyTest {

	Cryptography criptography = new Cryptography();

	@Test
	void whenReceivesAString_thenReturnADecryptedMessage() {
		assertEquals("a ligeira raposa marrom saltou sobre o cachorro cansado",
				criptography.decrypt("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr", 3));
	}

	@Test
	void whenReceivesAString_thenReturnAEncryptedMessage() {
		assertEquals("d oljhlud udsrvd pduurp vdowrx vreuh r fdfkruur fdqvdgr",
				criptography.encrypt("a ligeira raposa marrom saltou sobre o cachorro cansado", 3));
	}

	@Test
	void whenReceivesAStringWithNumber_thenReturnADecryptedMessageKeepingTheNumber() {
		assertEquals("a ligeira3 raposa marrom8 saltou sobre o cachorro cansado",
				criptography.decrypt("d oljhlud3 udsrvd pduurp8 vdowrx vreuh r fdfkruur fdqvdgr", 3));
	}

	@Test
	void whenReceivesAStringWithAlphabetInUpperCase_thenReturnTheCryptedAlphabetInUpperCase() {
		assertEquals("DEFGHIJKLMNOPQRSTUVWXYZABC", criptography.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 3));
	}

	@Test
	void whenReceivesAStringWithAlphabetInLowerCase_thenReturnTheCryptedAlphabetInLowerCase() {
		assertEquals("DEFGHIJKLMNOPQRSTUVWXYZABC".toLowerCase(),
				criptography.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ".toLowerCase(), 3));
	}
}
