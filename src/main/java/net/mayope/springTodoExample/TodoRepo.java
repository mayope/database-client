package net.mayope.springTodoExample;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

public interface TodoRepo extends JpaRepository<TodoEntry, UUID> {

}
