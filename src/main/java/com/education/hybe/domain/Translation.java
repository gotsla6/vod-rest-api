package com.education.hybe.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "tbl_translation")
public class Translation {
    @Id
    @JoinColumn(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;

    private Integer translated_id;

    private String key;

    private String value;

    private String lang;


}
