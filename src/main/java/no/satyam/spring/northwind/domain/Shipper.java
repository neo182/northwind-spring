package no.satyam.spring.northwind.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import no.satyam.spring.northwind.adapter.ToStringGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author srt
 */
@Entity
public class Shipper extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    private String companyName;
    private String phone;

    @OneToMany(mappedBy = "shipper", fetch = FetchType.LAZY)
    private Set<SalesOrder> salesOrders = new HashSet<>();

    public Shipper() {
    }

    public Shipper(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<SalesOrder> getSalesOrders() {
        return salesOrders;
    }

    public void setSalesOrders(Set<SalesOrder> salesOrders) {
        this.salesOrders = salesOrders;
    }

    @Override
    public String toString() {
        return ToStringGenerator.generateInMultiLine(this);
    }

}
