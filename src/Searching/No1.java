package Searching;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args){
        System.out.println("***** SEQUENTIAL SEARCH *****" +"\n");
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Laeli Nurafiah", "Tesla"};
        String key ;
        
        //Fitur Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan data yang dicari : ");
        key = scan.nextLine();
        System.out.println();
        
        //Menampilkan data array
        System.out.print("Isi data adalah : ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            
        }
        
        System.out.println("");
        
        for(int i = 0; i < data.length; i++){
            if(key.equalsIgnoreCase(data[i])){
                System.out.print("Data " + key + " Berada pada indeks ke - " + i);
                break; //Stop perulangan
            }
        }
        
        System.out.println("\n");
        System.out.println();
        System.out.println("***** Terima Kasih *****");
        
    }   
        
    }
