package kr.co.clozet.board.repositories;

import kr.co.clozet.board.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName:kr.co.clozet.repositories
 * fileName        :BoardRepository.java
 * author          : sungsuhan
 * date            :2022-05-04
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-04           sungsuhan      최초 생성
 **/
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
