package tum.test.dao;

import com.blogspot.nurkiewicz.jdbcrepository.JdbcRepository;
import com.blogspot.nurkiewicz.jdbcrepository.RowUnmapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 */

@Repository
public class CommentRepository extends JdbcRepository<Comment, Integer> {

    public CommentRepository() {
        super(ROW_MAPPER, ROW_UNMAPPER, "COMMENTS");
    }

    public static final RowMapper<Comment> ROW_MAPPER = //see below

    private static final RowUnmapper<Comment> ROW_UNMAPPER = //see below

    @Override
    protected Comment postCreate(Comment entity, Number generatedId) {
        entity.setId(generatedId.intValue());
        return entity;
    }
}
