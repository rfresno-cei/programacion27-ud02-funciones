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
        System.out.println(binarioADecimal("1010"));
        System.out.println(octalADecimal("27534"));
        System.out.println(hexadecimalADecimal("25BC"));
        decimalABinOctHex(26);
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
}