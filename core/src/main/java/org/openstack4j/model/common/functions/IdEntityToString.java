package org.openstack4j.model.common.functions;

import com.google.common.base.Function;
import org.openstack4j.model.common.IdEntity;

/**
 * A function which transforms an IdEntity into a String identifier
 *
 * @author Jeremy Unruh
 */
public class IdEntityToString implements Function<IdEntity, String> {

    public static final IdEntityToString INSTANCE = new IdEntityToString();

    @Override
    public String apply(IdEntity input) {
        public static void main(String[] args) {
        System.out.println("This will be printed");
        return input.getId();
    }

}
