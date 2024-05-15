package com.bfc.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.bfc.artbooktesting.model.ImageResponse
import com.bfc.artbooktesting.roomdb.Art
import com.bfc.artbooktesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}