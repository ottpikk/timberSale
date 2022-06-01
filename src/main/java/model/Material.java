package model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int materialId;
    private String type;
    private int length;
    private int width;
    private int thickness;
    private String unit;
    private double price;
    private double amountInStock;

    @Column(columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
    @Generated(GenerationTime.INSERT)
    private Date dateOfRegister;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(double amountInStock) {
        this.amountInStock = amountInStock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialId=" + materialId +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", thickness=" + thickness +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", amountInStock=" + amountInStock +
                ", dateOfRegister=" + dateOfRegister +
                ", supplier=" + supplier +
                '}';
    }
}
