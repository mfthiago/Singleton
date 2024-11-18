public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1", "Alice");
        Cliente cliente2 = new Cliente("2", "Bob");

        cliente1.depositar(1000);
        cliente2.depositar(500);

        System.out.println("Saldo de Alice: " + cliente1.verSaldo());
        System.out.println("Saldo de Bob: " + cliente2.verSaldo());

        cliente1.sacar(200);
        cliente2.sacar(100);

        System.out.println("Saldo de Alice após saque: " + cliente1.verSaldo());
        System.out.println("Saldo de Bob após saque: " + cliente2.verSaldo());

        AccountManager.getInstance().listarContasAtivas();
    }
}