package chapter13;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.ArrayList;

public class LargestNumbers {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("34323232323242323413"));
        list.add(new BigDecimal("2.00909090909909090"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() == 0){
            return null;
        }

        Number result = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(result.doubleValue() < list.get(i).doubleValue()){
                result = list.get(i);
            }
        }

        return result;
    }
}
