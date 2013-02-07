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

    public static final RowMapper<Comment> ROW_MAPPER = new RowMapper<Comment>() {

        @Override
        public Comment mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Comment(
                    rs.getInt("id"),
                    rs.getString("user_name"),
                    rs.getString("contents"),
                    rs.getTimestamp("created_time")
            );
        }
    };

    private static final RowUnmapper<Comment> ROW_UNMAPPER = new RowUnmapper<Comment>() {
        @Override
        public Map<String, Object> mapColumns(Comment comment) {
            Map<String, Object> mapping = new LinkedHashMap<String, Object>();
            mapping.put("id", comment.getId());
            mapping.put("user_name", comment.getUserName());
            mapping.put("contents", comment.getContents());
            mapping.put("created_time", new java.sql.Timestamp(comment.getCreatedTime().getTime()));
            return mapping;
        }
    };

    @Override
    protected Comment postCreate(Comment entity, Number generatedId) {
        entity.setId(generatedId.intValue());
        return entity;
    }
}
