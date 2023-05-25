public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i=0 ; i < 10000; i++){
            //c= c.concat(a).concat(b).concat("\n"); // 500 => 3ms , 1000 => 10ms, 10000 => 278ms
            c += a + b +"\n"; // 500 => 19ms , 1000 => 22ms, 10000 => 153ms
            //sb.append(a).append(b).append("\n"); // 500 => 0ms , 1000 => 0ms , 10000 => 2ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


    }
}
