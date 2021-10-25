/**
 */
package scheduler;

import org.eclipse.emf.ecore.EObject;

public interface Dao<T> {
	void delete(T obj);

	T get(int id);
} // Dao
