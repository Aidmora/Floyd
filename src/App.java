import java.util.Scanner;
public class App {
    public static void imprimirMatriz(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        // definicion de variables 
        int valorMatriz= 0; 
        String [][] matriz ={
            {"0","700","200","-","-","-"},
            {"700","0","300","200","-","400"},
            {"200","300","0","700","600","-"},
            {"-","200","700","0","300","100"},
            {"-","-","600","300","0","500"},
            {"-","400","-","100","500","0"}};
            String [][] matriz2 ={
                {"0","700","200","-","-","-"},
                {"700","0","300","200","-","400"},
                {"200","300","0","700","600","-"},
                {"-","200","700","0","300","100"},
                {"-","-","600","300","0","500"},
                {"-","400","-","100","500","0"}};
        Floyd f = new Floyd();
        f.llenarMatrizRecorrido(matriz2);
        System.out.println("Matriz de Adyacencia");
        imprimirMatriz(f.algoritmoFloyd(matriz));
        System.out.println("Matriz de Recorrido");
        imprimirMatriz(f.getMatrizFloyd2());
        // menu de opciones
        
    
    }
}
