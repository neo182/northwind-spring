package no.satyam.spring.northwind.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import no.satyam.spring.northwind.adapter.ToStringGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author srt
 */
@Entity
public class SalesOrder extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private BigDecimal freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;

    @ManyToOne(optional = false)
    private Customer customer;

    @ManyToOne(optional = false)
    private Employee employee;

    @ManyToOne(optional = false)
    private Shipper shipper;

    @OneToMany(mappedBy = "salesOrder", fetch = FetchType.LAZY)
    private List<SalesOrderDetails> salesOrderDetails;

    public SalesOrder() {
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
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
