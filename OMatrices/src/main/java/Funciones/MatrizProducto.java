package Funciones;

public class MatrizProducto {
    public static void main(String[] args) {
        int matriz_a [][] = new int [2][2];
        int matriz_b [][] = new int [2][2];
        int matriz_c [][] = new int [2][2];
        int sum [][]= new int [2][2];
        int total [][] = new int [2][2];
        
        //Llenado de la matriz a (Primer Sumando)   
        matriz_a [0][0]= 1;
        matriz_a [0][1]= 2;
        matriz_a [1][0]= 0;
        matriz_a [1][1]= 6;
        
        //Llenado de la matriz b (Segundo Sumando)
        matriz_b [0][0]= 3;
        matriz_b [0][1]= 4;
        matriz_b [1][0]= 1;
        matriz_b [1][1]= 2;
        
        //Llenado de la matriz c (Factor del Producto)
        matriz_c [0][0]= 2;
        matriz_c [0][1]= 4;
        matriz_c [1][0]= 3;
        matriz_c [1][1]= 5;
        
        //Suma 
        for (int i = 0; i < matriz_a.length; i++) {
            for (int j = 0; j < matriz_b.length; j++){
                sum[i][j] = matriz_a[i][j] +  matriz_b[i][j];
            }
        }
        
        //Multiplicacion
        for (int i = 0; i < 4; i++){
            
            if(total[0][0] == 0) {
                int resultado = (sum[0][0] * matriz_c[0][0])
                        + (sum[0][1] * matriz_c[1][0]);
                
                total[0][0] = resultado;                
            }else if (total[0][1] == 0 ){
                int resultado = (sum[0][0] * matriz_c [0][1])
                        + (sum[0][1] * matriz_c[1][1]);
                
                total[0][1] = resultado;                
            }else if (total[1][0] == 0 ){
                int resultado = (sum[1][0] * matriz_c [0][0])
                        + (sum[1][1] * matriz_c[1][0]);
                
                total[1][0] = resultado;
            }else if (total[1][1] == 0 ){
                int resultado = (sum[1][0] * matriz_c [0][1])
                        + (sum[1][1] * matriz_c[1][1]);
                
                total[1][1] = resultado;
            }
        } 
        
        //Imprimir Matriz Final
        
        System.out.print("La Matriz Resultante es:");   
        System.out.println("        ");           
        
        for (int i = 0; i < total.length; i++) {

            System.out.print("|");
            for (int j = 0; j < total[i].length; j++) {
                System.out.print(total[i][j]);
                if (j != total[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
        
    }
    
}
