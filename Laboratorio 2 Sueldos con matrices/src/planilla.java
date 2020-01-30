import java.util.Scanner;

public class planilla {
    public static void main(String[] args) {
        int cont = 0;
        int op = 0;
        int opc = 0;
        int opsalir = 0;
        String[][] Dtempleado = new String[20][2];
        float[][]valores=new float[20][13];


        float[] sueldoOrd = new float[100];
        float[] sueldobase = new float[100];
        float[] sueldodiario = new float[100];
        float[] sueldoextraord = new float[100];
        int[] diaslab = new int[100];
        int[] horasextras = new int[100];
        double bonificaciones = 154.5;
        float[] comisiones = new float[100];
        float[] otros = new float[100];
        float[] totaldev = new float[100];
        float[] subtotal = new float[100];
        float[] septimo = new float[100];
        float[] igss = new float[100];
        float[] isr = new float[100];
        float[] anticipo = new float[100];
        float[] descjudiciales = new float[100];
        float[] otrosdescuentos = new float[100];
        float[] totaldesc = new float[100];
        float[] totalliquido = new float[100];

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar empleado");
            System.out.println("2. Mostrar Planilla");
            System.out.println("3. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:

                    do {
                        System.out.println("----------------------------------------------------");
                        System.out.println("¿Cual es tu nombre?");
                        Dtempleado[cont][0] = leer.nextLine();
                        System.out.println("¿Cual es tu puesto?");
                        Dtempleado[cont][1] =leer.nextLine();

                        System.out.println("¿Cuantos dias laboro?");
                        Dtempleado[cont][0] = leer.nextLine();
                        System.out.println("¿Cuantas horas extras hizo?");
                        Dtempleado[cont][1] = leer.nextLine();
                        System.out.println("¿Cual es su sueldo base?");
                        Dtempleado[cont][2] = leer.nextLine();
                        System.out.println("¿Cuanto fueron de comisiones?");
                        Dtempleado[cont][3] = leer.nextLine();
                        System.out.println("¿Otro sueldo?");
                        Dtempleado[cont][4] = leer.nextLine();


                    }  while (opsalir != 2);
            }




        }while(opc!=3);


    }
}
