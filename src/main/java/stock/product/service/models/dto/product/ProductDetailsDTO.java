package stock.product.service.models.dto.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stock.product.service.models.dto.department.DepartmentDTO;
import stock.product.service.models.dto.producer.ProducerDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetailsDTO {
    private Long id;
    private String name;
    private DepartmentDTO department;
    private ProducerDTO producer;
    private int quantity;

}
