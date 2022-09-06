package com.shop.dto;

import com.shop.constant.Category;
import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemSearchDto {

    private String searchDateType;

    private ItemSellStatus searchSellStatus;

    private Category searchCategory;

    private String searchBy;

    private String searchQuery = "";
}
