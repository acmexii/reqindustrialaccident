package reqindustrialaccident.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import reqindustrialaccident.config.kafka.KafkaProcessor;
import reqindustrialaccident.domain.*;

@Service
public class 급여이력조회ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 급여이력조회Repository 급여이력조회Repository;
    //>>> DDD / CQRS
}
