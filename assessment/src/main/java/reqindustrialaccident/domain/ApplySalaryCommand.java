package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ApplySalaryCommand {

    private Long sickLeaveId;
    private String averageSalary;
}
