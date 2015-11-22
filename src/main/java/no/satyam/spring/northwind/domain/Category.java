package no.satyam.spring.northwind.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import no.satyam.spring.northwind.adapter.ToStringGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author srt
 */
@Entity
public class Category extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return ToStringGenerator.generateInMultiLine(this);
    }

}
