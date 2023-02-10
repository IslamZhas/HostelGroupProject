public class Payment {
    private int amount;
    private String mode;
    private String date;
    public Payment(int amount, String mode, String date) {
        this.amount = amount;
        this.mode = mode;
        this.date = date;
    }

    public int getAmount() {
        return amount;    }

    public String getMode() {
        return mode;    }

    public String getDate() {
        return date;    }

    @Override    public String toString() {
        return "Amount: " + amount + ", Mode: " + mode + ", Date: " + date;    }
}
