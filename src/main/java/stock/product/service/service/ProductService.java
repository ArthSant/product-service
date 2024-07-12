package stock.product.service.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import stock.product.service.models.dto.product.ProductDTO;
import stock.product.service.models.entity.Product;
import stock.product.service.repository.ProductRepository;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

   @Transactional
   public void saveProduct(ProductDTO dto) {
       productRepository.save(new Product(dto,null));
   }

   public Product findByName(String name) {
       return productRepository.findByName(name).orElse(null);
   }

}
