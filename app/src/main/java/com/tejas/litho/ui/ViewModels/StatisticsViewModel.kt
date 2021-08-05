package com.tejas.litho.ui.ViewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.tejas.litho.repositories.MainRepositories

class StatisticsViewModel @ViewModelInject constructor(

    val mainRepositories: MainRepositories
):ViewModel() {
}