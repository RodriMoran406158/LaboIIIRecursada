import java.util.Scanner;

public class Ejercicios {
    Scanner scan = new Scanner(System.in);
    public void ejercicios(){
//        ejercicio1();
//        ejercicio2();
//        ejercicio3();
//        ejercicio4();
//        ejercicio5();
//        ejercicio6();
//        ejercicio7();
        ejercicio8();
    }
    public void ejercicio1(){
        //1. Declarar dos variables enteras y cargar sus valores por teclado. Informar su
        //suma, diferencia, producto y cociente.
        System.out.println("Ingrese dos numeros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        System.out.println("Resultado de "+num1+" + "+num2+": "+suma);
        System.out.println("Resultado de "+num1+" - "+num2+": "+resta);
        System.out.println("Resultado de "+num1+" * "+num2+": "+multiplicacion);
        if(division == Math.floor(division)) {
            System.out.println("Resultado de "+num1+" / "+num2+": "+String.valueOf((int) division));
        }
        else {
            System.out.println("Resultado de " + num1 + " / " + num2 + ": " + division);
        }
    }
    public void ejercicio2(){
//        2. Hacer un programa que ingrese el precio de un artículo a la venta y calcule el
//        precio con IVA.
        System.out.println("Ingrese el precio de un articulo a la venta");
        double precio = scan.nextDouble();
        double precioConIva = precio*1.21;
        System.out.println("El precio con IVA es: " + precioConIva);
    }
    public void ejercicio3(){
//        3. Hacer un programa que ingrese los datos de una factura en la cual haya tres
//        artículos vendidos. De cada artículo ingresar el precio unitario y la cantidad.
//        Finalmente imprimir el total de la factura

        System.out.println("Ingrese el precio unitario y luego la cantidad del articulo vendido");
        double precioArt1 = scan.nextDouble();
        int cantArt1 = scan.nextInt();
        double total1 = precioArt1 * cantArt1;

        System.out.println("Ingrese el precio unitario y luego la cantidad del articulo vendido");
        double precioArt2 = scan.nextDouble();
        int cantArt2 = scan.nextInt();
        double total2 = precioArt2 * cantArt2;

        System.out.println("Ingrese el precio unitario y luego la cantidad del articulo vendido");
        double precioArt3 = scan.nextDouble();
        int cantArt3 = scan.nextInt();
        double total3 = precioArt3 * cantArt3;

        double totalFactura = total1+total2+total3;

        System.out.println("El total de la factura es: "+totalFactura);

    }
    public void ejercicio4(){
//        4. Ingresar nombre y altura de dos personas, informar el nombre de la más alta.
        System.out.println("Ingrese el nombre y luego la altura de la primer persona");
        String nombre1 = scan.next();
        double altura1 = scan.nextDouble();
        System.out.println("Ingrese el nombre y luego la altura de la segunda persona");
        String nombre2 = scan.next();
        double altura2 = scan.nextDouble();

        if(altura1 > altura2){
            System.out.println("La persona mas alta es: "+nombre1);
        } else {
            System.out.println("La persona mas alta es: "+nombre2);
        }
    }
    public void ejercicio5(){
//        5. Ingresar la cantidad de horas trabajadas por un empleado y el sueldo que
//        cobra por hora. Indique el total a cobrar teniendo en cuenta que si trabajó más
//        de 180 horas las excedentes las cobra con un 50 % de aumento.
        System.out.println("Ingrese la cantidad de horas trabajadas y luego el sueldo por hora");
        int horasTrabajadas = scan.nextInt();
        double sueldoPorHora = scan.nextDouble();
        int horasExtras = 0;
        if(horasTrabajadas > 180){
            horasExtras = horasTrabajadas - 180;
            horasTrabajadas = horasTrabajadas - horasExtras;
        }
        double totalHorasNormales = horasTrabajadas * sueldoPorHora;
        double totalHorasExtras = horasExtras * sueldoPorHora * 1.5;
        double total = totalHorasExtras + totalHorasNormales;
        System.out.println("El total a cobrar es de: " + total);
    }
    public void ejercicio6(){
//        6. Ingresar un año e indicar si ese año es bisiesto. Un año es bisiesto si es
//        múltiplo de 4 y no es múltiplo de 100 o si es múltiplo de 400.
        System.out.println("Ingrese un año y le diré si es bisiesto");
        int anio = scan.nextInt();
        boolean anioBisiesto = false;
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            anioBisiesto = true;
        }
        if(!anioBisiesto){
            System.out.println("El año "+anio+" NO es bisiesto");
        }
        else {
            System.out.println("El año "+anio+" SI es bisiesto");
        }
    }
    public void ejercicio7(){
//        7. Una empresa de alquiler de autos cobra $300 por día si no se superan los 200
//        km de uso diario. Por cada km extra hasta los 1000 km cobra $5 adicionales,
//        y a partir de los 1000 cobra $10 adicionales. Hacer un programa que solicite
//        la cantidad de km realizados por un cliente e indique el importe que se le debe
//        cobrar.
        System.out.println("Ingrese la cantidad de km. realizados");
        double cantKm = scan.nextDouble();
        double totalSinExtras = 300;
        double totalExtra = 0;
        if(cantKm > 200){
            if(cantKm < 1000){
                cantKm = cantKm - 200;
                totalExtra += cantKm * 5;
            }
            else {
                totalExtra += (1000 - 200) * 5;
                totalExtra += (cantKm - 1000) *10;
            }
        }
        double totalACobrar = +totalSinExtras + totalExtra;
        System.out.println("El importe total a cobrar es: "+totalACobrar);
    }
    public void ejercicio8(){
//        8. Ingresar 10 números por teclado, informar su suma y promedio.
        System.out.println();
    }
}