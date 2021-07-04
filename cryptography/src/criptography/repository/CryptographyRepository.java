package criptography.repository;


/**
 * An interface that has the contract to be satisfied by an Adapter
 * @author carlo *
 */
public interface CryptographyRepository {

	/**
	 * This method has to be implemented by a class.
	 * @param message The message that has to be encrypted
	 * @param steps The quantity of houses considered in the cryptography
	 * @return The encrypted message
	 */
	public String encrypt(String message, int steps);

	
	/**
	 * This method has to be implemented by a class.
	 * @param message The message that has to be decrypted
	 * @param steps The quantity of houses considered in the cryptography
	 * @return The decrypted message
	 */
	public String decrypt(String message, int steps);

}
