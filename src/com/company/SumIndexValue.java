package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SumIndexValue {
    public static void Main(String[] args){

        int[] test = {2,1,3,4,1};
        int[] result = solution(test);

        System.out.println(result.toString());
    }
    private static int[] solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i < numbers.length; i++){
            for(int j= i+1; j < numbers.length; j++){
                result.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = result.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
        //만약 내림차순일경우
        //int[] answer = result.stream().distinct().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        return answer;
    }

}
