package org.example;

import com.google.common.base.Charsets;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        System.out.println("Fetching object hash using Guava");

        final long long1 = System.currentTimeMillis();
        final String str1 = UUID.randomUUID().toString();
        final Object obj1 = UUID.randomUUID();

        HashFunction hf = Hashing.md5();
        HashCode hc = hf.newHasher()
                .putLong(long1)
                .putString(str1, Charsets.UTF_8)
                .hash();
        final String response = String.format("Result hashCode is: '%s'", hc.toString());
        System.out.println(response);


    }
}