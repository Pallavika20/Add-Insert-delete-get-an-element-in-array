package com.company;

import java.util.Arrays;

public class Mercedes {
    public int m=0,pos;
    int[] arr = new int[10];
    public void add(int n){
        if(m==arr.length){
            int[] arr1 = new int[arr.length+(arr.length/2)];
            for(int i=0;i<arr.length;i++){
                arr1[i]=arr[i];
            }
            arr=arr1;
        }
        arr[m]=n;
        m++;
        System.out.println(Arrays.toString(arr));
    }
    public void delete(int k){
        int l=arr.length;
        for(int i=0;i<l;i++){
            if(arr[i]==k){
                pos=i;
                break;
            }
        }
        l=l-1;
        for(int i=pos;i<l;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public void get(int h){
        if(h>=0 && h<=arr.length){
            System.out.println(arr[h]);
        }
        else{
            System.out.println("Array index out of bounds");
        }
    }
    public void insert(int j,int e){
        for(int i=0;i<arr.length;i++){
            if(i==j){
                arr[i]=e;
                arr[i]=arr[i-1];
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
