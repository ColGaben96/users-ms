package co.contactemos.users.data.dto;

import co.contactemos.users.data.constants.IDTypeConstants;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
@Table(name = IDTypeConstants.TABLE_NAME)
public class IDType {
    @Column(name = IDTypeConstants.COL_ID)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = IDTypeConstants.COL_NAME)
    private String name;
    @Column(name = IDTypeConstants.COL_INITIALS)
    private String initials;
}
