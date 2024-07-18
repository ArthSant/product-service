package stock.product.service.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stock.product.service.service.ProducerService;

@RestController
@RequestMapping("producer")
@AllArgsConstructor
public class ProducerController {
    private final ProducerService producerService;

}
