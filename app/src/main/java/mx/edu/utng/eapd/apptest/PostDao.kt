package mx.edu.utng.eapd.apptest

import androidx.room.*
@Dao
interface PostDao {
    @Query("SELECT * FROM posts ORDER BY id DESC")
    suspend fun getAll(): List<PostEntity>
    @Insert
    suspend fun insert(post: PostEntity)
    @Delete
    suspend fun delete(post: PostEntity)
}