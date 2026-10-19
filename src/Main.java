public class Main {
    public static void main(String[] args) {
        //saludar();
        //saludar("Pepito");
        //saludar("Juanito");
        //saludar("Laurita");
        //System.out.println(sumar(14, 5));
        //System.out.println(celsiusAFahrenheit(20));
        //System.out.println(areaCirculo(15));
        //System.out.println(media(5.5, 8.5, 9.7));
        //System.out.println(concatenar("Hola", " buenos", " días"));
        //System.out.println(nombreCompleto("Pepito", "Pérez", "Álvarez"));
        //System.out.println(edadActual(1956));
        //presentacion("Laurita", "Ruiz", "Martínez", 1988);
        //System.out.println(binarioADecimal("1010"));
        //System.out.println(octalADecimal("27534"));
        //System.out.println(hexadecimalADecimal("25BC"));
        //decimalABinOctHex(26);
        //bienvenida();
        //bienvenida("Lolita");
        //System.out.println(doble(50));
        //System.out.println(precioConIVA(50.5));
        //System.out.println(precioConImpuesto(100.5, 15));
        //System.out.println(volumenCubo(5.5));
        //System.out.println(tiempoASegundos(5, 55, 23));
        //System.out.println(decoraTexto("Mi 55 de prueba"));
        System.out.println(formateaNombre("Pepito", "Pepítez Pepótez"));
        System.out.println(aprobado(7.2, 5.7, 6.5));
        alumnoAprobado("Laurita", "Pérez Álvarez", 4, 9, 6.3);
    }

    public static void saludar() {
        System.out.println("Hola mundo");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double celsiusAFahrenheit(double temperatura) {
        return temperatura * 1.8 + 32;
    }

    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String concatenar(String a, String b, String c) {
        return a + b + c;
    }

    public static String nombreCompleto(String nombre, String apellido1, String apellido2) {
        return nombre + " " + apellido1 + " " + apellido2;
    }

    public static int edadActual(int anyoNacimiento) {
        return 2026 - anyoNacimiento;
    }

    public static void presentacion(String nombre, String apellido1, String apellido2, int anyoNacimiento) {
        System.out.println("Hola, soy " + nombreCompleto(nombre, apellido1, apellido2) +
                " y tengo " + edadActual(anyoNacimiento) + " años");
    }

    public static int binarioADecimal(String numero) {
        return Integer.parseInt(numero, 2);
    }

    public static int octalADecimal(String numero) {
        return Integer.parseInt(numero, 8);
    }

    public static int hexadecimalADecimal(String numero) {
        return Integer.parseInt(numero, 16);
    }

    public static void decimalABinOctHex(int numero) {
        System.out.println("Binario: " + Integer.toBinaryString(numero));
        System.out.println("Octal: " + Integer.toOctalString(numero));
        System.out.println("Hexadecimal: " + Integer.toHexString(numero));
    }

    public static void bienvenida() {
        System.out.println("Te doy la bienvenida a la clase de Programación");
    }

    public static void bienvenida(String nombre) {
        System.out.println("Hola, " + nombre + ", te doy la bienvenida a la clase de Programación");
    }

    public static int doble(int numero) {
        return 2 * numero;
    }

    public static double precioConIVA(double precio) {
        return precio + precio * 21 / 100;
    }

    public static double precioConImpuesto(double precio, double impuesto) {
        return precio + precio * impuesto / 100;
    }

    public static double volumenCubo(double lado) {
        return lado * lado * lado;
    }

    public static int tiempoASegundos(int horas, int minutos, int segundos) {
        return segundos + minutos * 60 + horas * 3600;
    }

    public static String decoraTexto(String texto) {
        return "=== " + texto + " ===";
    }

    public static String formateaNombre(String nombre, String apellidos) {
        return apellidos + ", " + nombre;
    }

    public static boolean aprobado(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3 >= 5;
    }

    public static void alumnoAprobado(String nombre, String apellidos, double nota1, double nota2, double nota3) {
        System.out.println(formateaNombre(nombre, apellidos) + " ha aprobado: " + aprobado(nota1, nota2, nota3));
    }
}