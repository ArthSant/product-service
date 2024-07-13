package stock.product.service.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    private final ModelMapper modelMapper = new ModelMapper();


    public <S,T> T map(S source,Class<T> targetCLass) {
        return modelMapper.map(source,targetCLass);
    }

}
