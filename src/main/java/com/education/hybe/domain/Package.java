package com.education.hybe.domain;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "tbl_package")
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="Package Id")
    private Integer id;

    @ApiModelProperty(value="Package Name")
    private String packageName;

    @ApiModelProperty(value="Package Description")
    private String packageDescription;

}
