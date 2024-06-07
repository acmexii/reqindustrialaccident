package reqindustrialaccident.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reqindustrialaccident.domain.ApplySalaryCommand;
import reqindustrialaccident.domain.CreateSickLeaveBenefitCommand;
import reqindustrialaccident.domain.SickLeave;
import reqindustrialaccident.domain.SickLeaveRepository;
import reqindustrialaccident.service.SickLeaveService;

@Service("sickLeaveService")
@Transactional
public class SickLeaveServiceImpl
    extends EgovAbstractServiceImpl
    implements SickLeaveService {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        SickLeaveServiceImpl.class
    );

    @Autowired
    SickLeaveRepository sickLeaveRepository;

    @Override
    public List<SickLeave> getAllSickLeaves() throws Exception {
        // Get all sickLeaves
        return StreamSupport
            .stream(sickLeaveRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<SickLeave> getSickLeaveById(Long id) throws Exception {
        // Get a sickLeave by ID
        return sickLeaveRepository.findById(id);
    }

    @Override
    public SickLeave createSickLeave(SickLeave sickLeave) throws Exception {
        // Create a new sickLeave
        return sickLeaveRepository.save(sickLeave);
    }

    @Override
    public SickLeave updateSickLeave(SickLeave sickLeave) throws Exception {
        // Update an existing sickLeave via SickLeaveService
        if (sickLeaveRepository.existsById(sickLeave.getId())) {
            return sickLeaveRepository.save(sickLeave);
        } else {
            throw processException("info.nodata.msg");
        }
    }

    @Override
    public void deleteSickLeave(Long id) throws Exception {
        // Delete a sickLeave
        sickLeaveRepository.deleteById(id);
    }
}
