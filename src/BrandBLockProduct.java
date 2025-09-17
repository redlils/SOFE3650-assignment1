public class BrandBLockProduct extends AbstractLockProduct {
    @Override
    public String getBrandName() {
        return "Brand B";
    }

    @Override
    public String toString() {
        return "BrandBLockProduct{" +
                "batteryConsumption=" + batteryConsumption +
                ", isLocked=" + isLocked +
                '}';
    }
}
