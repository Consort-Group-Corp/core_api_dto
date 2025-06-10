package uz.consortgroup.core.api.v1.dto.payment.order;

public enum OrderStatus {
    NEW,
    PAID,
    CANCELLED,
    FAILED;

    public boolean isPayable() {
        return this == NEW;
    }
}