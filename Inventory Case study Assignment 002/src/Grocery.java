public class Grocery extends Product{
    private Date expirationDate;
    private int proteinAmount;
    private int fatAmount;
    private int carbsAmount;

    public Grocery(int id, String name, int price, int quantity, int tax, ProductType productType, Date expirationDate, int proteinAmount, int fatAmount, int carbsAmount) {
        super(id, name, price, quantity, tax, productType);
        this.expirationDate = expirationDate;
        this.proteinAmount = proteinAmount;
        this.fatAmount = fatAmount;
        this.carbsAmount = carbsAmount;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getProteinAmount() {
        return proteinAmount;
    }

    public void setProteinAmount(int proteinAmount) {
        this.proteinAmount = proteinAmount;
    }

    public int getFatAmount() {
        return fatAmount;
    }

    public void setFatAmount(int fatAmount) {
        this.fatAmount = fatAmount;
    }

    public int getCarbsAmount() {
        return carbsAmount;
    }

    public void setCarbsAmount(int carbsAmount) {
        this.carbsAmount = carbsAmount;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Expiration Date: %s, Protein %: %d, Fat %: %d, Carbs: %d ", expirationDate,proteinAmount,fatAmount,carbsAmount);
    }
}
