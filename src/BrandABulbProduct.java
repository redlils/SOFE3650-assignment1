public class BrandABulbProduct extends AbstractBulbProduct {
    @Override
    public String getBrandName() {
        return "Brand A";
    }

    @Override
    public String toString() {
        return "BrandABulbProduct{" +
                "powerDraw=" + powerDraw +
                ", isOn=" + isOn +
                '}';
    }
}
