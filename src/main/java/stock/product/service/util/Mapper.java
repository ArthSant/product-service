package stock.product.service.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapper {
    private final ModelMapper modelMapper = new ModelMapper();


    public <S,T> T map(S source,Class<T> targetCLass) {
        return modelMapper.map(source,targetCLass);
    }

    public <S,T> List<T> mapList(List<S> sources,Class<T> targetClass) {
        return sources.stream().map(source -> modelMapper.map(source,targetClass)).toList();
    }

}
