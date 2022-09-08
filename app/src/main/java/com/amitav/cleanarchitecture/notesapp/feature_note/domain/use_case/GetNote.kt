package com.amitav.cleanarchitecture.notesapp.feature_note.domain.use_case

import com.amitav.cleanarchitecture.notesapp.feature_note.domain.model.Note
import com.amitav.cleanarchitecture.notesapp.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(
        id: Int
    ): Note? {
        return repository.getNoteById(id)
    }
}