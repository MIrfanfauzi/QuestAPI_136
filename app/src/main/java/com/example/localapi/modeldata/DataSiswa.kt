package com.example.localapi.modeldata

import kotlinx.serialization.Serializable

@Serializable
data class Siswa(
    val id: String,
    val nama: String,
    val alamat: String,
    val telpon: String
)

data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)



