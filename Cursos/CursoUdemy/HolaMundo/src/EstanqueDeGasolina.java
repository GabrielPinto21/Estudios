import java.util.Scanner;
public class EstanqueDeGasolina {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        double cap;

        do {
            System.out.println("Ingrese la medida actual en litro (Max 70L)");
             cap = sc.nextDouble();
        }while (cap<0 || cap>70);

        if (cap == 70){
            System.out.println("Estanque lleno");
        } else if (cap >= 60){
            System.out.println("Estanque casi lleno");
        }else if (cap >= 40){
            System.out.println("Estanque 3/4");
        }else if (cap >= 35 ){
            System.out.println("Medio Estanque");
        }else if (cap >= 20 ){
            System.out.println("Estanque casi lleno");
        }else if (cap >= 0 ){
            System.out.println("Insuficiente");
        }
    }*/
        Scanner sc = new Scanner(System.in);

        double capmax = 70;
        System.out.println("Ingrese la medida actual en litro (Max 70L)");
        double  cap = sc.nextDouble();

        String max = (cap == capmax) ? "Estanque lleno"
                : (cap >= 60 && cap < capmax) ? "Estanque casi lleno"
                : (cap >= 40 && cap < capmax) ? "Estanque 3/4"
                : (cap >= 35 && cap < capmax)? "Medio Estanque"
                : (cap >= 20 && cap < capmax)? "Estanque casi lleno"
                : (cap >= 0 && cap < capmax)? "Insuficiente" :
                "Valor fuera de los parametros";
        System.out.println("Nivel de estanque = " + max);
    }
}
