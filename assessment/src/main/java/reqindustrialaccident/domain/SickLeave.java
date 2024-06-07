package reqindustrialaccident.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import reqindustrialaccident.AssessmentApplication;
import reqindustrialaccident.domain.SickLeaveBenefitRequested;

@Entity
@Table(name = "SickLeave_table")
@Data
//<<< DDD / Aggregate Root
public class SickLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long accessmentId;

    private Long accidentId;

    private String businessCode;

    private String employeeId;

    private Float averageSalary;

    private Integer period;

    private String status;

    private Date date;

    @PostPersist
    public void onPostPersist() {
        SickLeaveBenefitRequested sickLeaveBenefitRequested = new SickLeaveBenefitRequested(
            this
        );
        sickLeaveBenefitRequested.publishAfterCommit();
    }

    public static SickLeaveRepository repository() {
        SickLeaveRepository sickLeaveRepository = AssessmentApplication.applicationContext.getBean(
            SickLeaveRepository.class
        );
        return sickLeaveRepository;
    }

    //<<< Clean Arch / Port Method
    public void applySalary(ApplySalaryCommand applySalaryCommand) {
        //implement business logic here:

        AverageSalaryApplied averageSalaryApplied = new AverageSalaryApplied(
            this
        );
        averageSalaryApplied.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void createSickLeaveBenefit(
        CreateSickLeaveBenefitCommand createSickLeaveBenefitCommand
    ) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void requestSickleavebenefit(
        SickLeaveBenefitApplied sickLeaveBenefitApplied
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        SickLeave sickLeave = new SickLeave();
        repository().save(sickLeave);

        */

        /** Example 2:  finding and process
        
        repository().findById(sickLeaveBenefitApplied.get???()).ifPresent(sickLeave->{
            
            sickLeave // do something
            repository().save(sickLeave);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
