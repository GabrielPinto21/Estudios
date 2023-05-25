public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Gabriel Pinto";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Gabriel Pinto\") = " + nombre.equals("Gabriel Pinto"));
        System.out.println("nombre.equals(\"gabriel pinto\") = " + nombre.equals("gabriel pinto"));
        System.out.println("nombre.equalsIgnoreCase(\"gabriel pinto\") = " + nombre.equalsIgnoreCase("gabriel pinto"));
        System.out.println("nombre.compareTo(\"Gabriel Pinto\") = " + nombre.compareTo("Gabriel Pinto"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1 , 4) = " + nombre.substring(1 , 4));
        System.out.println("nombre.substring(4, 13) = " + nombre.substring(4, 13));
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"t\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());
    }
}
