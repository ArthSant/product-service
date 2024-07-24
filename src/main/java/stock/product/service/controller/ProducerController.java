package stock.product.service.controller;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.product.service.models.dto.producer.ProducerDTO;
import stock.product.service.service.ProducerService;

import java.util.List;

@RestController
@RequestMapping("producer")
@AllArgsConstructor
public class ProducerController {
    private final ProducerService producerService;

   @PostMapping
   public ResponseEntity registerProducer(@RequestBody @Valid ProducerDTO producerDTO) {
        producerService.registerProducer(producerDTO);
       return ResponseEntity.status(HttpStatus.CREATED).build();
   }

   @GetMapping
   public ResponseEntity<List<ProducerDTO>> getAllProducers() {
       return ResponseEntity.ok(producerService.getAll());
   }
}
