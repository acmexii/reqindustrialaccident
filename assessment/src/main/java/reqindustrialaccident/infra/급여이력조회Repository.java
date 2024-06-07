package reqindustrialaccident.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reqindustrialaccident.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "급여이력조회",
    path = "급여이력조회"
)
public interface 급여이력조회Repository
    extends PagingAndSortingRepository<급여이력조회, Long> {}
