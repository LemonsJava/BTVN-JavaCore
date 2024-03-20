package utils;

public enum CustomerType {
    INDIVIDUAL("Ca nhan"),
    REPRESENTATIVE_OF_ADMINISTRATIVE_UNIT ("Don vi hanh chinh"),
    REPRESENTATIVE_OF_BUSINESS_UNIT ("Don vi kinh doanh");

    public String value;
    CustomerType(String value) {
        this.value = value;
    }
}
