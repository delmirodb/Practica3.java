import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	//Segundo cambio
<<<<<<< HEAD
	//Cuarto cambio distinto
=======
	//Cuarto cambio 
>>>>>>> 63b40ffb1469b93d1a8fc77cdd5c366a324a3ff5

        System.out.println("¿Sobre qué tipo de estructura quieres resolver ejercicios?");
        System.out.println("1. if");
        System.out.println("2. switch");
        int seleccion1 = sc.nextInt();
        if (seleccion1 == 1) {
            System.out.println("Introduce el número de ejercicio que quieres que resuelva:");
            System.out.println("1. Par-impar");
            System.out.println("2. Sueldo anual (impuestos)");
            System.out.println("5. Triángulo válido");
            System.out.println("6. Fiesta de marmotas");
            System.out.println("7. Notas");
        } else if (seleccion1 == 2) {
            System.out.println("Introduce el número de ejercicio que quieres que resuelva:");
            System.out.println("2. Lenguaje de programación");
            System.out.println("3. Texto a número");
            System.out.println("4. Harry Potter");
            System.out.println("5. Dirección");
        } else {
            System.out.println("Opción incorrecta.");
            System.exit(0);
        }
        int seleccion2 = sc.nextInt();

            //If 1
        if (seleccion1 == 1 && seleccion2 == 1){
            System.out.println("Introduce un número:");
            int if1numero = sc.nextInt();
            int if1division = if1numero % 2;
            if (if1division == 0){
                System.out.println("El numero introducido ("+ if1numero+") es par");
            } else {
                System.out.println("El numero introducido ("+ if1numero+") es impar");
            }

            //If 2
        } else if (seleccion1 == 1 && seleccion2 == 2){
            System.out.println("Introduce el sueldo anual:");
            int if2numero = sc.nextInt();
            if (if2numero > 9000){
                System.out.println("Debes pagar impuestos");
            } else {
                System.out.println("No debes pagar impuestos");
            }

            //If 5
        } else if  (seleccion1 == 1 && seleccion2 == 5){
            System.out.println("Introduce un número para el lado A:");
            int ladoA = sc.nextInt();
            System.out.println("Introduce un número para el lado B:");
            int ladoB = sc.nextInt();
            System.out.println("Introduce un número para el lado C:");
            int ladoC = sc.nextInt();
            if ((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA)){
                System.out.println("SÍ");
            } else {
                System.out.println("NO");
            }

            //If 6
        } else if (seleccion1 == 1 && seleccion2 == 6){
            System.out.println("Indica el número de tazas de mantequilla de cacahuete:");
            int mcacahuete = sc.nextInt();
            System.out.println("¿Es fin de semana? true / false");
            boolean findesemana = sc.nextBoolean();
            if (findesemana){
                System.out.println((mcacahuete >= 15 && mcacahuete <= 25));
            } else {
                System.out.println((mcacahuete >= 10 && mcacahuete <= 20));
            }

            //If 7
        } else if (seleccion1 == 1 && seleccion2 == 7){
            System.out.println("Introduce la nota numérica (entre 0 y 10)");
            double nota = sc.nextInt();
            if (0<= nota && nota <3){
                System.out.println("MD");
            } else if(3<= nota && nota <5){
                System.out.println("INS");
            } else if(5<= nota && nota <6){
                System.out.println("SUF");
            } else if(6<= nota && nota <7){
                System.out.println("B");
            } else if(7 <= nota && nota < 9){
                System.out.println("N");
            } else if(9 <= nota && nota <= 10){
                System.out.println("SB");
            }

            //Switch 2
        } else if (seleccion1 == 2 && seleccion2 == 2){
            System.out.println("¿Qué lenguaje de programación estas estudiando?");
            System.out.println("1. Java");
            System.out.println("2. Kotlin");
            System.out.println("3. Scala");
            System.out.println("4. Python");
            int respuesta = sc.nextInt();
            switch (respuesta) {
                case 1 -> System.out.println("¡Sí!");
                case 2, 3, 4 -> System.out.println("¡No!");
                default -> System.out.println("Número desconocido.");
            }

            //Switch 3
        } else if (seleccion1 == 2 && seleccion2 == 3){
            System.out.println("Escribe un número del uno al nueve:");
            String numero = sc.next();
            switch (numero) {
                case "uno" -> System.out.println(1);
                case "dos" -> System.out.println(2);
                case "tres" -> System.out.println(3);
                case "cinco" -> System.out.println(5);
                case "seis" -> System.out.println(6);
                case "siete" -> System.out.println(7);
                case "ocho" -> System.out.println(8);
                case "nueve" -> System.out.println(9);
                default -> System.out.println("Error");
            }

            //Switch 4
        } else if (seleccion1 == 2 && seleccion2 == 4){
            System.out.println("Selecciona una casa:");
            System.out.println("1. Gryffindor");
            System.out.println("2. Hufflepuff");
            System.out.println("3. Slytherin");
            System.out.println("4. Ravenclaw");
            int casa = sc.nextInt();
            switch (casa){
                case 1 -> System.out.println("Valentia");
                case 2 -> System.out.println("Lealtad");
                case 3 -> System.out.println("Astucia");
                case 4 -> System.out.println("Intelecto");
                default -> System.out.println("No es una casa válida.");
            }

            //Switch 5
        } else if (seleccion1 == 2 && seleccion2 == 5){
            System.out.println("1- Arriba");
            System.out.println("2- Abajo");
            System.out.println("3- Izquierda");
            System.out.println("4- Derecha");
            System.out.println("0- No mover");
            int s5 = sc.nextInt();
            switch (s5){
                case 1 -> System.out.println("Subir");
                case 2 -> System.out.println("Bajar");
                case 3 -> System.out.println("Mover a la izquierda");
                case 4 -> System.out.println("Mover a la derecha");
                case 0 -> System.out.println("No mover");
                default -> System.out.println("¡error!");
            }
        } else {
            System.out.println("Opción incorrecta.");
            System.exit(0);
        }
    }
}