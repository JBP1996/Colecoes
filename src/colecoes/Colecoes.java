/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JBP1996 Atec
 */
public class Colecoes {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList lista = new ArrayList();
        int[] lista={1,2};
        int[] lista_temp=new int[lista.length];
        boolean continua=true;
        System.out.println("Insira um valor:");
        int a = new Scanner(System.in).nextInt();
        for(int i=0;i<lista.length;i++){
            lista_temp[i]=lista[i];
        }
        lista =new int[lista.length+1];
        for(int i=0;i<lista.length;i++){
            if(i<lista_temp.length){
                lista[i]=lista_temp[i];
            }else{
                lista[i]=a;
            }
        }
        System.out.println("tamanho: "+lista.length);
        for(int i=0;i<lista.length;i++){
            if(i<lista_temp.length){
                System.out.println("valores temp: "+lista_temp[i]);
            }
            System.out.println("valores: "+lista[i]);
        }
        
        while(continua==true){
            /*
            System.out.println("Insira um valor:");
            int a = new Scanner(System.in).nextInt();
            //lista.add(a);
            */
            System.out.println("Deseja continuar a inserir\n Digite S ou s ou Sim ou sim se quiser continuar\n Digite outro valor se nao quizer");
            String continuar = new Scanner(System.in).next();
            if(continuar.equals("S") || continuar.equals("s") || continuar.equals("Sim") || continuar.equals("sim")){
                continua=true;
            }else{
                continua=false;
            }
        };
        
        System.out.println(lista);
    }
    
}
