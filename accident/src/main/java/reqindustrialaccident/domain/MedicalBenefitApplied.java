package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import reqindustrialaccident.domain.*;
import reqindustrialaccident.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class MedicalBenefitApplied extends AbstractEvent {

    private Long id;
    private String businessCode;
    private String employeeId;
    private String name;
    private String hospitalCode;
    private String doctorNote;
    private String accidentType;
    private String status;
    private Date applyDt;

    public MedicalBenefitApplied(Accident aggregate) {
        super(aggregate);
    }

    public MedicalBenefitApplied() {
        super();
    }
}
//>>> DDD / Domain Event
