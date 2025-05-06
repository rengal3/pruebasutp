/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.utpproyectogit;

import java.util.Random;

/**
 *
 * @author Renato Galdo
 * Pequeño cambio
 */
public class LaboratorioSemana03 {
    
    private int prueba;
    private int a_edad[],a_aniosCliente[],
            a_gradoSatisfaccion[];
    private int logto;
    
    private int edad_creacion;
    
    private final String a_posiblesAnios[]={"Maricielo vuelve :'v",
                                            "Nesecito mas esencia",
                                            "Entre 4 y 8 anios",
                                            "Mas de 8 anios"};
    private final String a_posiblesSatisfaccion[]={"Excelente",
                                            "Muy bueno",
                                            "Bueno",
                                            "Regular",
                                            "Malo"};
    
    public LaboratorioSemana03(int numClientes){
        this.a_edad=new int[numClientes];
        this.a_aniosCliente=new int[numClientes];
        this.a_gradoSatisfaccion=new int[numClientes];               
    }
    
    public void generarYmostrarParalelos(){
        Random aleatorio=new Random();
        for (int i=0;i<a_edad.length;i++){
            this.a_edad[i]=aleatorio.nextInt(18, 66);
            this.a_aniosCliente[i]=aleatorio.nextInt(4);
            this.a_gradoSatisfaccion[i]=aleatorio.nextInt(5);
        }
        this.imprimirDatos();
    }
    
    public void imprimirDatos(){
        for(int i=0;i<this.a_edad.length;i++){
            System.out.println("Cliente n. "+(i+1)+" : edad : "+
                    this.a_edad[i]+"\t - Anios de cliente: "+
                    this.a_posiblesAnios[this.a_aniosCliente[i]]+
                    "\t - Grado Satisf.: "+
                    this.a_posiblesSatisfaccion[this.a_gradoSatisfaccion[i]]);
        }
    } 
    
    public void porcentaje_4y8_malo(){
        int contador=0;
        for (int i=0;i<this.a_edad.length;i++){
            if(this.a_aniosCliente[i]==2 &&
                    this.a_gradoSatisfaccion[i]==4){
                contador+=1;
            }
        }        
        System.out.println("\nPorcentaje de encuestados "
                + "que son clientes entre 4 y 8 anios y grado "
                + "de satisfaccion malo es de: "+((Integer.valueOf(contador)).floatValue() /
                        (Integer.valueOf(this.a_edad.length)).floatValue()*100)+" %\n");
    }
    
    public void promedioEdad(){
        int contador=0,sumaEdades=0;
        for (int i=0;i<this.a_edad.length;i++){
            if(this.a_gradoSatisfaccion[i]==0){
                contador+=1;
                sumaEdades+=this.a_edad[i];
            }
        }        
        System.out.println("\nPromedio de edad de los clientes que consideran "
                + "el servicio brindado Excelente es de: "+((Integer.valueOf(sumaEdades)).floatValue() /
                        (Integer.valueOf(contador)).floatValue())+"\n");
        
    }
    
    public void listadoOrdenado(){
        int aux=0;
        for (int i=0;i<this.a_edad.length-1;i++){
            for (int j=0;j<(this.a_edad.length-1-i);j++){
                if(this.a_edad[j]>this.a_edad[j+1]){
                    aux=this.a_edad[j];
                    this.a_edad[j]=this.a_edad[j+1];
                    this.a_edad[j+1]=aux;
                    
                    aux=this.a_aniosCliente[j];
                    this.a_aniosCliente[j]=this.a_aniosCliente[j+1];
                    this.a_aniosCliente[j+1]=aux;
                    
                    aux=this.a_gradoSatisfaccion[j];
                    this.a_gradoSatisfaccion[j]=this.a_gradoSatisfaccion[j+1];
                    this.a_gradoSatisfaccion[j+1]=aux;
                }
            }
        }
        this.imprimirDatos();        
    }
    
   public void probandoJosue (){
       //hola
}
                
    public static void main (String args[]){
        LaboratorioSemana03 ejemplo=new LaboratorioSemana03(50);
        ejemplo.generarYmostrarParalelos();
        ejemplo.porcentaje_4y8_malo();
        ejemplo.promedioEdad();
        ejemplo.listadoOrdenado();
    }
    
}
