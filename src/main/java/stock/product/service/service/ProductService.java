package stock.product.service.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import stock.product.service.models.dto.ProductDetailsDTO;
import stock.product.service.models.dto.product.ProductDTO;
import stock.product.service.models.entity.Department;
import stock.product.service.models.entity.Product;
import stock.product.service.repository.DepartmentRepository;
import stock.product.service.repository.ProductRepository;
import stock.product.service.util.Mapper;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final DepartmentRepository departmentRepository;
    private final Mapper mapper;

    @Transactional
    public void saveProduct(ProductDTO dto) {
         Department department = departmentRepository.findByName(dto.getDepartment()).orElse(null);
         Product product = mapper.map(dto, Product.class);
         product.setDepartment(department);
        productRepository.save(product);
    }

    public ProductDetailsDTO findByName(String name) {
        Product product = productRepository.findByName(name).orElseThrow();
        return mapper.map(product,ProductDetailsDTO.class);
    }

}
