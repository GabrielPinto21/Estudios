import java.util.Scanner;
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1="",num2="",num3="";
        for (int i=0 ; i<3 ; i++) {
            System.out.println("Ingrese el nombre del Integrante numero ".concat(" ").concat(Integer.toString(i+1)));
            String nom = scanner.nextLine();
            String numA = nom.toUpperCase().charAt(1) + "." + nom.substring(nom.length() - 2);

            switch (i){
                case 0:
                    num1= numA;
                    break;
                case 1:
                    num2= numA;
                    break;
                case 2:
                    num3= numA;
                    break;
            }
        }
        System.out.println(num1.concat("_").concat(num2).concat("_").concat(num3));
    }
}