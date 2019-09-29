/**
 * @(#)Britama.java
 *
 *
 * @author 
 * @version 1.00 2019/9/29
 */


public class Britama {

    public static void main(String[] args) {
    	int jmlTarikan = 50000;
    	int jmlSetoran = 25000;
    	Tabungan tab = new Tabungan();
    	tab.setSaldo("Dwi", 50000);
    	System.out.println("__________________________________");
    	System.out.println("SISTEM INFORMASI TABUNGAN BRITAMA");
    	System.out.println("__________________________________");
    	System.out.println("Nama Nasabah : " +tab.nama);
    	System.out.println("Saldo Awal : " +tab.saldo);
    	
    	System.out.println("");
    	System.out.println("Jumlah Setoran = "+jmlSetoran);
    	tab.menabung(jmlSetoran);
    	System.out.println("Saldo setelah penyetoran :" +tab.infoSaldo());
    	System.out.println("__________________________________");
    	System.out.println("");
    	
    	System.out.println("");
    	System.out.println("Jumlah Tarikan = "+jmlTarikan);
    	tab.ambilUang(jmlTarikan);
    	System.out.println("Saldo setelah penarikan :" +tab.infoSaldo());
    	System.out.println("__________________________________");
    	System.out.println("");
    }
    
    
}