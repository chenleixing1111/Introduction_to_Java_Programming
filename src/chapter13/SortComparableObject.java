package chapter13;

import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObject {
    public static void main(String[] args){
        String[] cities = {"chengdu", "chongqing", "beijing", "beihai"};
        Arrays.sort(cities);
        for(String city: cities){
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323232323233"), new BigInteger("4343436623466"), new BigInteger("565656566466565")};
        Arrays.sort(hugeNumbers);
        for(BigInteger number: hugeNumbers){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
