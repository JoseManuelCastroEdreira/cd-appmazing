package service;

import com.campusdual.appmazing.api.iContactService;
import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dao.ContactDao;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.dtomapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    public List<ContactDTO> queryAllProducts() {
        return ContactMapper.INSTANCE.toDTOList(this.contactDao.findAll());
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
    public int deleteContact(ContactDTO contactDTO) {
        int id = contactDTO.getId();
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        this.contactDao.delete(contact);
        return id;
    }
}