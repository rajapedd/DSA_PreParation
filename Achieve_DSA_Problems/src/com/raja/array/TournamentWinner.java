package com.raja.array;

import java.util.*;

public class TournamentWinner {
    public static void main(String[] args) {
        List<String> li1= Arrays.asList("HTML", "C#");
        List<String> li2= Arrays.asList("C#", "Python");
        List<String> li3= Arrays.asList("Python", "HTML");
        List<List<String>> competitions=new ArrayList<>();
        competitions.add(li1);
        competitions.add(li2);
        competitions.add(li3);

        List<Integer> results= Arrays.asList(0,0,1);
       tournamentWinner(competitions, results);
    }

    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        int resultVal=0;
        String out=null;
        int competitionIndex=0;
        Map<String, Integer> comp= new HashMap<>();
        for(int i=0;i<results.size();i++){
            int internalVal=0;
            String outputVal=null;
           if(results.get(i)==0){
               outputVal= competitions.get(competitionIndex).get(1);
               internalVal+=3;
           }else {
               outputVal= competitions.get(competitionIndex).get(0);
               internalVal+=3;
           }
            competitionIndex++;
//            if(resultVal < internalVal){
//                resultVal=internalVal;
//            }

           if(comp.containsKey(outputVal)){
               comp.put(outputVal, comp.get(outputVal)+3);
           }else{
               comp.put(outputVal,3);
           }

           }
        System.out.println(comp.toString());
        for(String compet : comp.keySet()){
            if(comp.get(compet)>resultVal){
                resultVal =comp.get(compet);
                out=compet;
            }
        }

        System.out.println("Highest Points Owned By ::"+out);
        return out;
    }
}
