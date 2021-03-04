package com.easybiidemo.mybatisplusdemo.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: czs
 * @Date: 2021-03-04 14:02
 * @ClassName: com.easybiidemo.mybatisplusdemo.param.BasicParam
 * @Description:
 */
@Data
public class BasicParam {

    @ApiModelProperty(value = "页码")
    private Integer page;

    @ApiModelProperty(value = "每页条数")
    private Integer size;
}
