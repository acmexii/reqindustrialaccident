package reqindustrialaccident.service;

import java.util.List;
import java.util.Optional;
import reqindustrialaccident.domain.*;

public interface AccidentService {
    List<Accident> getAllAccidents() throws Exception;
    Optional<Accident> getAccidentById(Long id) throws Exception;
    Accident createAccident(Accident accident) throws Exception;
    Accident updateAccident(Accident accident) throws Exception;
    void deleteAccident(Long id) throws Exception;

    Accident applyMedicalBenefit(
        ApplyMedicalBenefitCommand applyMedicalBenefitCommand
    ) throws Exception;
    Accident applySickLeaveBenefit(
        ApplySickLeaveBenefitCommand applySickLeaveBenefitCommand
    ) throws Exception;
}
