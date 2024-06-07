package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "급여이력조회_table")
@Data
public class 급여이력조회 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
