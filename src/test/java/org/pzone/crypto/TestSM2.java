package org.pzone.crypto;

import org.bouncycastle.math.ec.ECPoint;

import java.math.BigInteger;

public class TestSM2 {

    public static void main(String[] args) {
//        SM2 x = new SM2();
//        SM2KeyPair keys = x.generateKeyPair();
//        ECPoint pubKey = keys.getPublicKey();
//        BigInteger privKey = keys.getPrivateKey();
//        byte[] data = x.encrypt("Hello World", pubKey);
//        System.out.println("encrypt: " + data);
//        String origin = x.decrypt(data, privKey);
//        System.out.println("decrypt: " + origin);
        SM2 x = new SM2();
        SM2KeyPair keys = x.generateKeyPair();
        ECPoint pubKey = keys.getPublicKey();
        BigInteger privKey = keys.getPrivateKey();
        byte[] data = x.encrypt("Hello World", pubKey);
        System.out.println("公钥: " + pubKey);
        System.out.println("公钥: "+Base64Util.Encode64("TEST123".getBytes())+Base64Util.Encode64(pubKey.getEncoded()));
        System.out.println("私钥: " + privKey);
        String s = "8#"+Base64Util.Encode64(String.valueOf(privKey).getBytes())+"#"+Base64Util.Encode64("TEST123".getBytes());
        System.out.println("私钥: " + Base64Util.Encode64(s.getBytes()));
    }
}
