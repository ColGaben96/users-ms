package co.contactemos.users.data.dto;

import co.contactemos.users.data.constants.UserConstants;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;

@Entity
@Data
@Table(name = UserConstants.TABLE_NAME)
public class User {
    @Column(name = UserConstants.COL_ID)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = UserConstants.COL_GIVEN_NAMES)
    private String given_names;
    @Column(name = UserConstants.COL_LAST_NAMES)
    private String last_names;
    @Column(name = UserConstants.COL_EMAIL)
    private String email;
    @Column(name = UserConstants.COL_IDENTIFICATION_TYPE)
    private long identification_type;
    @Column(name = UserConstants.COL_IDENTIFICATION_NUMBER)
    private String identification_number;
    @Column(name = UserConstants.COL_USER_TYPE)
    private long user_type;
    @Column(name = UserConstants.COL_CITY)
    private long city;
    @Column(name = UserConstants.COL_ADDRESS)
    private String address;
    @Column(name = UserConstants.COL_PHONE_NUMBER)
    private String phone_number;
    @Column(name = UserConstants.COL_PROFILEPIC_PATH)
    private String profilepic_path;
    @Column(name = UserConstants.COL_CREATED_ON)
    private Date created_on;
    @Column(name = UserConstants.COL_BIRTHDAY)
    private Date birthday;
}
