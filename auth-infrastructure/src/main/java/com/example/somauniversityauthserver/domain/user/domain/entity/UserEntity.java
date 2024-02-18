package com.example.somauniversityauthserver.domain.user.domain.entity;

import com.example.somauniversityauthserver.domain.global.BaseIdEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@SuperBuilder
@Table(name = "tbl_user")
@Entity
public class UserEntity extends BaseIdEntity {

    @Column(columnDefinition = "VARCHAR(15)", nullable = false, unique = true)
    private String accountId;

    @Column(columnDefinition = "CHAR(256)", nullable = false)
    private String password;

    @Column(columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String email;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true)
    private String nickName;

    //TODO: Enum타입 School Column 추가
}
