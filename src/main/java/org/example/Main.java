package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Pancake Sıralama (pancake sort)"
// algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {
    static void dondur(int[] a,int k){
        int j = 0,g;
            while (j<k){
            g = a[j]; a[j]=a[k]; a[k]= g; j++; k--;
        }
    }

    static int indisMax(int[] a,int k){
        int i;
        int max = 0;

        for (i=1; i<=k; i++)
            if (a[max]<a[i])
                max=i;
        return max;
    }

    static void pancakeSort(int[] a, int n){
        int i;
        int imax;

        for (i=n-1; i>0; i--){
            imax = indisMax(a,i);
            if (imax!=i){
                if (imax!=0)
                    dondur(a,imax);
                dondur(a,i);
            }
        }
    }

    public static void main(String[] args) {

        int i,n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDizinin Eleman Sayısı : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println();

            for (i=0; i<n; i++){
                System.out.print("A("+(i+1)+")=");
                a[i] = scanner.nextInt();
            }
            pancakeSort(a,n);
        System.out.print("\nSıralı Dizi : \n------------\n");
        for (i=0; i<n; i++)
            System.out.printf("%d\t",a[i]);
    }
}