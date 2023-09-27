package com.campusdual.appmazing.api;

import java.util.List;
import com.campusdual.appmazing.model.dto.ProductDTO;

public interface iProductService {

    ProductDTO queryProduct(ProductDTO productDTO);
    List<ProductDTO> queryAllProducts();

    int insertProduct(ProductDTO productDTO);
    int updateProduct(ProductDTO productDTO);
    int deleteProduct(ProductDTO productDTO);
}


