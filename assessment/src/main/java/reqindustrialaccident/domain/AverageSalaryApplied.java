package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reqindustrialaccident.domain.*;
import reqindustrialaccident.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AverageSalaryApplied extends AbstractEvent {

    private Long id;
    private Long accessmentId;
    private Long accidentId;
    private String businessCode;
    private String employeeId;
    private Float averageSalary;
    private Integer period;
    private String status;
    private Date date;

    public AverageSalaryApplied(SickLeave aggregate) {
        super(aggregate);
    }

    public AverageSalaryApplied() {
        super();
    }
}
//>>> DDD / Domain Event
