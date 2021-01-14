package suwaaaa.author.springboot_redis.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final User user = new User();

    /**
     * Database Column Remarks:
     *   �û�ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.userId")
    public static final SqlColumn<Integer> userId = user.userId;

    /**
     * Database Column Remarks:
     *   �û�����
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.age")
    public static final SqlColumn<Integer> age = user.age;

    /**
     * Database Column Remarks:
     *   �û�����
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.name")
    public static final SqlColumn<String> name = user.name;

    /**
     * Database Column Remarks:
     *   �û���ַ
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.address")
    public static final SqlColumn<String> address = user.address;

    /**
     * Database Column Remarks:
     *   �û�����
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.passcode")
    public static final SqlColumn<String> passcode = user.passcode;

    /**
     * Database Column Remarks:
     *   �û��ֻ���
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.phone")
    public static final SqlColumn<Integer> phone = user.phone;

    /**
     * Database Column Remarks:
     *   �û�����
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.mail")
    public static final SqlColumn<String> mail = user.mail;

    /**
     * Database Column Remarks:
     *   �û�vip
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: user.vip")
    public static final SqlColumn<Boolean> vip = user.vip;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> userId = column("userId", JDBCType.INTEGER);

        public final SqlColumn<Integer> age = column("age", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.CHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> passcode = column("passcode", JDBCType.VARCHAR);

        public final SqlColumn<Integer> phone = column("phone", JDBCType.INTEGER);

        public final SqlColumn<String> mail = column("mail", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> vip = column("vip", JDBCType.BIT);

        public User() {
            super("user");
        }
    }
}