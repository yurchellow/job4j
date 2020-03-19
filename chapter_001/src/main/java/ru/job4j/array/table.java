package ru.job4j.array;

public class table {
    public static void main(String[] args) {
        int [][] array = {{1, 2}, {3, 4}};
        for (int i=0;i<=array.length/2;i++){
            for (int j=0;j<=array.length/2;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        }
    }
