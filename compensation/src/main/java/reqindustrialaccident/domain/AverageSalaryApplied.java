package reqindustrialaccident.domain;

import java.util.*;
import lombok.*;
import reqindustrialaccident.domain.*;
import reqindustrialaccident.infra.AbstractEvent;

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
}
