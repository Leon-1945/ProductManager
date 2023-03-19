public class Smatrphone extends Proguct{
    private String vendor;

    public Smatrphone(int id, String name, int price, String vendor) {
        super(id, name, price);
        this.vendor = vendor;
    }
    public String getVendor() {
        return vendor;
    }
}
