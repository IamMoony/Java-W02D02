public class HybridCars extends Cars {

    double gasType;
    double chargeType;

    public HybridCars(double gasType, double chargeType)
    {
        super(gasType);
        this.chargeType = chargeType;
    }

}
