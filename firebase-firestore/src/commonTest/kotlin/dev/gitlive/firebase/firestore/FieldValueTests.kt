package dev.gitlive.firebase.firestore

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class FieldValueTests {
    @Test
    fun equalityChecks() = runTest {
        assertEquals(FieldValue.delete, FieldValue.delete)
        assertEquals(FieldValue.serverTimestamp, FieldValue.serverTimestamp)
        assertNotEquals(FieldValue.delete, FieldValue.serverTimestamp)
        // Note: arrayUnion and arrayRemove can't be checked due to vararg to array conversion
    }
}
