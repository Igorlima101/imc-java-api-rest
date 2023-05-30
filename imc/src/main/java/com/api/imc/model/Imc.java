package com.api.imc.model;

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
    @Column(name = "EMPCODE_IMC")
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

    @Column(name = "RESULTDATE_IMC")
    private LocalDateTime resultDateImc = LocalDateTime.now();

    @Column(name = "IDOPERATOR_IMC")
    private Integer idOperator;

    @Column(name = "ALTERATIONDATE_IMC")
    private Date alterationDate;

    @Column(name = "DELETIONDATE_IMC")
    private Date deletionDate;


}
