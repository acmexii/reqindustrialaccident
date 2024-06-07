package reqindustrialaccident.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reqindustrialaccident.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "accidents", path = "accidents")
public interface AccidentRepository
    extends PagingAndSortingRepository<Accident, Long> {}
