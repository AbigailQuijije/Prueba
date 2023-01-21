import java.util.Scanner;

public class Fecha {
    int dia;
    int mes;
    int año;
    public Fecha(){
    }
    public Fecha(int dia, int mes, int año){
            this.dia = dia;
            this.mes = mes;
            this.año = año;
            }
            public void setDia(int d){
                dia = d;
            }
            public void setMes(int m){
                mes = m;
            } 
            public void setAño(int a){
                año = a;
            }    
            public int getDia (){
                 return dia;
            }
            public int getMes (){
                 return mes;
            }
            public int getAño (){
                 return año;
            }
         public String toString(){
             StringBuilder cons = new StringBuilder ();
             if(dia<10){
                 cons.append("0");
             }
             cons.append(dia);
             cons.append("-");
             if (mes<10){
                 cons.append("0");
             }
             cons.append(mes);
             cons.append("-");
             cons.append(año);
             return cons.toString();
         
         }
         public void adelantar ();{
            dia++;
            if(!normalizar()){
                dia=1;
                mes++;
                if(!normalizar()){
                    mes=1;
                    año++;
                }
            }
        
         }