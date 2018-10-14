package com.amcjt.sell.form;

import lombok.Data;

/**
 * @author jbhim
 * @date 2018/6/10/010.
 */
@Data
public class CategoryForm {
    private Integer categoryId;
    /**类目名字*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;
}
