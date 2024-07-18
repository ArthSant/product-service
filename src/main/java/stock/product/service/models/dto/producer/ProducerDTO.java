package stock.product.service.models.dto.producer;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProducerDTO {
    private Long id;
    private String name;
    private String cnpj;
}
