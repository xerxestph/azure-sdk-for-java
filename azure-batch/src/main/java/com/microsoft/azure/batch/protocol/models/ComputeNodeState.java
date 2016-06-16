/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeState.
 */
public enum ComputeNodeState {
    /** Enum value idle. */
    IDLE("idle"),

    /** Enum value rebooting. */
    REBOOTING("rebooting"),

    /** Enum value reimaging. */
    REIMAGING("reimaging"),

    /** Enum value running. */
    RUNNING("running"),

    /** Enum value unusable. */
    UNUSABLE("unusable"),

    /** Enum value creating. */
    CREATING("creating"),

    /** Enum value starting. */
    STARTING("starting"),

    /** Enum value waitingforstarttask. */
    WAITINGFORSTARTTASK("waitingforstarttask"),

    /** Enum value starttaskfailed. */
    STARTTASKFAILED("starttaskfailed"),

    /** Enum value unknown. */
    UNKNOWN("unknown"),

    /** Enum value leavingpool. */
    LEAVINGPOOL("leavingpool"),

    /** Enum value offline. */
    OFFLINE("offline");

    /** The actual serialized value for a ComputeNodeState instance. */
    private String value;

    ComputeNodeState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ComputeNodeState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeState object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeState fromString(String value) {
        ComputeNodeState[] items = ComputeNodeState.values();
        for (ComputeNodeState item : items) {
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
