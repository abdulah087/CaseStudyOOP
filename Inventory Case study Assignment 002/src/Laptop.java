public class Laptop extends Electronics{
    private Processor processor;
    private int ramSize;
    private int width;
    private int height;

    public Laptop(int id, String name, int price, int quantity, int tax, ProductType productType, int powerConsumption, int warranty, Processor processor, int ramSize, int width, int height) {
        super(id, name, price, quantity, tax, productType, powerConsumption, warranty);
        this.processor = processor;
        this.ramSize = ramSize;
        this.width = width;
        this.height = height;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "Processor: %s, RAM: %d GB, Width: %d m, Height: %d m ", processor,ramSize,width,height);
    }
}
