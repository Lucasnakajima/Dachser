package SSCC.DACHSER;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing SSCCRecord entities.
 * This interface extends JpaRepository to provide CRUD operations for SSCCRecord.
 */
@Repository
public interface SSCCValidationRepository extends JpaRepository<SSCCRecord, Long> {
}
