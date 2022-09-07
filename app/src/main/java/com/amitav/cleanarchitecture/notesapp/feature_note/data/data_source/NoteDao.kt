package com.amitav.cleanarchitecture.notesapp.feature_note.data.data_source

import androidx.room.*
import com.amitav.cleanarchitecture.notesapp.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Query("Select * from note")
    fun getNotes() : Flow<List<Note>>

    @Query("Select * from note where id = :id")
    suspend fun getNoteById(id: Int) : Note?

    @Delete
    suspend fun deleteNote(note: Note)
}