import java.util.Scanner;


public class Principal {
    public static void main (String[] args){
        Paciente paciente1 = new Paciente();
        Scanner scanner = new Scanner(System.in);

        paciente1.nombre = "Minely Padilla";
        paciente1.edad = 24;
        paciente1.expediente = "EXP111200";

        paciente1.mostrarInformacion();

    }
}
