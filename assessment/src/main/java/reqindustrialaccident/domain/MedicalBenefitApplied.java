package reqindustrialaccident.domain;

import java.util.*;
import lombok.*;
import reqindustrialaccident.domain.*;
import reqindustrialaccident.infra.AbstractEvent;

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
}
