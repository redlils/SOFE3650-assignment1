public class BrandBBulbProduct extends AbstractBulbProduct {
    @Override
    public String getBrandName() {
        return "Brand B";
    }

    @Override
    public String toString() {
        return "BrandBBulbProduct{" +
                "isOn=" + isOn +
                ", powerDraw=" + powerDraw +
                '}';
    }
}
