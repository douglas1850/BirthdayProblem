import java.util.*;

public class Main {
    //Write a program to exemplify the "birthday problem." Randomly pick 70 numbers between 1 and 366. 99% of time get match

    public static void main(String args[]){
        int matchCount = 0;
        int[] birthdayArray1 = new int[34]; //create new array for 35 peoples birthday
        int[] birthdayArray2 = new int[34]; //second array for the other half of 70 people

        int arraySize = birthdayArray1.length;

        birthdayArray1 = FillUpArray(birthdayArray1, arraySize);
        birthdayArray2 = FillUpArray(birthdayArray2, arraySize);

        for(int i = 0; i < arraySize; i++){
            for(int j = 0; j < arraySize; j++){
                if(birthdayArray1[i] == birthdayArray2[j]){
                    System.out.println("Match found on: " + birthdayArray1[i] + ". Positions " + i + " " + j);
                    matchCount++;
                }
            }
        }
        System.out.println("Match count = " + matchCount);
    }

    //function to fill up birthday array with new random numbers
    public static int[] FillUpArray(int[] bdays, int arraySize){
        Random rand = new Random();
        int value;
        for(int i = 0; i < arraySize; i++){
            value = rand.nextInt(366); //generates random number from 0 to 365
            //System.out.println(value);
            bdays[i] = value;
        }
        return bdays;
    }


}
