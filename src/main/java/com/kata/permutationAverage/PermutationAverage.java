package com.kata.permutationAverage;

import java.util.ArrayList;
import java.util.List;

public class PermutationAverage {
    public static void main(String[] args) {
        Integer number =  1256;
        String numberInString = String.valueOf(number);
        List<String> liste = new ArrayList<>();
        permute("ABC","",liste);
        System.out.println("liste = " + liste);
       // System.out.println("moyenne = " + liste.stream().mapToInt(Integer::valueOf).average());
    }
    private static void permute(String world, String prefix, List<String> list){
        if(world.length()==0){
            list.add(prefix);
            return ;
        }
        for (int i = 0; i < world.length() ; i++) {
            char caractere = world.charAt(i);
            String concat = world.substring(0, i).concat(world.substring(i + 1 ));
            permute(concat,prefix+caractere,list);
        }
    }


}
