package com.campusdual.appmazing.api;

import java.util.List;

import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dto.ContactDTO;

public interface iContactService {

    ContactDTO queryProduct(Contact product);
    List<ContactDTO> queryAllProducts();

    int insertProduct(ContactDTO product);
    int updateProduct(ContactDTO product);
    int deleteProduct(ContactDTO product);
}
