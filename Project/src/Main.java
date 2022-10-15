public class Main {
    public static void main(String[] args) {

        int numeroWhile=0;
        int numeroDoWhile=0;
        int numero=6;


        //Entrando en condicionales if
        if(numero>0) {

            System.out.println("Este numero es mayor");

        } else if (numero<0) {

            System.out.println("Este numero es menor");

        } else if (numero==0) {

            System.out.println("Este numero es igual a cero");

        }

        // Entrando en bucle while
        System.out.println("Entrando bucle while");

        while(numeroWhile<3){

            numeroWhile++;
            System.out.println(numeroWhile);

        }

        //Entrando a bucle do while
        System.out.println("Entrado bucle do while");

        do {

            numeroDoWhile++;
            System.out.println(numeroDoWhile);

        }while(numeroDoWhile<3);

        //Entrando a bucle for
        System.out.println("Entrando bucle For");

        int numeroFor=0;
        for(;numeroFor<=3;numeroFor++) {

            System.out.println(numeroFor);
        }
        //Entrando en la estructura de control swicht
        var Estacion="VERANO";
        switch (Estacion){
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "PRIMEVERA":
                System.out.println("Estamos en primevera");
                break;
            case "OTONO":
                System.out.println("Estamos en otoño");
                break;
         default:
            System.out.println("No estamos en ninguna estacion");
    }
    }

}