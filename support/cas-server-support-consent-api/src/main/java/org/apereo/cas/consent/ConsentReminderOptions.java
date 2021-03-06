package org.apereo.cas.consent;

import java.util.Arrays;

/**
 * This is {@link ConsentReminderOptions}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
public enum ConsentReminderOptions {
    /** Always ask for consent. */
    ALWAYS(0),
    /** Always ask for consent. */
    ATTRIBUTE_NAME(1),
    /** Always ask for consent. */
    ATTRIBUTE_VALUE(2);

    private final int value;

    ConsentReminderOptions(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * Value of consent options.
     *
     * @param value the value
     * @return the consent options
     */
    public static ConsentReminderOptions valueOf(final int value) {
        final var option = Arrays.stream(values())
                .filter(v -> v.getValue() == value)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
        return option;
    }
}
