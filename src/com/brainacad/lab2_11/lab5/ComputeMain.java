package com.brainacad.lab2_11.lab5;

/**
 * Created by SHARK on 03.02.2017.
 */
public class ComputeMain {
    static Long compute (Byte b,Integer i){
        Long l = new Long(b+i);
        return l;
       // return (long)  x + x1;
        // или так long c = x+x1 return c
        // return  = new Long (x + x1);
    }
    public static void main(String[] args) {
      Long l = compute(new Byte ((byte)11), new Integer ((int)111) );
        assert l ==1010 : "Value must equal 1010";
    }
}
