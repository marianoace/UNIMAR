package m_triangular;

public class MatrizT {

    public static void main(String[] Args) {

        int matriz[][] = new int[3][3];

        //Definir Matriz para la Validacion 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 3);
            }        
        }

        //Establecer Condiciones de una matriz triangular 
        
        if (matriz[1][0] == 0) {
            if (matriz[2][0] == 0) {
                if (matriz[2][1] == 0) {

                    for (int i = 0; i < matriz.length; i++) {                        
                        System.out.print("|");
                        for (int j = 0; j < matriz[i].length; j++){
                            System.out.print(matriz[i][j]);
                            if (j != matriz[i].length - 1) {
                                System.out.print("\t");
                            }
                        }
                        System.out.println("|");
                    }   
                    System.out.print("Es una Matriz Triangular Superior");
                }                    
            }
        } else {
            for (int i = 0; i < matriz.length; i++){
                System.out.print("|");
                for (int j = 0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j]);
                    if (j != matriz[i].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("|");
            } 
            System.out.print("No es una Matriz Triangular Superior");
        }    
    }        
}
        
    

