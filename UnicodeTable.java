public class UnicodeTable {
    public static void main (String [] args){
        char c = '\u0000';
           for (int i = 0; i <= 65536; i++){
                System.out.print(i + " "+  c + "\t\t");
                c++;
              if (c % 8 == 0){    
                   System.out.print ("\n");
                    }
            }  
    }
        
