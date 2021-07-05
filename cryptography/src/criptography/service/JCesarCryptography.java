package criptography.service;

import criptography.repository.CryptographyRepository;

/**
 * Cryptography is a class that receives a message and encrypt or decrypt this message.
 * @author Carlos Guilherme
 *
 */
public class JCesarCryptography implements CryptographyRepository {

	/**
	 *@param message The message that has to be encrypted
	 *@param steps The quantity of houses considered in the cryptography
	 *@return messageEncrypted The encrypted message
	 */
	@Override
	public String encrypt(String message, int steps) {
		String messageEncripted = "";
		messageEncripted = messageConversion(message, true, steps);

		return messageEncripted;
	}

	/**
	 *@param message The message that has to be decrypted
	 *@param steps The quantity of houses considered in the cryptography
	 *@return messageDecrypted The decrypted message
	 */
	@Override
	public String decrypt(String message, int steps) {
		String messageDecrypted = "";
		messageDecrypted = messageConversion(message, false, steps);

		return messageDecrypted;
	}

	
	/**
	 * @param message The message that has to be encrypted/decrypted
	 * @param encript A boolean that informs it will be an encryption or a decryption
	 * @param steps The quantity of houses that has to be considered in the cryptography
	 * @return messageConverted
	 */
	public String messageConversion(String message, boolean encript, int steps) {
		String messageConverted = "";
		steps = encript ? steps : steps * (-1);

		for (char character : message.toLowerCase().toCharArray()) {
			messageConverted = (int) character == 32 ? messageConverted + ' '
					: (isNumber(character) ? messageConverted + character
							: messageConverted + (char) (characterLimitAdjust(character, steps) + steps));
		}

		return messageConverted;
	}

	/**
	 * Verifies if the received character is a number.
	 * @param character The character received
	 * @return true or false
	 */
	public boolean isNumber(char character) {
		return ((int) character >= 48 && (int) character <= 57) ? true : false;
	}

	
	/**
	 * Verifies if the received character can be converted to a forward position based on the informed steps
	 * @param character The character that has to be analyzed
	 * @param steps The quantity of houses that has to be considered in the cryptography
	 * @return The same ASCII of the character or an adjusted ASCII if the limit is exceeded
	 */
	public char characterLimitAdjust(char character, int steps) {
		return ((int) character + steps > 122) ? (char) ((char) (character - 26)) 
				: ((int) character + steps < 97) ? (char) ((char) (character + 26)) : character;
	}
}
