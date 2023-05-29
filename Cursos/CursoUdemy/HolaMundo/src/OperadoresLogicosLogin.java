import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Gabriel";
        passwords[0] = "12345";

        usernames[1] = "Admin";
        passwords[1] = "12345";

        usernames[2] = "Pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Gabriel", "Admin", "Pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese usernamme");
        String u = scanner.nextLine();
        System.out.println("Ingrese el password");
        String p = scanner.nextLine();
        String b = String.valueOf(p.length());

        boolean esAutenticado = false;

        for (int i=0; i< usernames.length; i++) {
            esAutenticado = usernames[i].equals(u) && passwords[i].equals(p)? true : esAutenticado;
            /*if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "Bienvenido Usuario ".concat(u).concat("!") : "Username o password incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido Usuario ".concat(u).concat("!"));
        }else{
            System.out.println("Username o password incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }*/
    }
}
