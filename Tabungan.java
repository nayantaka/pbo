/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2019/9/29
 */


public class Tabungan {

    String nama;
    int saldo;
    
    public  void setSaldo(String NamaNasabah, int sal){
    	saldo =  sal;
    	nama = NamaNasabah;
    }
    
     public void menabung(int setoran){
     	saldo = saldo + setoran;
     }
     
     public void ambilUang(int tarikan){
     	saldo = saldo - tarikan;
     }
     
     public int infoSaldo(){
     	return saldo;
     }
    
}