package com.family

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "PERSON", schema = "FAMILY")
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSON_SEQ")
    @SequenceGenerator(sequenceName = "FAMILY.SQ_PERSON", schema = "FAMILY", allocationSize = 1,
            name = "PERSON_SEQ")
    Long id
    @Column(name = "FIRSTNAME")
    String firstname
    @Column(name = "MIDDLENAME")
    String middlename
    @Column(name = "LASTNAME")
    String lastname
    @Column(name = "GENDER")
    String gender
    @Column(name = "DATEOFBIRTH")
    Date dateofbirth
    @Column(name = "OTHERDETAILS")
    String otherdetails
}
