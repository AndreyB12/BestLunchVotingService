package butnet.blvs.model;

import java.time.LocalDate;

/**
 * Created by butkoav on 26.05.2017.
 */
public class Vote extends BaseEntity {

    private User user;
    private LocalDate date;
    private Menu menu;

}
