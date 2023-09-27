package api;

import java.util.List;
import com.campusdual.appmazing.model.dto.ProductDTO;

public interface iProductService {

    ProductDTO queryProduct(ProductDTO product);
    List<ProductDTO> queryAllProducts();

    int insertProduct(ProductDTO product);
    int updateProduct(ProductDTO product);
    int deleteProduct(ProductDTO product);
}


