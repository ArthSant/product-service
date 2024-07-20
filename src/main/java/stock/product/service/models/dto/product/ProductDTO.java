package stock.product.service.models.dto.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stock.product.service.models.dto.department.DepartmentDTO;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {
       private Long id;
       private String name;
       private String department;
       private Integer quantity;
       private String producerCnpj;

}
