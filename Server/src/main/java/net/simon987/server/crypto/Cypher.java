package net.simon987.server.crypto;

interface Cypher {

	char[] encrypt(char[] plainText, char[] key) throws CryptoException;

	char[] decrypt(char[] cypherText, char[] key) throws CryptoException;

	String textCharset();

	String keyCharset();

}