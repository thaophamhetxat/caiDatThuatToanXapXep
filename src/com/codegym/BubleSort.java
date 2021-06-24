package com.codegym;

public class BubleSort {
    static int[]list = {2,3,4,5,6,7,1,-2,14,12};
    public static void bubleSort(int[]list){
        boolean needNextPass = true;
        for(int k=1;k< list.length && needNextPass;k++){
            needNextPass = false;
            for(int i=0;i<list.length-k;i++){
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                    needNextPass=true;
                }
            }
        }
    }
    public static void main(String[] args) {
        bubleSort(list);
        for (int i= 0;i<list.length;i++){
            System.out.println(list[i]+" ");
        }
    }
}

