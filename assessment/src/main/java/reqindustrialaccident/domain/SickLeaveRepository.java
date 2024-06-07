package reqindustrialaccident.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reqindustrialaccident.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "sickLeaves",
    path = "sickLeaves"
)
public interface SickLeaveRepository
    extends PagingAndSortingRepository<SickLeave, Long> {}
