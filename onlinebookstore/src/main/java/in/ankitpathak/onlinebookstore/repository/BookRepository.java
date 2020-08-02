/**
 * 
 */
package in.ankitpathak.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankitpathak.onlinebookstore.entity.Book;

/**
 * @author Ankit.Pathak
 *
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
