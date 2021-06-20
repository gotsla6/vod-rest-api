package com.education.hybe.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tbl_chapter")
public class Chapter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(position = 1, value="Chapter Id")
    private Integer id;

    @ApiModelProperty(position = 2, value = "Package Id")
    private Integer packageId;

    @ApiModelProperty(value="Chapter name")
    private String name;

    @ApiModelProperty(value="Chapter description")
    private String description;

    @ApiModelProperty(value="Chapter tags")
    private String tags;


}
