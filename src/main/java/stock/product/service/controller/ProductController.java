package stock.product.service.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.product.service.models.dto.product.ProductDetailsDTO;
import stock.product.service.models.dto.product.ProductDTO;
import stock.product.service.service.ProductService;

@RestController
@RequestMapping("product")
@AllArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public void save(@RequestBody ProductDTO dto) {
        service.saveProduct(dto);
    }

    @GetMapping("{name}")
    public ResponseEntity<ProductDetailsDTO> findByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByName(name));
    }
}
