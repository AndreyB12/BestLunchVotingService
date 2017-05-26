package butnet.blvs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;

/**
 * Created by butkoav on 24.05.2017.
 */

// http://stackoverflow.com/questions/594597/hibernate-annotations-which-is-better-field-or-property-access
public abstract class BaseEntity implements Persistable<Integer> {
    @Id
    private Integer id;

    protected BaseEntity() {
    }

    protected BaseEntity(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return (getId() == null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return getId() != null && getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return (getId() == null) ? 0 : getId();
    }

    @Override
    public String toString() {
        return String.format("Entity %s (%s)", getClass().getName(), getId());
    }

}
