package stock.product.service.controller;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.product.service.models.dto.department.DepartmentDTO;
import stock.product.service.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("department")
@AllArgsConstructor
public class DepartmentController {
    private final DepartmentService service;

    @PostMapping
    public ResponseEntity createDepartment(@RequestBody @Valid DepartmentDTO dto) {
            service.createDepartment(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
        return ResponseEntity.ok(service.getAllDepartments());
    }
}
