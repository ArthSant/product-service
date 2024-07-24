package stock.product.service.models.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne
    @JoinColumn(referencedColumnName = "name")
    private Department department;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "cnpj")
    private Producer producer;

    private Integer quantity;

}
