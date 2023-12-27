package com.example.buildapi.repository

import com.example.buildapi.model.Kontak
import com.example.buildapi.network.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
): KontakRepository{
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}