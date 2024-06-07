package reqindustrialaccident.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reqindustrialaccident.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "compensations",
    path = "compensations"
)
public interface CompensationRepository
    extends PagingAndSortingRepository<Compensation, Long> {}
