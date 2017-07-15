package cn.edu.xmu.yeahbuddy.domain.repo;

import cn.edu.xmu.yeahbuddy.domain.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;
import java.util.Optional;

public interface TutorRepository extends JpaRepository<Tutor, Integer> {
    Optional<Tutor> findByUsername(String username);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Optional<Tutor> queryById(int id);
}
