public class Seating extends Furniture{
    private int loadCapacity;

    public Seating(int id, String name, int price, int quantity, int tax, ProductType productType, String material, int length, int width, int loadCapacity) {
        super(id, name, price, quantity, tax, productType, material, length, width);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Load Capacity: %d KG ",loadCapacity);
    }
}
