package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reqindustrialaccident.domain.*;
import reqindustrialaccident.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SickLeaveBenefitApplied extends AbstractEvent {

    private Long id;
    private Long sickLeaveId;
    private String businessCode;
    private String employeeId;
    private String name;
    private String hospitalCode;
    private Integer period;
    private String doctorNote;
    private String accidentType;
    private String status;
    private Date applyDt;

    public SickLeaveBenefitApplied(Accident aggregate) {
        super(aggregate);
    }

    public SickLeaveBenefitApplied() {
        super();
    }
}
//>>> DDD / Domain Event
