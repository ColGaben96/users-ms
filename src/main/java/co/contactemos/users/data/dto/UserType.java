package co.contactemos.users.data.dto;

import co.contactemos.users.data.constants.UserTypeConstants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@Table(name = UserTypeConstants.TABLE_NAME)
public class UserType {
    @Column(name = UserTypeConstants.COL_ID)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = UserTypeConstants.COL_NAME)
    private String name;
}
