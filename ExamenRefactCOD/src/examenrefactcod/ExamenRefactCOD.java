package examenrefactcod;

/**
 *
 * @author Javii
 */
public class ExamenRefactCOD {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
public static boolean p = false;
    public static void main(String[] args) {
        int digito=Digitos();
        IngresarNumNoNulo(digito);
        for(int i = 1; i <= 99999; i++ )
        {
            int auxiliar = i;
            
            int numerodigito;
 
            int cont=0;
 
            while (auxiliar != 0)
        {
            auxiliar = auxiliar / 10;
            cont++;
        }
        numerodigito=cont;
            
            
            if(numerodigito==digito){
                MetodoIf(i); 
     
                if (p == true) 
                    System.out.println(i);    
            }
        }
        }

    public static int Digitos() {
        int digito=3;
        int numerodigito=0;
        return digito;
    }

    public static void IngresarNumNoNulo(int digito) {
        if(digito<=0)
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
    }

    public static void MetodoIf(int i) {
        if (i < 4) p = true;
        else
        {
            if (i % 2 == 0) p = false;
            else
            {
                int contador1 = 0;
                int i1 = 1;
                int k = (i - 1) / 2;
                if  (k % 2 == 0) k--;
                
                while(i1 <= k)
                {
                    if (i % i1 == 0) contador1++;
                    i1 += 2;
                    if (contador1 == 2) i1 = k + 1;
                }
                
                if (contador1 == 1) p = true;
            }
        }
    }
 
       
 
}
    
    

