package Ejercicios;

public class Transacciones {
   private CuentaBancaria cuentaOrigen;
   private CuentaBancaria cuentaDestino;

   public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
      this.cuentaOrigen = cuentaOrigen;
   }

   public void setCuentaDestino(CuentaBancaria cuentaDestino) {
      this.cuentaDestino = cuentaDestino;
   }

   public boolean realizarTransferencia ( double monto){
      boolean exito = false;

      double nuevoSaldo = cuentaOrigen.getSaldo()- monto;
      cuentaOrigen.setSaldo(nuevoSaldo);

      double nuevoSaldo2 = cuentaDestino.getSaldo()+ monto;
      cuentaDestino.setSaldo(nuevoSaldo2);

      exito = true;
      return exito;

   }
}
