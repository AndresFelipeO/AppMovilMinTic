package com.example.turistic

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private var lugarList=MutableLiveData<List<LugarTuristico>>()
    private var apiService=RetrofitFactory.apiService()

    init {
        requestLugarService()
    }

    fun getLigares(): LiveData<List<LugarTuristico>> =lugarList

    private fun requestLugarService(){
        viewModelScope.launch {
            lugarList.value = apiService.resquestSitios()
        }

    }
}