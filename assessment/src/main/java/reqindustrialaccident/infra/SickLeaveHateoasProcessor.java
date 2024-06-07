package reqindustrialaccident.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import reqindustrialaccident.domain.*;

@Component
public class SickLeaveHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<SickLeave>> {

    @Override
    public EntityModel<SickLeave> process(EntityModel<SickLeave> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/applysalary")
                .withRel("applysalary")
        );
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
