package epicode.u5d4.DAO;

import epicode.u5d4.exeptions.ItemNotFoundException;
import epicode.u5d4.superclass.Item;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ItemService {

    @Autowired
    private ItemDAO  itemDAO;


    public void saveItem(Item newItem){
        itemDAO.save(newItem);
        System.out.println("item saved");
    }

    public Item findById(int id) throws ItemNotFoundException{
        return  itemDAO.findById(id).orElseThrow(()->new ItemNotFoundException(id));
    }

    public List<Item> findAll(){return itemDAO.findAll();}
}
