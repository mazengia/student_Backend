package com.maze.student.Semisters;

import com.maze.student._config.util.Auditable;
import lombok.Data;

@Data
public class SemestersDto extends Auditable {
    private Long id;
    private String name;
}
