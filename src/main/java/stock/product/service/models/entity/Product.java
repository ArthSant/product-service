package stock.product.service.models.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import stock.product.service.models.dto.product.ProductDTO;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80)
    private String name;

    @OneToOne
    @JoinColumn(referencedColumnName = "name")
    private Department department;

    @OneToOne
    @JoinColumn(referencedColumnName = "cnpj")
    private Producer producer;

    private Integer quantity;

    public Product(ProductDTO dto, Department department) {
        this.department = department;
        this.name = dto.getName();
        this.quantity = dto.getQuantity();
    }

}
