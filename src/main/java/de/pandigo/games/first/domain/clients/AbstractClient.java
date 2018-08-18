package de.pandigo.games.first.domain.clients;

import java.util.HashMap;
import java.util.Map;

/**
 * Common methods shared by different REST clients.
 */
public abstract class AbstractClient {

    /**
     * Method for simplifying the creation of a map as the parameter for the id of an entity.
     *
     * @param idName The name of the parameter
     * @param id     The value of the parameter
     * @return A map containing the idName as the key and the id as the value
     */
    protected Map<String, Long> idAsMap(final String idName, final Long id) {
        final var map = new HashMap<String, Long>();
        map.put(idName, id);
        return map;
    }
}
