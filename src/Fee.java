public class Fee  {
    private int monthlyFee;
    private int lateFee;
    public Fee(int monthlyFee, int lateFee) {
        this.monthlyFee = monthlyFee;
        this.lateFee = lateFee;
    }

    public int calculateTotalFee(int months) 
    {
        int totalFee = monthlyFee * months;    
        if (months > 12) 
        {
            totalFee += lateFee * (months - 12);       
        }
        return totalFee;   
    }
}
