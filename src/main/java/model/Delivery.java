package model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private int deliveryId;

    @NotNull
    private String address;

    @NotNull
    private String status;

    @Column(name = "delivery_time_estimated")
    private Date deliveryTimeEstimated;

    @Column(name = "delivered_time")
    private Date deliveredTime;

    @Column(name = "order_id")
    private int orderId;

    public Delivery(String address, String status, Date deliveryTimeEstimated, Date deliveredTime, int orderId) {
        this.address = address;
        this.status = status;
        this.deliveryTimeEstimated = deliveryTimeEstimated;
        this.deliveredTime = deliveredTime;
        this.orderId = orderId;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryTimeEstimated() {
        return deliveryTimeEstimated;
    }

    public void setDeliveryTimeEstimated(Date deliveryTimeEstimated) {
        this.deliveryTimeEstimated = deliveryTimeEstimated;
    }

    public Date getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(Date deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", deliveryTimeEstimated=" + deliveryTimeEstimated +
                ", deliveredTime=" + deliveredTime +
                ", orderId=" + orderId +
                '}';
    }


}
