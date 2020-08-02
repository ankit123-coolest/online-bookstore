/**
 * 
 */
package in.ankitpathak.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.ankitpathak.onlinebookstore.entity.Book;

/**
 * @author Ankit.Pathak
 *
 */

@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
