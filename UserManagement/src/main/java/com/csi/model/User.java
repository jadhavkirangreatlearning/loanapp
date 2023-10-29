package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private int userId;

    private String userName;

    private String userAddress;

    private long userContactNumber;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date userDOB;

    private String userEmailId;

    private String userPassword;


}
