import java.util.Scanner;

public class prueba {


    //a=1 e=2 i=3 o=4 u=5  hola = h4l1
    public static void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra/frase");
        String palabra = scanner.next();
        for (int i = 0; i < palabra.length();i++){
            palabra = palabra.toLowerCase();
            char letraActual = palabra.charAt(i);
            switch (letraActual){
                case 'a':
                    palabra = palabra.replace('a','1');
                    break;
                case 'e':
                    palabra =palabra.replace('e','2');
                    break;
                case 'i':
                    palabra =palabra.replace('i','3');
                    break;
                case 'o':
                    palabra =palabra.replace('o','4');
                    break;
                case 'u':
                    palabra =palabra.replace('u','5');
                    break;
            }
        }
        System.out.println(palabra);
    }
}