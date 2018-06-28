package org.suspnp.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Index;
import javax.persistence.Table;

/**
 * Created by lianhai on 2018/6/28.
 */
@Getter
@Setter
@ToString
@SQLDelete(sql = "update tenant_info set deleted = 1 where id = ?")
@Where(clause = "deleted = 0")
@Table(name = "sys_users",
        indexes = {
                @Index(name = "IDX_USER_NAME_KEY", columnList = "deleted,username")
        }
)
public class User {
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
}
