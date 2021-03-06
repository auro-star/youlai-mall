package com.youlai.admin.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.youlai.common.core.base.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MenuVO extends BaseEntity {

    private Integer id;

    private String name;

    private Integer parentId;

    private Integer type;

    private String path;

    private String icon;

    private Integer sort;

    private Integer visible;

    private Integer status;

    private List<MenuVO> children;

}
