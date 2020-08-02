/**
 * 
 */
package in.ankitpathak.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.ankitpathak.onlinebookstore.entity.BookCategory;

/**
 * @author Ankit.Pathak
 *
 */
@RepositoryRestResource(collectionResourceRel="BookCategory",path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
