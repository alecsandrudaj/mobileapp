package com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class az {
    private static az c = null;
    private final BigInteger a = d();
    private BigInteger b = BigInteger.ONE;

    private az() {
    }

    public static synchronized az a() {
        az azVar;
        synchronized (az.class) {
            if (c == null) {
                c = new az();
            }
            azVar = c;
        }
        return azVar;
    }

    private static byte[] a(long j) {
        return BigInteger.valueOf(j).toByteArray();
    }

    private static BigInteger d() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            UUID randomUUID = UUID.randomUUID();
            instance.update(a(randomUUID.getLeastSignificantBits()));
            instance.update(a(randomUUID.getMostSignificantBits()));
            byte[] bArr = new byte[9];
            bArr[0] = (byte) 0;
            System.arraycopy(instance.digest(), 0, bArr, 1, 8);
            return new BigInteger(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
    }

    public synchronized BigInteger b() {
        return this.a;
    }

    public synchronized BigInteger c() {
        BigInteger bigInteger;
        bigInteger = this.b;
        this.b = this.b.add(BigInteger.ONE);
        return bigInteger;
    }
}
