
//Imprima a seguinte tabela, usando fors encadeados:

// 1
// 2 4
// 3 6 9
// 4 8 12 16
// n n*2 n*3 .... n*n

public class Exercicio8
{
        public static void main(String[] args) {
            
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
    
} 



