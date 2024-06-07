package reqindustrialaccident.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import reqindustrialaccident.config.kafka.KafkaProcessor;
import reqindustrialaccident.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    AssessmentRepository assessmentRepository;

    @Autowired
    SickLeaveRepository sickLeaveRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='MedicalBenefitApplied'"
    )
    public void wheneverMedicalBenefitApplied_Receipt(
        @Payload MedicalBenefitApplied medicalBenefitApplied
    ) {
        MedicalBenefitApplied event = medicalBenefitApplied;
        System.out.println(
            "\n\n##### listener Receipt : " + medicalBenefitApplied + "\n\n"
        );

        CreateInvestigationCommand createInvestigationCommand = new CreateInvestigationCommand();
        // implement:  Map command properties from event
        // createInvestigationCommand.set??(event.get??());

        // assessmentRepository.findById(
        // implement: Set the Assessment Id from one of MedicalBenefitApplied event's corresponding property

        // ).ifPresent(assessment->{
        //  assessment.createInvestigation(createInvestigationCommand);
        // });

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='InvestigationApproved'"
    )
    public void wheneverInvestigationApproved_CreateSickLeave(
        @Payload InvestigationApproved investigationApproved
    ) {
        InvestigationApproved event = investigationApproved;
        System.out.println(
            "\n\n##### listener CreateSickLeave : " +
            investigationApproved +
            "\n\n"
        );

        CreateSickLeaveBenefitCommand createSickLeaveBenefitCommand = new CreateSickLeaveBenefitCommand();
        // implement:  Map command properties from event
        // createSickLeaveBenefitCommand.set??(event.get??());

        // sickLeaveRepository.findById(
        // implement: Set the SickLeave Id from one of InvestigationApproved event's corresponding property

        // ).ifPresent(sickLeave->{
        //  sickLeave.createSickLeaveBenefit(createSickLeaveBenefitCommand);
        // });

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='SickLeaveBenefitApplied'"
    )
    public void wheneverSickLeaveBenefitApplied_RequestSickleavebenefit(
        @Payload SickLeaveBenefitApplied sickLeaveBenefitApplied
    ) {
        SickLeaveBenefitApplied event = sickLeaveBenefitApplied;
        System.out.println(
            "\n\n##### listener RequestSickleavebenefit : " +
            sickLeaveBenefitApplied +
            "\n\n"
        );

        SickLeave.requestSickleavebenefit(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
