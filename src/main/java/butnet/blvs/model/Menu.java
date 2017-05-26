package butnet.blvs.model;

import java.time.LocalDate;
import java.util.Set;

/**
 * Created by butkoav on 26.05.2017.
 */
public class Menu extends BaseEntity {

    private LocalDate date;
    private Restaurant restaurant;
    private Set<Dish> dishes;
}
