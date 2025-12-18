package com.example.localapi.repositori

import com.example.localapi.apiservice.ServiceApiSiswa
import com.example.localapi.modeldata.DataSiswa

interface RepositoriDataSiswa{
    suspend fun getSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void>

//    suspend fun getSatuSiswa(id: Int): DataSiswa
//    suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): retrofit2.Response<Void>
//    suspend fun hapusSatuSiswa(id: Int): retrofit2.Response<Void>
}

