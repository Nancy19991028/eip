/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.ehm.test;

import com.kingland.ehm.sender.ConsoleSender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsoleSenderTest {

    @Test
    void testSend() {
        // Given
        ConsoleSender cds = new ConsoleSender();
        String str = "test string";
        // When
        boolean result = cds.send(str);
        // Then
        assertTrue(result);
    }

}
