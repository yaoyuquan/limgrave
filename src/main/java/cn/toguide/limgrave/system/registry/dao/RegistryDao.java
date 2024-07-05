package cn.toguide.limgrave.system.registry.dao;

import cn.toguide.limgrave.system.registry.entity.AccountQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RegistryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String QUERY_ACCOUNT_SQL = """
            select count(1)
            from sys_account
            where email = ?
            """;

    public Long count(AccountQuery query) {
        return jdbcTemplate.queryForObject(QUERY_ACCOUNT_SQL, Long.class, query.email());
    }
}
