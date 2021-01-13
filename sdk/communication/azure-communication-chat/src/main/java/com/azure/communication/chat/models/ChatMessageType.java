// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.chat.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ChatMessageType. */
public final class ChatMessageType extends ExpandableStringEnum<ChatMessageType> {
    /** Static value text for ChatMessageType. */
    public static final ChatMessageType TEXT = fromString("text");

    /** Static value html for ChatMessageType. */
    public static final ChatMessageType HTML = fromString("html");

    /** Static value topicUpdated for ChatMessageType. */
    public static final ChatMessageType TOPIC_UPDATED = fromString("topicUpdated");

    /** Static value participantAdded for ChatMessageType. */
    public static final ChatMessageType PARTICIPANT_ADDED = fromString("participantAdded");

    /** Static value participantRemoved for ChatMessageType. */
    public static final ChatMessageType PARTICIPANT_REMOVED = fromString("participantRemoved");

    /**
     * Creates or finds a ChatMessageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ChatMessageType.
     */
    @JsonCreator
    public static ChatMessageType fromString(String name) {
        return fromString(name, ChatMessageType.class);
    }

    /** @return known ChatMessageType values. */
    public static Collection<ChatMessageType> values() {
        return values(ChatMessageType.class);
    }
}
