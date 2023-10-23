package bank;

public class Conto {
    /*
- numero di conto
- nome del proprietario
- saldo*/

//      ATTRIBUTI
private int bankPrivateCode;
private String clientName;
private double clientBalance;

//      COSTRUTTORE

    public Conto (int bankPrivateCode, String clientName, double clientBalance){
        this.bankPrivateCode = bankPrivateCode;
        this.clientName = clientName;
        this.clientBalance = 0;
    }
}
