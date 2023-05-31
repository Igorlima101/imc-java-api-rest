package com.api.imc.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.Date;

@Getter
@Setter
@Entity()
@Table(name = "TB_IMC")
public class Imc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMC")
    private Integer id;

    @Column(name = "EMPLOYEECODE_IMC")
    private Integer employeeCode;

    @Column(name = "NAME_IMC")
    private String name;

    @Column(name = "AGE_IMC")
    private Integer age;

    @Column(name = "GENDER_IMC")
    private String gender;

    @Column(name = "WEIGHT_IMC")
    private BigDecimal weight;

    @Column(name = "HEIGHT_IMC")
    private BigDecimal height;

    @Column(name = "RESULT_IMC")
    private BigDecimal resultImc;

    @Column(name = "RESULTDESC_IMC")
    private String resultDescriptionImc;


    // JSonFormat is necessary for ajust format of dateTime, is just copy your format on postman... example: "30/05/2023 00:00:00" with space after number 3
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "RESULTDATE_IMC")
    private LocalDateTime resultDateImc = LocalDateTime.now();

    @Column(name = "IDOPERATOR_IMC")
    private Integer idOperator;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "ALTERATIONDATE_IMC")
    private Date alterationDate;


    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "DELETIONDATE_IMC")
    private Date deletionDate;


}
