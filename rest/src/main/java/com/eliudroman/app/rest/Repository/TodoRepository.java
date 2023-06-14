package com.eliudroman.app.rest.Repository;

import com.eliudroman.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {
}
