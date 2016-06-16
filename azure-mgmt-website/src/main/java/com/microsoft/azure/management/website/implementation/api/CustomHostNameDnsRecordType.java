/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CustomHostNameDnsRecordType.
 */
public enum CustomHostNameDnsRecordType {
    /** Enum value CName. */
    CNAME("CName"),

    /** Enum value A. */
    A("A");

    /** The actual serialized value for a CustomHostNameDnsRecordType instance. */
    private String value;

    CustomHostNameDnsRecordType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CustomHostNameDnsRecordType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CustomHostNameDnsRecordType object, or null if unable to parse.
     */
    @JsonCreator
    public static CustomHostNameDnsRecordType fromString(String value) {
        CustomHostNameDnsRecordType[] items = CustomHostNameDnsRecordType.values();
        for (CustomHostNameDnsRecordType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
