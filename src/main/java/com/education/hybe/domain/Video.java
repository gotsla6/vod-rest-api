package com.education.hybe.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tbl_video")
public class Video implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value="Video Id")
    private Integer id;

    @ApiModelProperty(value="Chapter Id")
    private Integer chapterId;

    @ApiModelProperty(value="Video Name")
    private String name;

    @ApiModelProperty(value="Video Description")
    private String description;

    @ApiModelProperty(value="Video Tags")
    private String tags;

    @ApiModelProperty(value="Video Identifier")
    private String identifier;

}


