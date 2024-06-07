package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ProcessCompensationCommand {

    private Long compensationId;
    private Float amount;
    private String method;
}
