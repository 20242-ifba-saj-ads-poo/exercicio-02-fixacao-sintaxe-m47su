//Imprima os primeiros números da série de Fibonacci até passar de 100. 
//A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... 
//Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, 
//o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
public class Exercicio6
{
    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

	for (int i = 0; i < 110; i++) {
            System.out.print("(" + i + "):" + Exercicio6.fibo(i) + "\t" + "\n");
        }

    }

}



