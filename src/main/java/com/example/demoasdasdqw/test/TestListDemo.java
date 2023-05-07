package com.example.demoasdasdqw.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestListDemo {


    public static void main(String[] args) {

    new Thread(){
        @Override
        public void run() {
            for (int i = 0;i<10;i++){
                System.out.println("11");
            }
        }
    }.start();
        System.out.println("222");

    }

    public int Substring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }




    public int[] twoSum(int[] nums, int target) {

            for (int i=0;i<nums.length-1;i++){
                if (target==nums[i]+nums[i+1]){
                    return new int[]{i,i+1};
                }
            }
        return new int[0];
    }



    @Bean(name = "Demoapp")
    public List<Integer> addlist(){
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(12);
        objects.add(212);
        System.out.println(objects);
        List<String> objects1 = Arrays.asList("1","w","sa");
        System.out.println(objects1);
        return objects;
    }

}
