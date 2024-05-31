public class Floyd {
    public String[][] matrizFloyd;
    String[][] matrizFloyd2;
    public void llenarMatrizRecorrido(String[][] matriz2){
        int tamanio= matriz2.length;
        matrizFloyd2= new String [tamanio] [tamanio] ;
        for (int i = 0; i < matrizFloyd2.length; i++) {
            for (int j = 0; j < matrizFloyd2[0].length; j++) {
                if (i==j) {
                    matrizFloyd2[i][j]= 0 +"";
                }else{
                    matrizFloyd2[i][j]= j+1 +"";
                }
            }
        }
    }
    public String[][] getMatrizFloyd2() {
        return matrizFloyd2;
    }
    public String[][] algoritmoFloyd(String[][] matriz){
        this.matrizFloyd = matriz;
        int valorPivoteFila=0;
        int valorPivoteColum=0;
        int valormedio=0;
        for (int k = 0; k < matrizFloyd.length; k++) {
            for (int i = 0; i < matrizFloyd.length; i++) {
                for (int j = 0; j < matrizFloyd.length; j++) {
                    if(matrizFloyd[i][k].equals("-") || matrizFloyd[k][j].equals("-")){
                        continue;
                    }
                    valorPivoteFila= Integer.parseInt((matrizFloyd[i][k]));
                    valorPivoteColum= Integer.parseInt((matrizFloyd[k][j]));
                    if(valorPivoteFila == 0 || valorPivoteColum==0){
                        continue;
                    }
                    try {
                        
                        valormedio=Integer.parseInt((matrizFloyd[i][j])); 
                    } catch (NumberFormatException e) {
                        valormedio= valorPivoteFila+ valorPivoteColum;
                        matrizFloyd[i][j]=valormedio +"";
                        matrizFloyd2[i][j]=k +1 +"";

                    }
                    if (valorPivoteFila+ valorPivoteColum < valormedio ) {
                        valormedio= valorPivoteFila+ valorPivoteColum;
                        matrizFloyd[i][j]=valormedio +"";
                        matrizFloyd2[i][j]=k +1 +"";
                    }
                }
            }
        }
        return matrizFloyd;
    }


    


}
