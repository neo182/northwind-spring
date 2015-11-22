package no.satyam.spring.northwind.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import no.satyam.spring.northwind.adapter.ToStringGenerator;
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 *
 * @author srt
 */
@Entity
public class ApplicationUser extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    @Column(unique = true)
    private String userName;
    private String password;

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ApplicationUser() {
    }

    public ApplicationUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return ToStringGenerator.generateInMultiLine(this);
    }

}
