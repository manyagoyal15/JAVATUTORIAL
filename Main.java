/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String sr1[]=new String[2];
        sr1=s1.split(" ",2);
        int size=Integer.parseInt(sr1[0]);
        int k=Integer.parseInt(sr1[1]);
        String sr2[]=new String[size];
        String s2=sc.nextLine();
        sr2=s2.split(" ",size);
        int A[]=new int[size];
        for(int i=0;i<size;i++){
            A[i]=Integer.parseInt(sr2[i]);
        }
        compute c=new compute();
        c.printmax(A,k);
	}
}
class compute{
    void printmax(int ar[],int k){
        int max=0;
        for(int i=0;i<=(ar.length-k);i++){
            max=ar[i];
            for(int j=i;j<(i+k);j++){
                if(max<ar[j]){
                    max=ar[j];
                }
            }
            System.out.print(max+"");
        }
        
    }
}

