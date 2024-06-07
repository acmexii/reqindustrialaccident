package reqindustrialaccident.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import reqindustrialaccident.domain.*;

@Component
public class CompensationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Compensation>> {

    @Override
    public EntityModel<Compensation> process(EntityModel<Compensation> model) {
        model.add(
            Link
                .of(
                    model.getRequiredLink("self").getHref() +
                    "/processcompensation"
                )
                .withRel("processcompensation")
        );
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
