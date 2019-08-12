package com.glossary.glossary.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@RequiredArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PUBLIC,force = false)
@Table(name = "wordsBook")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "rus")
    private String rus;

    @NotNull
    @Column(name = "eng")
    private String eng;

}
