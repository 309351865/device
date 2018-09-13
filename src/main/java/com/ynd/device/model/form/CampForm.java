package com.ynd.device.model.form;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by ZhuRui on 2018/2/8.
 */
public class CampForm {


    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date startDate;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date endDate;

}
