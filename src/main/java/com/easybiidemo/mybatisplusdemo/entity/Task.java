package com.easybiidemo.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 跟进任务表
 * </p>
 *
 * @author linyu902
 * @since 2021-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Task对象", description="跟进任务表")
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业ID")
    private Integer companyId;

    @ApiModelProperty(value = "联系人ID")
    private Integer contactId;

    @ApiModelProperty(value = "所属人ID")
    private Integer owenId;

    @ApiModelProperty(value = "跟进内容")
    private String taskNote;

    @ApiModelProperty(value = "跟进阶段")
    private Integer taskType;

    @ApiModelProperty(value = "状态 0为未完成 1为已完成")
    private Integer status;

    @ApiModelProperty(value = "联系时间")
    private Date contactTime;

    @ApiModelProperty(value = "完成时间")
    private Date finishTime;

    @ApiModelProperty(value = "删除标记")
    @TableLogic
    private Integer isDelete;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "修改人ID")
    private Integer updateId;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人ID")
    private Integer creatorId;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "是否强制，0代表否，1代表是")
    private Integer isCompel;

    @ApiModelProperty(value = "强制开始时间")
    private Date compelStartTime;

    @ApiModelProperty(value = "强制结束时间")
    private Date compelEndTime;

    @ApiModelProperty(value = "延期次数")
    private Integer delayCount;

    @ApiModelProperty(value = "下载链接")
    private String url;

    @ApiModelProperty(value = "是否重要")
    private Integer isImporant;


}
