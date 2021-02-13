package m_identidad;

public class miden {
    public static void main(String[] Args) {
    
        
        int m_identidad [][] = new int [3][3];
        int m_comparacion [][] = new int [3][3];
        
        //Definir Matriz Identidad
        
        m_identidad [0][0]= 1;
        m_identidad [1][0]= 0;
        m_identidad [2][0]= 0;
        m_identidad [0][1]= 0;
        m_identidad [1][1]= 1;
        m_identidad [2][1]= 0;
        m_identidad [0][2]= 0;
        m_identidad [1][2]= 0;
        m_identidad [2][2]= 1;
        
        //Definir Matriz para la Comparacion
        
        for (int i = 0; i < m_comparacion.length; i++) {
            for (int j = 0; j < m_comparacion.length; j++) {
                m_comparacion [i][j] = (int) (Math.random() * 2);
                
            }
        }
        
        //Comparacion de las Matrices
        
        if (m_identidad == m_comparacion) {
            for (int i = 0; i < m_comparacion.length; i++) {
                System.out.print("|");                
                for (int j = 0; j < m_comparacion[i].length; j++) {
                    System.out.print(m_comparacion[i][j]);
                    if (j != m_comparacion[i].length - 1) {
                         System.out.print("\t");                                                 
                }
            }
            System.out.println("|");                       
            }
            System.out.print("Es una Matriz Identidad");
            
        } else  { 
            for (int i = 0; i < m_comparacion.length; i++) {
                System.out.print("|");                
                for (int j = 0; j < m_comparacion[i].length; j++) {
                    System.out.print(m_comparacion[i][j]);
                    if (j != m_comparacion[i].length - 1) {
                         System.out.print("\t");                                                 
                }
            }
            System.out.println("|");                                             
        }
            System.out.println("No es una Matriz Identidad");             
            
        }
    }
}

