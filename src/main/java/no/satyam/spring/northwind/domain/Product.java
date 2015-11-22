package no.satyam.spring.northwind.domain;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import no.satyam.spring.northwind.adapter.ToStringGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author srt
 */
@Entity
public class Product extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    private String productName;
    private String quantityPerUnit;
    private BigDecimal unitPrice;
    private Integer unitsInStock;
    private Integer unitsInOrder;
    private Integer reoderLevel;
    private Boolean discontinued;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne(optional = false)
    private Supplier supplier;

    @OneToMany(mappedBy = "product")
    private List<SalesOrderDetails> salesOrderDetails;

    public Product() {
    }

    @Override
    public void setId(Long id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Integer getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder(Integer unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public Integer getReoderLevel() {
        return reoderLevel;
    }

    public void setReoderLevel(Integer reoderLevel) {
        this.reoderLevel = reoderLevel;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<SalesOrderDetails> getSalesOrderDetails() {
        return salesOrderDetails;
    }

    public void setSalesOrderDetails(List<SalesOrderDetails> salesOrderDetails) {
        this.salesOrderDetails = salesOrderDetails;
    }

     @Override
    public String toString() {
        return ToStringGenerator.generateInMultiLine(this);
    }

}
