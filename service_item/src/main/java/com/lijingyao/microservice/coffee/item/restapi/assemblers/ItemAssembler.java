package com.lijingyao.microservice.coffee.item.restapi.assemblers;

import com.lijingyao.microservice.coffee.item.persistence.entity.Category;
import com.lijingyao.microservice.coffee.item.persistence.entity.ItemInfo;
import com.lijingyao.microservice.coffee.template.items.ItemCreateDTO;
import com.lijingyao.microservice.coffee.template.items.ItemDTO;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by lijingyao on 2018/7/8 22:31.
 */
@Component
public class ItemAssembler {

    private BeanCopier itemCreateCopier = BeanCopier.create(ItemCreateDTO.class, ItemInfo.class, false);
    private BeanCopier itemDTOCopier = BeanCopier.create(ItemInfo.class, ItemDTO.class, false);

    public Optional<ItemInfo> assembleItemInfo(ItemCreateDTO createDTO) {
        if (null == createDTO) return Optional.empty();

        ItemInfo info = new ItemInfo();
        itemCreateCopier.copy(createDTO, info, null);
        return Optional.of(info);
    }


    public ItemDTO assembleItemDTO(ItemInfo itemInfo, Category category) {
        ItemDTO itemDTO = wrapItem(itemInfo);
        itemDTO.setCatName(category.getSimpleName());

        return itemDTO;
    }

    private ItemDTO wrapItem(ItemInfo itemInfo) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTOCopier.copy(itemInfo, itemDTO, null);

        itemDTO.setItemId(itemInfo.getId());
        return itemDTO;
    }

    public ItemDTO assembleItemDTO(ItemInfo itemInfo) {
        ItemDTO itemDTO = wrapItem(itemInfo);
        return itemDTO;
    }
}
