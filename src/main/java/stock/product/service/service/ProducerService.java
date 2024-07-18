package stock.product.service.service;


import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import stock.product.service.models.dto.producer.ProducerDTO;
import stock.product.service.models.entity.Producer;
import stock.product.service.repository.ProducerRepository;
import stock.product.service.util.Mapper;

import java.util.List;

@Service
@AllArgsConstructor
public class ProducerService {
    private final ProducerRepository producerRepository;
    private final Mapper mapper;


    @Transactional
    public void registerProducer(ProducerDTO dto) {
        Producer producer = mapper.map(dto, Producer.class);
        producerRepository.save(producer);
    }

    public ProducerDTO findByCnpj(String cnpj) {
        Producer producer = producerRepository.findByCnpj(cnpj).orElseThrow(EntityNotFoundException::new);
       return mapper.map(producer,ProducerDTO.class);
    }

    public List<ProducerDTO> getAll() {
        List<Producer> producerList = producerRepository.findAll();
       return mapper.mapList(producerList,ProducerDTO.class);
    }

}
