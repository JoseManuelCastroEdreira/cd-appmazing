package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.iContactService;
import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.Product;
import com.campusdual.appmazing.model.dao.ContactDao;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.ProductDTO;
import com.campusdual.appmazing.model.dto.dtomapper.ContactMapper;
import com.campusdual.appmazing.model.dto.dtomapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ContactService")
@Lazy
public class ContactService implements iContactService {

    @Autowired
    private ContactDao contactDao;

    @Override
    public ContactDTO queryProduct(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        Contact contactFinal = this.contactDao.getReferenceById(contact.getId());
        ContactDTO dto = ContactMapper.INSTANCE.toDTO(contactFinal);
        return null;
    }

    @Override
    public ContactDTO queryProduct(Contact product) {
        return null;
    }

    @Override
    public List<ContactDTO> queryAllProducts() {
        return ContactMapper.INSTANCE.toDTOList(this.contactDao.findAll());
    }

    @Override
    public int insertProduct(ContactDTO product) {
        return 0;
    }

    @Override
    public int insertContact(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        this.contactDao.saveAndFlush(contact);
        return contact.getId();
    }

    @Override
    public int updateProduct(ContactDTO contactDTO) {
        return this.insertContact(contactDTO);
    }

    @Override
    public int deleteProduct(ContactDTO product) {
        return 0;
    }

    @Override
    public int deleteContact(ContactDTO contactDTO) {
        int id = contactDTO.getId();
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        this.contactDao.delete(contact);
        return id;
    }

    @Override
    public List<ContactDTO> queryAllContacts() {
            return ContactMapper.INSTANCE.toDTOList(this.contactDao.findAll());
        };

    @Override
    public ContactDTO queryContact(ContactDTO contactDTO) {;
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        Contact contactFinal = this.contactDao.getReferenceById(contact.getId());
        return ContactMapper.INSTANCE.toDTO(contactFinal);
    }
}