package com.campusdual.appmazing.api;

import java.util.List;

import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;

public interface iContactService {

    ContactDTO queryProduct(ContactDTO contactDTO);

    ContactDTO queryProduct(Contact product);
    List<ContactDTO> queryAllProducts();

    int insertProduct(ContactDTO product);

    int insertContact(ContactDTO contactDTO);

    int updateProduct(ContactDTO product);
    int deleteProduct(ContactDTO product);

    int deleteContact(ContactDTO contactDTO);

    List<ContactDTO> queryAllContacts();

    ContactDTO queryContact(ContactDTO contact);
}
