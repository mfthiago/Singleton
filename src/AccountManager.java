import java.util.HashMap;
import java.util.Map;

public class AccountManager {
    private static AccountManager instance;
    private Map<String, Double> accounts;

    private AccountManager() {
        accounts = new HashMap<>();
    }

    public static AccountManager getInstance() {
        if (instance == null) {
            instance = new AccountManager();
        }
        return instance;
    }

    public void depositar(String contaId, double valor) {
        accounts.put(contaId, accounts.getOrDefault(contaId, 0.0) + valor);
    }

    public void sacar(String contaId, double valor) {
        if (accounts.containsKey(contaId) && accounts.get(contaId) >= valor) {
            accounts.put(contaId, accounts.get(contaId) - valor);
        } else {
            System.out.println("Saldo insuficiente ou conta inexistente.");
        }
    }

    public double verSaldo(String contaId) {
        return accounts.getOrDefault(contaId, 0.0);
    }

    public void listarContasAtivas() {
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            System.out.println("Conta ID: " + entry.getKey() + ", Saldo: " + entry.getValue());
        }
    }
}