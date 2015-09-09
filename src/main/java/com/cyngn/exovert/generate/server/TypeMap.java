package com.cyngn.exovert.generate.server;

import com.squareup.javapoet.TypeName;

/**
 * Defines the mapping of types defined in api configuration json to
 * {@link TypeName}
 *
 * @author asarda@cyngn.com (Ajay Sarda) on 9/8/15.
 */
public interface TypeMap {

    /**
     * Gets the {@link TypeMap} object for the {@code type}
     *
     * {@code type} could be primitive types (Integer, Boolean), reference types (String)
     * or user defined types (MyType)
     *
     * TODO: support collections
     *
     * @param type - type string
     * @return
     */
    TypeName getTypeName(String type);

    /**
     * Registers the type and its type name with TypeMap.
     *
     * This can be used by callers to register any custom types and classes and use it
     *
     * @param type - type string
     * @param typeName - type name
     */
    void registerType(String type, TypeName typeName);

    /**
     * Returns the default implementation of {@link TypeMap}
     *
     * @return
     */
    static TypeMap create() {
        return new TypeMapImpl();
    }
}
