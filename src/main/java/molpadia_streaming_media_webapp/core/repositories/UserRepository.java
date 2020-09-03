package molpadia_streaming_media_webapp.core.repositories;

import molpadia_streaming_media_webapp.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
