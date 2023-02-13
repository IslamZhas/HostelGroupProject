import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Payment {
    private int payment_id;
    private int amount;
    private String mode;
    private String date;
    private int total;
    public Payment(int payment_id, int amount, String mode, String date, int total) {
        this.payment_id = payment_id;
        this.amount = amount;
        this.mode = mode;
        this.date = date;
        this.total = total;
    }

    public int getAmount() {
        return amount;    }

    public String getMode() {
        return mode;    }

    public String getDate() {
        return date;    }
    public int getTotal(){
        return total;
    }
    public void createPayment(Connection connection) throws SQLException{
        Statement stm =connection.createStatement();
        String sql = "INSERT INTO Payment (id, amount, mode, date, total) VALUES (" + payment_id + ", " + amount +", " + mode + ", " + mode +", " + date + ", " + total +
        ");";
        int update =stm.executeUpdate(sql);
    }
    @Override    public String toString() {
        return "Amount: " + amount + ", Mode: " + mode + ", Date: " + date;    }
}
